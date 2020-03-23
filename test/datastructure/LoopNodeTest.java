package datastructure;

import static org.junit.jupiter.api.Assertions.*;

class LoopNodeTest {
    public static void main(String[] args) {
        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);
        LoopNode n3 = new LoopNode(3);

        n1.after(n2);
        n2.after(n3);

        System.out.println(n1.next().getData());
        System.out.println(n2.next().getData());
        System.out.println(n3.next().getData());


    }
}