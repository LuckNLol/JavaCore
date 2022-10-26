package Тимофей_Коваленко_JavaCourse;
import java.util.regex.*;

public class HW1 {
    public static void main(String[] args) {
// patr 1
        String text = "Ученье свет!";
        String text1 = text.substring(0, 6);
        String text2 = text.substring(7, 12);

        System.out.println(text.length());
        System.out.println(text1 + " " + text1.length());
        System.out.println(text2 + " " + text2.length());
//part 2
        int x = 5;
        int rezult = x % 10;
        if (rezult == 7) {
            System.out.println("В числе последняя цифра = " + rezult);
        } else {
            System.out.println("В числе последняя цифра != 7; " + " " + rezult);
        }
// part 3
        int summRub = 1005;
        int lastDigit = summRub % 10;
        if (lastDigit == 0 || lastDigit >= 5 && lastDigit <=9) {
            System.out.println("У меня есть: " + summRub + " рублей");
        } else if (lastDigit == 1) {
            System.out.println("У меня есть: " + summRub + " рубль");
        } else if (lastDigit >= 2 && lastDigit <=4) {
            System.out.println("У меня есть: " + summRub + " рубля");
        } else {
            System.out.println("чешу репу");
        }
// part 4

        String str = "Ты # точно крутой! Правда?".replaceAll("\\?", " HELLO");
        str = str.replace('#', ' ');
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);

// part 5

        int X = 5;
        int t = 3;
        int S = 4;
        double y = (Math.sin(Math.pow(X, t) * Math.sin(Math.pow(X, t))))/(Math.sqrt(1 + Math.pow(X, S)));
        System.out.println("y = " + y);

    }
}

