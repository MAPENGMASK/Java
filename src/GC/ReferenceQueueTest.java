package GC;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ReferenceQueueTest {
    private static ReferenceQueue<NormalObject> rq = new ReferenceQueue<>();
    private static void checkQueue(){
        Reference<NormalObject> ref = null;
        while ((ref = (Reference<NormalObject>)rq.poll()) != null){
            if (ref != null){
                System.out.println("in queue " + ((NormalObjectWeakReference)(ref)).name);
                System.out.println("reference " + ref.get());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<WeakReference<NormalObject>> weakReferenceArrayList = new ArrayList<WeakReference<NormalObject>>();
        for (int i = 0; i < 3; i++){
            weakReferenceArrayList.add(new NormalObjectWeakReference(new NormalObject("weak" + i),rq));
            System.out.println(weakReferenceArrayList.get(i));
        }
        System.out.println("first time");
        checkQueue();
        System.gc();
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("second time");
        checkQueue();
    }
}
