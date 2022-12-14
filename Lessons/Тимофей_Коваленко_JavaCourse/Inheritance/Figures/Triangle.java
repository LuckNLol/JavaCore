package Тимофей_Коваленко_JavaCourse.Inheritance.Figures;
import Тимофей_Коваленко_JavaCourse.Inheritance.Inheritance.Figurers;

public class Triangle extends Figurers {
    private double triangleSquare;

    public Triangle(int height, int ground) {
        super(height, ground);
        triangleSquare = 0.5 * height * ground;
    }

    public double getTriangleSquare() {
        return triangleSquare;
    }

    @Override
    public double getSquare() {
        return triangleSquare;
    }
}
