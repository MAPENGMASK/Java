package GC;

public class NormalObject {
    public String name;
    public NormalObject(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalizing obj");
    }
}
