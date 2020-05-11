package commonlyClass;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    public static void main(String[] args) {
        //获得日历
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR) + " " + (calendar.get(Calendar.MONTH) + 1) + " " + calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " " + calendar.get(Calendar.MINUTE) + " " + calendar.get(Calendar.SECOND));

        System.out.println(calendar.getTime());

        calendar.set(2020,4,4,12,34,55);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.MONTH,30);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.YEAR,2000);
        calendar.add(Calendar.YEAR,20);
        System.out.println(calendar.getTime());
        //Date -- Calendar
        Date date = calendar.getTime();

        calendar.setTime(date);

    }
}
