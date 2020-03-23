package datastructure;

public class LoopNode {
    //节点内容
    int data;
    //下一节点
    LoopNode next = this;

    public LoopNode(int data){
        this.data = data;
    }
    //插入一个节点
    public void after(LoopNode node){
        LoopNode nextNode = next;
        this.next = node;
        node.next = nextNode;
    }
    //删除节点
    public void removeNext(){
        LoopNode newNode = next.next();
        this.next = newNode;
    }
    //获得下一节点
    public LoopNode next(){
        return this.next;
    }
    //获取节点中的数据
    public int getData(){
        return this.data;
    }
}
