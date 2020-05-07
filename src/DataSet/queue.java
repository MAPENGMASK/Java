package DataSet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("一");
        queue.offer("二");
        queue.offer("三");

        for (String tmp:queue) {
            System.out.println(tmp);
        }

        System.out.println("-------------");
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println("-------------");
        for (String tmp:queue) {
            System.out.println(tmp);
        }


    }
}
