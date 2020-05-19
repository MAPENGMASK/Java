package GC;

import java.lang.ref.ReferenceQueue;

public class Finalization {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();

    }

    public static void main(String[] args) {
        System.gc();
    }
}
