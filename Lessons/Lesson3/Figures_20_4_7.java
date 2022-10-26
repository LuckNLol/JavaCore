package Lesson3;

public class Figures_20_4_7 {
    public static void main(String[] args) {
        int sideTriangle = 14;
        int sideSquare = 50;
        int radius = 23;
        int perrimTriangle = triangle(sideTriangle);
        int perrimSquare = square(sideSquare);
        double perrimCircle = circle(radius);
        System.out.println("Перриметр треугольника = " + perrimTriangle);
        System.out.println("Перриметр квадрата = " + perrimSquare);
        System.out.println("Перриметр круга = " + String.format("%.2f", perrimCircle));
    }

    public static int triangle(int sideTriangle) {
        int perrimTriangle = 3 * sideTriangle;
        return perrimTriangle;
    }

    public static int square(int sideSquare) {
        int perrimSquare = 4 * sideSquare;
        return perrimSquare;
    }

    public static double circle(int radius) {
        double perrimCircle = 2 * Math.PI * radius;
        return perrimCircle;
    }
}
