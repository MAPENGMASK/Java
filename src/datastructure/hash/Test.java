package datastructure.hash;

public class Test {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo(16,3);
        StudentInfo s2 = new StudentInfo(17,5);
        StudentInfo s3 = new StudentInfo(18,11);
        System.out.println(s3.hashCode());
        StudentInfo s4 = new StudentInfo(19,7);
        StudentInfo s5 = new StudentInfo(20,13);


        HashTable ht = new HashTable();
        ht.put(s1);
        ht.put(s2);
        ht.put(s3);
        ht.put(s4);
        ht.put(s5);
        System.out.println(ht);
        //System.out.println(ht.get(s3));

    }
}
