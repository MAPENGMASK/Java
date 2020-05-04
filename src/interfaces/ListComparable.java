package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 排序接口：comparable
 * 实现comparaTo方法
 */
public class ListComparable {
    public static void main(String[] args) {
        List<PersonComparable> persons = new ArrayList<PersonComparable>();
        persons.add(new PersonComparable("A",35));
        persons.add(new PersonComparable("B",25));
        persons.add(new PersonComparable("C",22));

        Collections.sort(persons);

        Iterator<PersonComparable> iterator = persons.iterator();
        while (iterator.hasNext()){
            PersonComparable temp = iterator.next();
            System.out.println(temp.getName()+"\t"+temp.getAge());
        }

    }
}

class PersonComparable implements Comparable<PersonComparable>{
    private int age;
    private String name;

    public PersonComparable(){

    }

    public PersonComparable(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(PersonComparable o) {
        //从小到大 this - o
        //从大到小 o - this
        if (this.age != o.age){
            return this.age - o.age;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
