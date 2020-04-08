package datastructure.hash;

import java.util.Arrays;

public class HashTable {
    public StudentInfo[] data = new StudentInfo[50];

    //散列表中添加元素
    public void put(StudentInfo studentInfo){
        data[studentInfo.hashCode()] = studentInfo;
    }

    //散列表中取元素
    public StudentInfo get(StudentInfo studentInfo){
        return data[studentInfo.hashCode()];
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
