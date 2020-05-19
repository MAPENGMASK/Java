package reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * 验证 MyClassLoader
 */
public class ClassLoaderCheck {
    public static void main(String[] args) {
        MyClassLoader m = new MyClassLoader("F:\\GitRepository\\JavaBase\\src\\ByteCodeSample\\","MyClassLoader");
        try {

            Class c = m.loadClass("ByteCodeSample");
            System.out.println(c.getClassLoader());
            c.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
