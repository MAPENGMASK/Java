package datastructure;

public class ThreadedBinaryTree {
    ThreadedNode root;

    //存储前驱节点
    ThreadedNode pre = null;

    public void setRoot(ThreadedNode root) {
        this.root = root;
    }
    //遍历
    public void threadIterate(){
        ThreadedNode node = root;
        while (node != null){
            while (node.leftType == 0){
                node = node.leftNode;
            }
            System.out.println(node.value);

            while (node.rightType == 1){
                node = node.rightNode;
                System.out.println(node.value);
            }

            node = node.rightNode;
        }
    }

    //中序线索化
    public void midThread(ThreadedNode node){
        if (node == null)
            return;
        //left
        midThread(node.leftNode);
        if (node.leftNode == null){
            node.leftNode = pre;
            node.leftType = 1;
        }
        if (pre != null && pre.rightNode == null){
            pre.rightNode = node;
            pre.rightType = 1;
        }
        pre = node;
        //right
        midThread(node.rightNode);
    }

    public ThreadedNode getRoot() {
        return root;
    }

}
