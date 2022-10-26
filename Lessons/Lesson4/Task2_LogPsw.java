package Lesson4;

import java.util.Scanner;

public class Task2_LogPsw {
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите логин: ");
        String log = scr.nextLine();
        System.out.print("Введите пароль: ");
        String psw = scr.nextLine();


        System.out.printf("%s," + " твой новый пароль: " + "%s" + ";", login(log), password(psw));
        System.out.println();
        System.out.println("Удачи, и да прибудет с вами сила!");
    }

    private static String login(String log) {
        return log;
    }

    private static String password(String psw) {
        if (psw.length() < 8 || psw.length() > 15) {
            do {
                System.out.println("Длина пароля должна быть 8-15 символов, введи заново пароль: ");
                psw = scr.next();
                //psw = password(psw);
            }
            while (psw.length() < 8 || psw.length() > 15);
        }
        return psw;
    }
}