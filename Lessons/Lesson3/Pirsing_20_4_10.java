package Lesson3;

import java.util.Scanner;

public class Pirsing_20_4_10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ваш возраст?");
        int age = scr.nextInt();

        if (age <= 14) {
            System.out.println("прокол ушей в присутствии родителей");
        } else if (age > 14 && age < 18) {
            System.out.println("прокол ушей, пупка, языка, носа в присутствии родителей");
        } else {
            System.out.println("без ограничений");
        }

    }
}
