package datastructure;

import static org.junit.jupiter.api.Assertions.*;

class BanaryTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode lNode = new TreeNode(2);

        TreeNode rNode = new TreeNode(3);

        BanaryTree tree = new BanaryTree();
        tree.setRoot(root);

        root.setlNode(lNode);
        root.setrNode(rNode);

        lNode.setlNode(new TreeNode(4));
        lNode.setrNode(new TreeNode(5));

        rNode.setlNode(new TreeNode(6));
        rNode.setrNode(new TreeNode(7));

        //tree.frontShow();
        //tree.midShow();
        //tree.afterShow();
        //System.out.println(tree.afterSearch(5).value);
        tree.delet(5);
        System.out.println(".......................");
        tree.frontShow();
    }
}