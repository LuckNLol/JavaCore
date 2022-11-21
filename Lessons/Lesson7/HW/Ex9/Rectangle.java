package Lesson7.HW.Ex9;
import static java.lang.Math.*;

public class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    double getLargeDiagonal() {
        return sqrt(pow(a, 2) + pow(b, 2));
    }

    @Override
    double getHeight() {
        return min(a, b);
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2*(a + b);
    }
}
