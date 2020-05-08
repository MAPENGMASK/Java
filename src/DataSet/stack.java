package DataSet;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //vector 实现 线程安全
        Stack<String> stringStack = new Stack<>();
        stringStack.push("a");
        stringStack.push("b");
        stringStack.push("c");

        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());

        //LinkList 实现 stack
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("aaa");
        linkedList.push("bbb");
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());


    }
}
