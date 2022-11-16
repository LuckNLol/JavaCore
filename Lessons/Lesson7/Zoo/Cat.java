package Lesson7.Zoo;

public class Cat extends Animal implements Soundable {

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Cat";
    }

    @Override
    public void sound() {
        System.out.println("meow");

    }
}
