package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 7, 8, 29, 5, 11, 23, 14};
        HuffmanNode root = createHuffmanTree(arr);

        System.out.println(root);
    }
    public static HuffmanNode createHuffmanTree(int[] arr){
        //先创建若干个节点
        List<HuffmanNode> nodes = new ArrayList<>();
        for (int value:arr)
            nodes.add(new HuffmanNode(value));

        while (nodes.size() > 1){
            //sort
            Collections.sort(nodes);
            //取出最小两个节点
            HuffmanNode left = nodes.get(nodes.size() - 1);
            HuffmanNode right = nodes.get(nodes.size() - 2);
            //创建新的二叉树
            HuffmanNode parent = new HuffmanNode(left.value + right.value);
            parent.left = left;
            parent.right = right;
            //移除取出的两个节点
            nodes.remove(left);
            nodes.remove(right);
            //放入原来二叉树
            nodes.add(parent);
        }
        return nodes.get(0);
    }
}
