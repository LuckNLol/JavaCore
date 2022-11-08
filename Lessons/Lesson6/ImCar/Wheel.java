package Lesson6.ImCar;

public class Wheel {

    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public void turnRight() {
        System.out.println("Колесо " + name + " поворачивается направо");

    }

    public void setName(String name) {
        this.name = name;
    }
}
