package datastructure.huffman;

import java.io.*;
import java.util.*;

/**
 * @author Administrator
 */
public class HuffmanCode {
    //临时存储01编码
    static StringBuilder stringBuilder = new StringBuilder();
    //编码表
    static Map<Byte, String> EncodingTable = new HashMap<>();

    /**
     * 使用指定编码表进行解码
     * @param newBytes 解码字节数组
     * @param encodingTable 编码表
     * @return 解码字节数组
     */
    private static byte[] decode(byte[] newBytes, Map<Byte, String> encodingTable) {
        StringBuilder sb = new StringBuilder();
        //byte -> String
        for (int i = 0; i < newBytes.length; i++){
            byte b = newBytes[i];
            boolean flag = (i == newBytes.length - 1);
            sb.append(byteToBitStr(!flag, b));
        }
        //键值绝对调换
        Map<String, Byte> map = new HashMap<>();
        for (Map.Entry<Byte, String> entry:encodingTable.entrySet())
            map.put(entry.getValue(),entry.getKey());
        //创建集合存储byte数组
        List<Byte> list = new ArrayList<>();
        //处理字符串
        for (int i = 0; i < sb.length();){
            int count = 1;
            boolean flag = true;
            Byte b = null;
            //截取一个byte
            while (flag){
                String key = sb.substring(i, i + count);
                b = map.get(key);
                if (b == null)
                    count++;
                else
                    flag = false;
            }
            list.add(b);
            i += count;
        }
        //decode
        byte[] result = new byte[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }

    /**
     * byte 转 8位二进制
     * @param b
     * @return 8位二进制字符串
     */
    private static String byteToBitStr(boolean flag,byte b){
        int temp = b;
        if (flag)
            temp |= 256;
        String str = Integer.toBinaryString(temp);
        if (flag)
            return str.substring(str.length() - 8);
        else
            return str;
    }

    /**
     * 霍夫曼编码
     * @param bytes 未压缩的编码
     * @return result 压缩后的编码
     */
    public static byte[] huffmanZip(byte[] bytes){
        //统计字符并计数+叶子结点列表
        List<Node> nodes = getNodes(bytes);
        //创建霍夫曼树
        Node tree = createHuffmanTree(nodes);
        //创建霍夫曼编码表
        Map<Byte,String> HuffmanTable = getEcondingTable(tree);
        //编码
        byte[] result = Zip(bytes, HuffmanTable);

        return result;
    }

    /**
     * 根据编码表 进行编码压缩
     * @param bytes 目标字节码
     * @param HuffmanTable 编码表
     * @return result 结果字节码
     */
    private static byte[] Zip(byte[] bytes, Map<Byte, String> HuffmanTable) {
        StringBuilder sb = new StringBuilder();
        for (byte b:bytes)
            sb.append(HuffmanTable.get(b));
        //length
        int len;
        if (sb.length() % 8 == 0)
            len = sb.length() / 8;
        else
            len = sb.length() / 8 + 1;
        //save zip byte
        byte[] result = new byte[len];
        int index = 0;
        for (int i = 0; i < sb.length(); i+=8){
            String str;
            if (i + 8 >sb.length())
                str = sb.substring(i);
            else
                str = sb.substring(i, i + 8);
            byte byt = (byte)Integer.parseInt(str, 2);
            result[index] = byt;
            index++;
        }
        return result;
    }


    /**
     * 根据霍夫曼树获得编码
     * @param tree HuffmanTree
     * @return EncodingTable 编码表
     */
    private static Map<Byte, String> getEcondingTable(Node tree) {
        if (tree == null)
            return null;
        getCodes(tree.left, "0", stringBuilder);
        getCodes(tree.right, "1", stringBuilder);
        return EncodingTable;
    }

    /**
     * 递归遍历
     * @param node 当前节点
     * @param code 01
     * @param sb 路线存储
     */
    private static void getCodes(Node node, String code, StringBuilder sb) {
        StringBuilder temp = new StringBuilder(sb);
        temp.append(code);
        if (node.data == null){
            getCodes(node.left, "0", temp);
            getCodes(node.right, "1", temp);
        } else {
            EncodingTable.put(node.data, temp.toString());
        }
    }

    /**
     * 获得字符排序集合
     * @param bytes 字节数组
     * @return nodes 字节节点列表
     */
    public static List<Node> getNodes(byte[] bytes){
        List<Node> nodes = new ArrayList<>();

        Map<Byte, Integer> counts = new HashMap<>();
        //统计
        for (byte b:bytes){
            Integer count = counts.get(b);
            if (count == null){
                counts.put(b, 1);
            }else {
                counts.put(b, count + 1);
            }
        }
        for (Map.Entry<Byte, Integer> entry:counts.entrySet()){
            nodes.add(new Node(entry.getKey(),entry.getValue()));
        }
        return nodes;
    }

    /**
     * 创建HuffmanTree
     * @param nodes 叶子节点列表
     * @return root 根节点
     */
    public static Node createHuffmanTree(List<Node> nodes){
        while (nodes.size() > 1){
            //sort
            Collections.sort(nodes);
            //取出节点
            Node left = nodes.get(nodes.size() - 1);
            Node right = nodes.get(nodes.size() - 2);
            //合并+双亲节点
            Node parent = new Node(null,left.weight + right.weight);
            //add
            parent.left = left;
            parent.right = right;
            //remove
            nodes.remove(left);
            nodes.remove(right);
            //add
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    /**
     * 压缩文件
     * @param src 目标目录
     * @param dst 输出目录
     */
    public static  void  ZipFile(String src, String dst) throws IOException {
        InputStream is = new FileInputStream(src);
        byte[] b = new byte[is.available()];
        is.read(b);
        is.close();

        //编码
        byte[] huffmanZip = huffmanZip(b);
        //输出
        OutputStream os = new FileOutputStream(dst);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        oos.writeObject(huffmanZip);
        oos.writeObject(EncodingTable);
        oos.flush();
        oos.close();
        os.close();
    }

    /**
     * 解压 .HZip文件
     * @param src 目标文件
     * @param dst 解压后文件
     */
    public static void unZip(String src, String dst) throws Exception {
        InputStream is = new FileInputStream(src);
        ObjectInputStream ois = new ObjectInputStream(is);
        //读取byte数组
        byte[] b = (byte[])ois.readObject();
        //读取编码表
        Map<Byte, String> table = (Map<Byte, String>) ois.readObject();

        ois.close();
        is.close();

        //解码
        byte[] bytes = decode(b,table);
        //写出
        OutputStream os = new FileOutputStream(dst);

        os.write(bytes);

        os.close();
    }

    public static void main(String[] args) {
        String src = "F:\\GitRepository\\JavaBase\\src\\datastructure\\huffman\\encode.txt";
        String dst = "F:\\GitRepository\\JavaBase\\src\\datastructure\\huffman\\decode.HZip";
        try {
            ZipFile(src, dst);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = "F:\\GitRepository\\JavaBase\\src\\datastructure\\huffman\\result.txt";
        try {
            unZip(dst,result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
