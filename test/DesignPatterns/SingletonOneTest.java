package DesignPatterns;

import static org.junit.jupiter.api.Assertions.*;

class SingletonOneTest {
    public static void main(String[] args) {
        SingletonOne test = SingletonOne.getInstance();
        System.out.println(test.getClass().getName());
    }

}