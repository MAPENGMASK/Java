package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获取类对象
        Class rc = Class.forName("reflect.Robot");
        System.out.println("class name is   " + rc.getName());
        //创建实例
        Robot robot = (Robot) rc.newInstance();

        //获取所有方法，除继承的方法
        Method hello = rc.getDeclaredMethod("hello",String.class);
        //设置是否调用私有方法
        hello.setAccessible(true);

        Object object = hello.invoke(robot,"test");
        System.out.println("私有方法 hello 方法调用： " + object);
        //获取public方法
        Method sayHi = rc.getMethod("sayHi", String.class);
        //调用
        sayHi.invoke(robot,"很高兴见到你");

        //私有属性调用
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot,"zhangsan");

        sayHi.invoke(robot,"大家好");

    }
}
