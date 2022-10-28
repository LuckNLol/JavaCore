package Lesson1;

public class Dog {

    private final double originWeight;
    private double weight;

    public Dog() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Dog(double weight) {
        this.weight = weight;
        this.originWeight = weight;
    }

    public void woof() {
        weight = weight - 1;
        System.out.println("Woof!");
        System.out.println("Woof!");
        System.out.println("Woof!");
        System.out.println("I'm a WerWolf!");

    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public void pee() {
        weight = weight - 10;
        System.out.println("Clean it, man!");
        System.out.println("Now!");
        System.out.println("Or you'll be eaten like chuucen!");
    }

    public double getWeight() {
        return weight;
    }
}