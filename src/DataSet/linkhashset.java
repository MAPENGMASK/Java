package DataSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 链表有序集合
 */
public class linkhashset {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();

        stringSet.add("A");
        stringSet.add("A");
        stringSet.add(null);
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("a");


        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
