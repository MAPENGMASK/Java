package datastructure;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(new Node(2));
        head.append(new Node(3));
        System.out.println(head.getData());
        System.out.println(head.next().getData());
        System.out.println(head.next().next().getData());
        System.out.println(head.next().next().islast());
        head.show();
        head.removeNext();
        head.show();
        System.out.println();
        head.after(new Node(5));
        head.show();
    }
}