package Lesson7.HW.Ex9;

public abstract class Quadrangle { // четырехугольник
    int a; // боковые стороны
    int b; // верхняя и нижнаяя стороны
    String color;

    public Quadrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    abstract double getLargeDiagonal();
    abstract double getHeight();
    abstract String getColor();

}
