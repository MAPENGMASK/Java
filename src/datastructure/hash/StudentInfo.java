package datastructure.hash;

import java.util.Objects;

public class StudentInfo {
    private int age;
    private int count;

    public StudentInfo() {
    }

    public StudentInfo(int age, int count) {
        this.age = age;
        this.count = count;
    }

    //散列函数
    @Override
    public int hashCode() {
        //直接定值法
        return age;
        //取余法
        //return age % 10;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
