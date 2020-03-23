package datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        Stack stack = new Stack();
        stack.push(3);
        System.out.println(stack.pop());
    }

    @Test
    void pop() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        for (int tmp:stack.elements)
            System.out.println(tmp);
    }
    @Test
    public int show(){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.show());

        return stack.show();
    }
}