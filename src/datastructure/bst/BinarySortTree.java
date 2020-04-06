package datastructure.bst;

import javafx.scene.chart.ValueAxis;

public class BinarySortTree {
    Node root;

    public void add(Node node){
        if (root == null){
            root = node;
        }else {
            root.add(node);
        }
    }
    //中序遍历
    public void midShow(){
        if (root != null)
            root.midShow(root);
    }
    //查找
    public Node search(int value){
        if (root == null)
            return null;
        else
            return root.search(value);
    }
    //delete node
    public void delete(int value){
        if (root == null)
            return;
        else {
            //find node
            Node target = search(value);
            if (target == null)
                return;
            //find parent node
            Node parent = searchParent(value);
            //delete
            if (target.left == null && target.right == null) {
                if (parent.left.value == value){
                    parent.left = null;
                }else {
                    parent.right = null;
                }
            //双孩子
            }else if (target.left != null && target.right != null){
                //delete the best small node
                int min = deleteMin(target.right);
                target.value = min;

            }else {
                //单孩子
                if (target.left != null){
                    if (parent.left.value == value)
                        parent.left = target.left;
                    else
                        parent.right = target.left;
                }else {
                    if (parent.left.value == value)
                        parent.left = target.right;
                    else
                        parent.right = target.right;
                }
            }
        }
    }

    //删除最小节点
    private int deleteMin(Node node) {
        Node target = node;
        while (target.left != null){
            target = target.left;
        }
        //delete min node
        delete(target.value);
        return target.value;
    }

    //find parent node
    public Node searchParent(int value){
        if (root == null)
            return null;
        else {
            return root.searchParent(value);
        }
    }
}
