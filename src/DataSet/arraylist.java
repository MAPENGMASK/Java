package DataSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("A");

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        list.remove("A");

        Iterator iterator = list.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("------");

        for (String s:list)
            System.out.println(s);
    }
}
