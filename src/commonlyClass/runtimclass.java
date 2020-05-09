package commonlyClass;

import java.io.IOException;

public class runtimclass {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("可用处理器数量：" + runtime.availableProcessors());
        System.out.println("虚拟机内存总量：" + runtime.totalMemory()/1024/1024);
        System.out.println("空闲内存量：" + runtime.freeMemory()/1024/1024);
        System.out.println("试图使用的最大内存量：" + runtime.maxMemory()/1024/1024);

        try {
            runtime.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }

        runtime.gc();

        runtime.exit(0);


    }
}
