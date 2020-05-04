package interfaces;

import java.util.*;

/**
 * 比较接口：comparator
 * compara(x,x)接口
 *
 */
public class ListComparator {
    public static void main(String[] args) {
        List<PersonComparator> persons = new ArrayList<PersonComparator>();
        persons.add(new PersonComparator("A",35));
        persons.add(new PersonComparator("B",25));
        persons.add(new PersonComparator("C",22));

        Collections.sort(persons, new Comparator<PersonComparator>() {
            @Override
            public int compare(PersonComparator o1, PersonComparator o2) {
                if (o1.getAge() != o2.getAge())
                    return o1.getAge() - o2.getAge();
                else
                    return o1.getName().compareTo(o2.getName());
            }
        });

        Iterator<PersonComparator> iterator = persons.iterator();
        while (iterator.hasNext()){
            PersonComparator temp = iterator.next();
            System.out.println(temp.getName()+"\t"+temp.getAge());
        }
    }
}
class PersonComparator {
    private int age;
    private String name;

    public PersonComparator(){

    }

    public PersonComparator(String name,int age){
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
}