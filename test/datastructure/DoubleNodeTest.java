package datastructure;

import static org.junit.jupiter.api.Assertions.*;

class DoubleNodeTest {
    public static void main(String[] args) {
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);

        n1.after(n2);
        n2.after(n3);

        System.out.println(n1.getData());
        System.out.println(n1.getPre().getData());
        System.out.println(n1.getNext().getData());

    }
}