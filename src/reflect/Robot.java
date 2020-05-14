package reflect;

public class Robot {
    private String name;
    //公有，私有方法
    public void sayHi(String sentence){
        System.out.println(name + " " + sentence);
    }
    private String hello(String tag){
        return  tag;
    }
    static {
        System.out.println("静态代码块");
    }
}
