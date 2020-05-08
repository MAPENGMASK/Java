package DataSet;

import java.util.Comparator;
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

        TreeMap<Persion,String> sort = new TreeMap<Persion, String>(new Comparator<Persion>() {
            @Override
            public int compare(Persion o1, Persion o2) {
                if (o1.getAge() != o2.getAge())
                    return o1.getAge() - o2.getAge();
                else
                    return o1.getName().compareTo(o2.getName());
            }
        });

    }
}
class Persion{
    private int age;
    private String name;

    public Persion(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class human implements Comparable<human>{
    private int age;
    private String name;

    public human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(human o) {
        if (this.getAge() != o.getAge())
            return this.getAge() - o.getAge();
        else
            return this.getName().compareTo(o.getName());
    }
}
