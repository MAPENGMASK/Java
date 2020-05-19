package JVM.model;

/**
 * 演示 StackOverflowError
 * 原因：递归深度过深，栈帧数超过虚拟机栈深度
 * 解决方法：限制递归深度，或改为循环
 *
 * 异常：OutOfMemoryError 虚拟机栈过多引发
 */
public class Fibonacci {
    public static int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
//        System.out.println(fibonacci(0));
//        System.out.println(fibonacci(1));
//        System.out.println(fibonacci(2));
//        System.out.println(fibonacci(3));
//        System.out.println(fibonacci(4));

        System.out.println(fibonacci(100000000));

    }
}
