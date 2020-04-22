package DesignPatterns;

/**
 * 懒汉式 延时加载
 * 线程安全
 */
public class SingletonTwo {
    private static SingletonTwo instance;

    private SingletonTwo(){}

    //同步方法
    public static synchronized SingletonTwo getInstance(){
        if (instance == null)
            instance = new SingletonTwo();
        return instance;
    }
}
