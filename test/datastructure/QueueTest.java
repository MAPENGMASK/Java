package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void add() {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.add(1);
        System.out.println(queue.isEmpty());
    }

    @Test
    void poll() {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    @Test
    void isEmpty() {
        Queue queue = new Queue();
        System.out.println(queue.elements.length);
        System.out.println(queue.isEmpty());

    }
}