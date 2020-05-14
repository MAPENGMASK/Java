package reflect;

import java.io.*;

public class MyClassLoader extends ClassLoader {
    private String path;
    private String classLoaderName;

    public MyClassLoader(String path, String classLoaderName){
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    //用于寻找类文件
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassData(name);
        //defineClass 加载二进制class文件流
        return defineClass(name,b,0,b.length);
    }

    //加载类文件
    private byte[] loadClassData(String name){
        //全路径
        name = path + name + ".class";
        InputStream in = null;

        ByteArrayOutputStream Out = null;
        try {
            in = new FileInputStream(new File(name));
            Out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1){
                Out.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Out.toByteArray();
    }
}
