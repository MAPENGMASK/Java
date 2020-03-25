package datastructure;

import static org.junit.jupiter.api.Assertions.*;

class ThreadedBinaryTreeTest {
    public static void main(String[] args) {
        ThreadedNode root = new ThreadedNode(1);

        ThreadedNode left = new ThreadedNode(2);

        ThreadedNode right = new ThreadedNode(3);

        ThreadedBinaryTree tree = new ThreadedBinaryTree();

        tree.setRoot(root);

        root.setLeftNode(left);
        root.setRightNode(right);

        left.setLeftNode(new ThreadedNode(4));
        left.setRightNode(new ThreadedNode(5));

        right.setLeftNode(new ThreadedNode(6));
        right.setRightNode(new ThreadedNode(7));

        tree.midThread(root);
        tree.threadIterate();

    }

}