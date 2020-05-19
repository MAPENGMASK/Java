package reflect;

public class LoadDifference {
    public static void main(String[] args) {
        ClassLoader classLoader = Robot.class.getClassLoader();
        try {
            classLoader.loadClass("reflect.Robot");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Class c = Class.forName("reflect.Robot");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
