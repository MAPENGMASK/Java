package DesignPatterns;

/**
 * 单例模式
 * 饿汉式 自动创建对象
 * 线程安全
 */
public class SingletonOne {
    private static SingletonOne instance = new SingletonOne();

    private SingletonOne(){}

    public static SingletonOne getInstance(){
        return instance;
    }
}
