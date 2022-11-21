package Lesson8;

import java.util.Calendar;
import java.util.Date;

public class Count {
    public static void main(String[] args) {
        int a = -5;
        int b = 2;
        double c = Math.hypot(a, b);
        System.out.println(c);
        System.out.println(Math.pow(a, b));
        System.out.println(Math.abs(a));

        Date date = new Date();
        System.out.println(date);

        long time = System.currentTimeMillis();
        System.out.println(time);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
    }
}
