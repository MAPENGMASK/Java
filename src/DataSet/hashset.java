package DataSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 数组无序集合
 * 线程不安全
 */
public class hashset {
    public static void main(String[] args) {
        Set<String> stringSet = Collections.synchronizedSet(new HashSet<>());
        stringSet.add("A");
        stringSet.add("A");
        stringSet.add(null);
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("a");

        System.out.println(stringSet.contains(null));
        System.out.println(stringSet.toString());
        System.out.println(stringSet.toArray());
        System.out.println(stringSet.hashCode());

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
