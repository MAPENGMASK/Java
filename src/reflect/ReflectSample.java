package reflect;

import commonlyClass.StringBuild;

import java.lang.reflect.*;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获取类对象
        //知道类路径
        Class<?> rc = Class.forName("reflect.Robot");
        //明确类
        Class<?> class1 = Robot.class;
        //有对象实例的情况
        Class<?> class2 = new Robot().getClass();
        System.out.println("class name is   " + rc.getName());
        //创建实例 需有无参构造函数
        Robot robot = (Robot) rc.getDeclaredConstructor().newInstance();

        robot.sayHi("公有方法可以调用");

        //获取所有权限的，特定方法，除继承的方法，方法 + 参数
        Method hello = rc.getDeclaredMethod("hello",String.class);
        //设置是否调用私有方法
        hello.setAccessible(true);

        Object object = hello.invoke(robot,"私有方法调用+getdeclaredMethod");
        //获取公有特定方法
        Method sayHi = rc.getMethod("sayHi", String.class);
        //调用
        sayHi.invoke(robot,"getMethod");

        //私有属性调用
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot,"zhangsan");

        sayHi.invoke(robot,"getDeclaredField");

        //构造器获取
        System.out.println("--------------------------------");
        Constructor<?>[] constructors = rc.getDeclaredConstructors();
        for (Constructor<?> constructor:constructors){
            StringBuilder builder = new StringBuilder();
            builder.append("\t" + Modifier.toString(constructor.getModifiers()));
            builder.append(" " + constructor.getName() + "(");
            Class<?>[] types = constructor.getParameterTypes();
            for (Class<?> type :types){
                builder.append(type.getSimpleName());
            }
            builder.append(")");
            System.out.println(builder.toString());
        }
        System.out.println("............................................");
        //获取方法
        Method[] methods = rc.getMethods();
        for (Method method:methods){
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\t" + Modifier.toString(method.getModifiers()) + "\t");
            stringBuffer.append(method.getName() + "(");
            Class<?>[] methodnames = method.getParameterTypes();
            for (Class<?> methodname :methodnames){
                stringBuffer.append(methodname.getSimpleName());
            }
            stringBuffer.append(")");
            System.out.println(stringBuffer.toString());
        }
        //获取属性
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        Field[] fields = rc.getDeclaredFields();
        for (Field field:fields){
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\t" + Modifier.toString(field.getModifiers()) + " ");
            stringBuffer.append(field.getType().getSimpleName() + " ");
            stringBuffer.append(field.getName());
            System.out.println(stringBuffer.toString());
        }
        System.out.println("-----------------------------------");


    }
}
