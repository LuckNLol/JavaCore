package Lesson6;

public class Point {
    private double x, y;
    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.print("Point with coords: " + x + ", " + y);
    }
}

