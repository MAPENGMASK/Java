package datastructure;

public class DoubleNode {
    DoubleNode pre = this;
    DoubleNode next = this;
    int data;
    public DoubleNode(int data){
        this.data = data;
    }
    //增加节点
    public void after(DoubleNode doubleNode){
        DoubleNode temp = next;

        this.next = doubleNode;
        doubleNode.pre = this;

        doubleNode.next = temp;
        temp.pre = doubleNode;
    }
    //获取下一个节点
    public DoubleNode getNext(){
        return this.next;
    }
    //获取上一个节点
    public DoubleNode getPre(){
        return this.pre;
    }
    //获得数据
    public int getData(){
        return data;
    }
}
