package datastructure.huffman;

public class Node implements Comparable<Node>{
    int weight;
    Node left;
    Node right;
    //字符
    Byte data;
    public Node(Byte data, int weight){
        this.weight = weight;
        this.data = data;
    }

    @Override
    public int compareTo(Node o) {
        return o.weight - this.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "weight=" + weight +
                ", left=" + left +
                ", right=" + right +
                ", data=" + data +
                '}';
    }
}
