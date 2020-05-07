package DataSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapAndHashtable {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"dd");
        map.put(4,"d");

        map.put(5,"e");
        map.remove(5);

        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("dd"));

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            int key = iterator.next();
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("----------");
        for (int temp:map.keySet())
            System.out.println(temp);




    }

}
