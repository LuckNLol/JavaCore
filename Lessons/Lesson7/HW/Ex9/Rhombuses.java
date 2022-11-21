package Lesson7.HW.Ex9;
import static java.lang.Math.*;

public class Rhombuses extends Quadrangle implements Figure{
    double alpha; // левый нижний угол ромба, в градусах
    double beta; // левый верхний угол ромба, в градусах

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    double getLargeDiagonal() {
        double D = a * sqrt(2 - 2 * cos(toDegrees(alpha)));
        double d = a * sqrt(2 - 2 * cos(toDegrees(beta)));
        return max(D, d);
    }

    @Override
    double getHeight() {
        return a * sin(toRadians(alpha));
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * getHeight();
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}
