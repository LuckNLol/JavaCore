package Lesson3;

import java.util.Scanner;

public class IMT_20_4_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваш вес (кг)?");
        double weight = sc.nextDouble();
        System.out.println("Ваш рост (Пример: 1,55м)?");
        double height = sc.nextDouble();
        double index = getFormula(weight, height);
        double result = imtTable(index);
    }
    public static double getFormula(double weight, double height) {
        System.out.println("Ваш ИМТ: ");
        double index = weight / (height * height);
        System.out.println(String.format("%.2f", index));
        return index;
    }
    public static double imtTable(double index) {
        if (index < 18.5) {
            System.out.println("Дефицит массы тела");
        } else if (index > 18.5 && index < 24.9) {
            System.out.println("Нормальная масса тела");
        } else if (index > 25 && index < 29.9) {
            System.out.println("Нормальная масса тела");
        } else if (index > 30 && index < 34.9) {
            System.out.println("Ожирение I степени");
        } else if (index > 35 && index < 39.9) {
            System.out.println("Ожирение II степени");
        } else {
            System.out.println("Ожирение III степени");
        }
        return index;
    }
}



