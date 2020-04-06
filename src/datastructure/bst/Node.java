package datastructure.bst;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }
    //添加节点
    public void add(Node node){
        if (node == null)
            return;
        //判断与当前节点大小
        if (node.value < this.value){
            //判断左节点是否为空
            if (this.left == null)
            {
                this.left = node;
            } else{
                this.left.add(node);
            }
        } else {
            if (this.right == null)
                this.right = node;
            else
                this.right.add(node);
        }
    }
    //中序遍历
    public void midShow(Node node){
        if (node == null)
            return;

        midShow(node.left);
        System.out.println(node.value);
        midShow(node.right);
    }
    //search
    public Node search(int value){
        if (this.value == value)
            return this;
        else if (value < this.value){
            if (left == null)
                return null;
            return left.search(value);
        } else{
            if (right == null)
                return null;
            return right.search(value);
        }
    }
    //find parent node
    public Node searchParent(int value){
        if ((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value))
            return this;
        else {
            if (this.value > value && this.left != null){
                return this.left.searchParent(value);
            }else if (this.value < value && this.right != null){
                return this.right.searchParent(value);
            }
            return null;
        }
    }
}
