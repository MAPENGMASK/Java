package datastructure;

public class Queue {
    public int[] elements;

    public Queue(){
        elements = new int[0];
    }
    //入队
    public void add(int element){
        int[] newarr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++)
            newarr[i] = elements[i];
        newarr[elements.length] = element;
        elements = newarr;
    }
    //出队
    public int poll(){
        int element = elements[0];
        int[] newarr = new int[elements.length - 1];
        for (int i = 0; i <newarr.length; i++)
            newarr[i] = elements[i + 1];
        elements = newarr;
        return element;
    }
    //判断是否为空
    public boolean isEmpty(){
        return elements.length == 0;
    }
}
