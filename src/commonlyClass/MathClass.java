package commonlyClass;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.toDegrees(Math.PI/4));
        System.out.println(Math.toRadians(90));

        //坐标转化
        System.out.println(Math.atan2(1,1));
        System.out.println(Math.toDegrees(Math.atan2(1,1)));

        //取整
        System.out.println("向下：" + Math.floor(0.3));
        System.out.println("向上：" + Math.ceil(0.3));
        System.out.println("四舍五入：" + Math.round(0.3));

        //乘方，开方，指数，绝对值，log
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.cbrt(27));

        System.out.println(Math.log(Math.E));
        System.out.println(Math.log10(100));

        System.out.println(Math.abs(-0.3));

        //min max random
        System.out.println(Math.max(33,34));
        System.out.println(Math.min(33,34));

        System.out.println(Math.random());


    }
}
