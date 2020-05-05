package DataSet;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 已排序集合
 * 支持comparable 和 comparator
 * 线程不安全
 * 红黑树
 */
public class treeset {
    public static void main(String[] args) {
        Set<String> set = Collections.synchronizedSet(new TreeSet<>());
        set.add("B");
        set.add("D");
        set.add("A");
        set.add("E");
        set.add("C");
        set.add("A");

        System.out.println(set.toString());

        for (String string:set)
            System.out.println(string);

        System.out.println("size:" + set.size());
    }
}
