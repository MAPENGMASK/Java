package commonlyClass;

import java.math.BigDecimal;

public class BigDecimalClass {
    public static void main(String[] args) {
        //精度丢失
        System.out.println("0.06 + 0.01 = " + (0.06 + 0.01));
        System.out.println("1.0 ‐ 0.38 = " + (1.0 - 0.33));
        System.out.println("4.015 * 100 = " + (4.015 * 100));
        System.out.println("1123.3 / 100 = " + (1123.3 / 100));
        System.out.println("--------------------------------");
        BigDecimal bigDecimal1 = new BigDecimal("0.05");
        BigDecimal bigDecimal2 = new BigDecimal("0.05");
        BigDecimal bigDecimal3 = BigDecimal.valueOf(0.05);

        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);

        System.out.println("--------------------------------");
        System.out.println(bigDecimal1.add(bigDecimal3));
        System.out.println(bigDecimal1.subtract(bigDecimal3));
        System.out.println(bigDecimal1.multiply(bigDecimal3));

        System.out.println(bigDecimal1.divide(bigDecimal3));



        System.out.println(bigDecimal1.pow(3));

        System.out.println(bigDecimal1.compareTo(bigDecimal3));

        System.out.println("-------------------------");
        //System.out.println(bigDecimal1.byteValueExact());
        BigDecimal bigDecimal = BigDecimal.valueOf(-2);
        System.out.println(bigDecimal.byteValue());
        System.out.println(bigDecimal.byteValueExact());
        System.out.println(bigDecimal1.shortValue());

        System.out.println(bigDecimal1.intValue());
        System.out.println(bigDecimal.shortValueExact());

        System.out.println(bigDecimal.longValueExact());
        System.out.println(bigDecimal1.floatValue());
        System.out.println(bigDecimal.doubleValue());
        System.out.println(bigDecimal.floatValue());

        System.out.println(bigDecimal.toString().concat("wwwwww"));
        System.out.println(bigDecimal.intValueExact() + "wwwww dddd");



    }
}
