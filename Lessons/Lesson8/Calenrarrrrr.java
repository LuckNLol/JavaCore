package Lesson8;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calenrarrrrr {
    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss");

        System.out.println("Сейчас " + dateFormat.format(calendar.getTime()));
    }

}
