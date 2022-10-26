package Тимофей_Коваленко_JavaCourse;
import java.util.*;

public class Testing {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt(), b = scr.nextInt(), c = scr.nextInt();
        System.out.println("sum = " + sum(a, b, c));
    }

    public static int sum(int a, int b, int c) {
        int x;
        x = a + b + c;
        return x;
    }


}
