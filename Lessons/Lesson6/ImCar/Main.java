package Lesson6.ImCar;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto("Запарожец", "Красный", new Wheel("СемёнСемёныч"));

        auto.turnRight();
        auto.getWheel().setName("Лёлик-ролл");
        System.out.println();
        auto.turnRight();

    }

}
