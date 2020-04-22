package DesignPatterns;

/**
 * 静态内部类
 * 调用效率高
 */
public class SingletonThree {
    private static class Singleton{
        private static SingletonThree instance = new SingletonThree();
    }

    private SingletonThree(){}

    public static SingletonThree getInstance(){
        return Singleton.instance;
    }
}
