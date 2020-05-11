package commonlyClass;

import java.util.Arrays;
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random1 = new Random();
        Random random2 = new Random(1);

        System.out.println(random1.nextBoolean());
        byte[] bytes = new byte[10];
        random2.nextBytes(bytes);
        System.out.println(Arrays.toString(bytes));

        System.out.println("-----");
        System.out.println(random1.nextInt());
        System.out.println(random1.nextDouble());

    }
}
