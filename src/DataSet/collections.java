package DataSet;

import java.util.*;

public class collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.toString());
        Collections.reverse(list);
        System.out.println(list.toString());

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("sort: " + list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });
        System.out.println("逆序:" + list);

        System.out.println(list.size());
        Collections.swap(list,0,4);
        System.out.println("swap:" + list);

        Collections.rotate(list,2);
        System.out.println(list);

        System.out.println("-----------------------------------");
        System.out.println(Collections.max(list));
        Set<String> stringSet = new HashSet<>();
        stringSet.add("a");
        stringSet.add("b");
        System.out.println(Collections.min(list));
        System.out.println(Collections.min(stringSet));

        Collections.replaceAll(list,2,4);
        System.out.println(list);

        System.out.println("count:" + Collections.frequency(list,4));

        //binarySearch
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,5));
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);

        System.out.println("----" + list);
        System.out.println(Collections.indexOfSubList(list,list1));


        Collections.fill(list,0);
        System.out.println(list);


    }
}
