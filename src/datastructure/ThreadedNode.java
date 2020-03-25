package datastructure;

public class ThreadedNode {
    int value;
    ThreadedNode leftNode;
    ThreadedNode rightNode;
    //标识
    int leftType;
    int rightType;

    public ThreadedNode(int value){
        this.value = value;
    }

    public void setLeftNode(ThreadedNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(ThreadedNode rightNode) {
        this.rightNode = rightNode;
    }
}
