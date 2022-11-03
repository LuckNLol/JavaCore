package Lesson6;

public class ColorPoint extends Point {
    public static void main(String[] args) {
        ColorPoint print = new ColorPoint(1.5, 5.3, "Blue");
        print.print();

        //System.out.println(print);
    }
    private String color;
    public ColorPoint(double x, double y, String color) {
        super(x, y);
        this.color = color;
    }

    public void print() {
        super.print();
        System.out.println(" and color: " + color);
    }
}
