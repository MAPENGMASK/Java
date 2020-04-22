package DesignPatterns;

/**
 * 枚举类
 */
public class SingletonFour {
    private SingletonFour(){}

    //枚举类
    private static enum Singleton{
        instance;
        private SingletonFour singletonFour;

        private Singleton(){
            singletonFour = new SingletonFour();
        }
        public SingletonFour getInstance(){
            return singletonFour;
        }
    }

    public static SingletonFour getInstance(){
        return Singleton.instance.getInstance();
    }
}
