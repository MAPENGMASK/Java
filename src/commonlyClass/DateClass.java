package commonlyClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateClass {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());

        System.out.println(date1.toString());

        Long temp = date1.getTime();

        System.out.println(date1.compareTo(date2));

        date2.setTime(temp+10000);

        System.out.println(date1.compareTo(date2));

        System.out.println("-----------------");
        System.out.println(date1.before(date2));
        System.out.println(date1.after(date2));
        System.out.println(date1.equals(date2));

        System.out.println("-----------------");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String data1String = simpleDateFormat.format(date1);
        System.out.println("data1:" + data1String);

        try {
            Date tmp = simpleDateFormat.parse(data1String);

            System.out.println(tmp.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
