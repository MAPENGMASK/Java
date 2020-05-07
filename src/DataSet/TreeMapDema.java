package DataSet;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDema {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap = new TreeMap<>();

        treeMap.put("tom","one");
        treeMap.put("jack","two");
        treeMap.put("ami","tree");

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.lastKey());
        System.out.println("-------");

        System.out.println(treeMap.higherEntry("jack"));
        System.out.println(treeMap.higherKey("jack"));
        System.out.println(treeMap.lowerEntry("jack"));
        System.out.println(treeMap.lowerKey("jack"));

        System.out.println("-----------------");
        Map<String,String> one = treeMap.headMap("jack");
        System.out.println(one);
        System.out.println(treeMap.subMap("ami","tom"));
        System.out.println(treeMap.tailMap("jack"));

    }
}
