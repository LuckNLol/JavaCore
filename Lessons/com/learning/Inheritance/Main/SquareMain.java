package com.learning.Inheritance.Main;
import com.learning.Inheritance.Figures.Circle;
import com.learning.Inheritance.Figures.Square;
import com.learning.Inheritance.Figures.Triangle;
import com.learning.Inheritance.Inheritance.Figurers;

public class SquareMain {
    public static void main(String[] args) {
        Square shape1 = new Square(5); // инициализация свойств через конструктор с параметрами
        System.out.println("Площадь квадрата равна " + shape1.getSquare() + "(см2)"); // переопределил метод (добавил +3 к полученной площади)
        System.out.println(shape1.getSquareSquare());


        Circle shape2 = new Circle(7);
        System.out.println("Площадь круга равна " +  shape2.getSquare() + "(см2)");
        System.out.println(shape2.getCircleSquare()); // инициализация свойств через конструктор с параметрами

        Triangle shape3 = new Triangle(3, 5); // инициализация свойств через конструктор с параметрами
        System.out.printf("Площадь треугольника равна " + shape3.getSquare() + "(см2)");
        System.out.println();
        System.out.println(shape3.getTriangleSquare());
        System.out.println(shape3.getSquare());
        System.out.println();

//        Figurers someFigure1 = new Square(5);
//        Figurers someFigure2 = new Triangle(5, 16);
//        Figurers someFigure3 = new Circle(15);
//        System.out.println(someFigure1);                // Неведомый полиморфизьм??
//        System.out.println(someFigure2);
//        System.out.println(someFigure3);



    }
}
