package commonlyClass;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("java");
        stringBuilder.append(123);
        stringBuilder.append('a');
        stringBuilder.append(2.3);
        char[] chars = new char[]{'c','c','c'};
        stringBuilder.append(chars);

        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder);
        //insert
        System.out.println(stringBuilder.insert(0,"JAVA"));

        System.out.println(stringBuilder.replace(0,3,"jjjjjjjj"));

        System.out.println(stringBuilder.delete(0,7));

        System.out.println(stringBuilder.reverse());

        System.out.println(stringBuilder.capacity());

        stringBuilder.setLength(5);

        System.out.println(stringBuilder.toString());


    }
}
