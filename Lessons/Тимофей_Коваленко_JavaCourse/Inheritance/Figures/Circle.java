package Тимофей_Коваленко_JavaCourse.Inheritance.Figures;
import Тимофей_Коваленко_JavaCourse.Inheritance.Inheritance.Figurers;

public class Circle extends Figurers {
    private double circleSquare;
    private static final double PI = 3.14d;

    public Circle(int radius) {
        super(radius);
        circleSquare = PI * radius;
    }

    public double getCircleSquare() {
        return circleSquare;
    }

    @Override
    public double getSquare() {
        return circleSquare;
    }
}
