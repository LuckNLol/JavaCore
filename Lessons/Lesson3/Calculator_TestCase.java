package Lesson3;

import java.util.Scanner;

public class Calculator_TestCase {
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("[Для отмены, нажмите 'c']");
        //System.out.println("[Для выхода из программы, нажмите 'q']");
        System.out.println();

        double x = getOperand();
        char operator = getOperator();
        double y = getOperand();
        double resultData = calculation(x, operator, y);
        System.out.println("Результат: " + resultData);

    }

    public static double getOperand() {
        System.out.println("Введите число: ");
        double num;
        if (scr.hasNextInt()) {
            num = scr.nextInt();
        } else {
            System.out.println("Введите целое число!");
            scr.next();
            num = getOperand();
        }
        return num;
    }

    public static char getOperator() {
        System.out.println("Введите операцию: +, -, *, / ");
        char operator;
        if (scr.hasNext()) {
            operator = scr.next().charAt(0);
        } else {
            System.out.println("Ошибка! Введите один из операторов (+, -, *, /)");
            scr.next();
            operator = getOperator();
        }
        return operator;
    }

    public static double calculation(double x, char operator, double y) {
        double resultData;
        switch (operator) {
            case '+':
                resultData = x + y;
                break;
            case '-':
                resultData = x - y;
                break;
            case '*':
                resultData = x * y;
                break;
            case '/':
                resultData = x / y;
                break;
            default:
                System.out.println("Ошибка! Воспользуйтесь операторами: +, -, *, /");
                //scr.next();
                resultData = calculation(x, getOperator(), y);
        }
        return resultData;
    }
}

