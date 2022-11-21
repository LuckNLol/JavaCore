package Lesson7.HW.Ex9;

import static java.lang.Math.*;

public class Parallelogram extends Quadrangle implements Figure{
    double alpha; // левый нижний угол ромба, в градусах
    double beta; // левый верхний угол ромба, в градусах

    public Parallelogram(int a, int b, double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    double getLargeDiagonal() {
        double D = sqrt(pow(a, 2) + pow(b, 2) - 2 * a * b * cos(toRadians(beta)));
        double d = sqrt(pow(a, 2) + pow(b, 2) + 2 * a * b * cos(toRadians(alpha)));
        return max(D, d);
    }

    @Override
    double getHeight() {
        return b  * sin(toRadians(alpha));
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return max(a, b) * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
