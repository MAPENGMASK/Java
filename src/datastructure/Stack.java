package datastructure;

public class Stack {
    public int[] elements;

    public Stack(){
        elements = new int[0];
    }
    //push
    public void push(int element){
        int[] newarr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++)
            newarr[i] = elements[i];
        newarr[elements.length] = element;
        elements = newarr;
    }
    //pop
    public int pop(){
        if (elements.length == 0)
            throw new RuntimeException("stack is empty");
        int element = elements[elements.length - 1];
        int[] newarr = new int[elements.length - 1];
        for(int i = 0; i < elements.length - 1; i++)
            newarr[i] = elements[i];
        elements = newarr;
        return element;
    }
    //peek
    public int show(){
        return elements[elements.length - 1];
    }
}
