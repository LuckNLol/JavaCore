package Тимофей_Коваленко_JavaCourse;

import java.util.Scanner;

public class Page {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notes = 10; // Количество записей на странице
        System.out.print("Ввести количество новостей: ");
        double n = sc.nextInt();
        System.out.println("Требуемое количество страниц: " + countPage(n, notes));
    }

    public static double countPage(double n, double notes) {
        double x;
        x = Math.ceil(n / notes);
        return x;
    }

}
