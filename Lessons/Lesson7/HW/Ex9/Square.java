package Lesson7.HW.Ex9;
import static java.lang.Math.*;

public class Square extends Quadrangle implements Figure{

    public Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    double getLargeDiagonal() {
        return sqrt(pow(a, 2) + pow(a, 2));
    }

    @Override
    double getHeight() {
        return a;
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }
}
