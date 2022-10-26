package Lesson3;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber_20_4_4 {
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        int randInt;
        randInt = rand.nextInt(20) + 1; /* Верхний предел игровой области от 0 до указ. значения */
        System.out.println(randInt);


        while (true) {
            System.out.print("Введите ваше число: ");
            int myInput = scr.nextInt();

            if (myInput == randInt) {
                System.out.println("Отлично, вы угадали число!");
                break;
            } else if (myInput > randInt) {
                System.out.println("Ваше число больше случайного, попробуйте еще:");
                //scr.next();
            } else {
                System.out.println("Ваше число меньше случайного, попробуйте еще:");
                //scr.next();
            }
        }
    }
}






