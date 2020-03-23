package datastructure;

public class Node {
    //节点内容
    int data;
    //下一节点
    Node next;

    public Node(int data){
        this.data = data;
    }
    //为节点值追加节点
    public Node append(Node node){
        Node currentNode = this;
        while(true){
            Node nextNode = currentNode.next;
            if (nextNode == null)
                break;
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }
    //插入一个节点
    public void after(Node node){
        Node nextNode = next;
        this.next = node;
        node.next = nextNode;
    }
    //删除节点
    public void removeNext(){
        Node newNode = next.next();
        this.next = newNode;
    }
    //获得下一节点
    public Node next(){
        return this.next;
    }
    //获取节点中的数据
    public int getData(){
        return this.data;
    }
    //查看是否为最后一个节点
    public boolean islast(){
        return next == null;
    }
    //显示所有节点信息
    public void show(){
        Node currentNode = this;
        while (true){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next();
            if (currentNode == null)
                break;
        }
    }

}
