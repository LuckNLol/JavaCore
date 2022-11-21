package Lesson7.HW.Ex9;

public class MainFigures {
    public static void main(String[] args) {
        Figure square = new Square(3, "red");
        System.out.println("Площадь квадрата: " + square.area() + "см2");
        System.out.println("Перриметр квадрата: " + square.perimeter() + "см");
        System.out.println("Цвет фигуры: " + ((Square) square).getColor());
        System.out.println("Самая длинная диагональ: " + ((Square) square).getLargeDiagonal() + "см");
        System.out.println("Высота квадрата: " + ((Square) square).getHeight() + "см");
        System.out.println();

        Figure rectangle = new Rectangle(4, 6, "blue");
        System.out.println("Площадь прямоугольника: " + rectangle.area() + "см2");
        System.out.println("Перриметр прямоугольника: " + rectangle.perimeter() + "см");
        System.out.println("Цвет фигуры: " + ((Rectangle) rectangle).getColor());
        System.out.println("Самая длинная диагональ: " + ((Rectangle) rectangle).getLargeDiagonal() + "см");
        System.out.println("Высота прямоугольника: " + ((Rectangle) rectangle).getHeight() + "см");
        System.out.println();

        Figure rhombuses = new Rhombuses(4, 120, 60, "Yellow");
        System.out.println("Площадь ромба: " + rhombuses.area() + "см2");
        System.out.println("Перриметр ромба: " + rhombuses.perimeter() + "см");
        System.out.println("Цвет фигуры: " + ((Rhombuses) rhombuses).getColor());
        System.out.println("Самая длинная диагональ: " + ((Rhombuses) rhombuses).getLargeDiagonal() + "см");
        System.out.println("Высота ромба: " + ((Rhombuses) rhombuses).getHeight() + "см");
        System.out.println();

        Figure parallelogram = new Parallelogram(4, 10, 60, 120, "Brown");
        System.out.println("Площадь параллелограмма: " + parallelogram.area() + "см2");
        System.out.println("Перриметр параллелограмма: " + parallelogram.perimeter() + "см");
        System.out.println("Цвет фигуры: " + ((Parallelogram) parallelogram).getColor());
        System.out.println("Самая длинная диагональ: " + ((Parallelogram) parallelogram).getLargeDiagonal() + "см");
        System.out.println("Высота параллелограмма: " + ((Parallelogram) parallelogram).getHeight() + "см");
        System.out.println();
    }
}
