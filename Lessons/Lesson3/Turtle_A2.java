package Lesson3;


public class Turtle_A2 {
    String name = "";

    public void setName(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Turtle_A2 turtle = new Turtle_A2();
        turtle.setName("Arkadiy");
        System.out.println(turtle.name);
    }
}

