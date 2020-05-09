package commonlyClass;

import java.util.Map;
import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> env = System.getenv();
        for (String key:env.keySet())
            System.out.println(key + "-----" + env.get(key));
        System.out.println("JAVA_HOME:" + System.getenv("JAVA_HOME"));

        System.out.println("系统属性：" + System.getProperties());

        System.out.println("user.name" + System.getProperty("user.name"));

        //希望进行一次垃圾回收
        System.gc();

        //系统时间 返回1970年1月1日 的毫秒时间
        System.out.println(System.currentTimeMillis());

        System.exit(0);
        System.out.println("Don't exe");

    }
}
