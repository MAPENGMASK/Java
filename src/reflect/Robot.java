package reflect;

public class Robot {
    private String name;
    public void sayHi(String sentence){
        System.out.println(name + " " + sentence);
    }
    private String hello(String tag){
        return  tag;
    }
}
