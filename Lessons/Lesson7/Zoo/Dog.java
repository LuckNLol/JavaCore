package Lesson7.Zoo;

public class Dog extends Animal implements Soundable {

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Dog";
    }

    @Override
    public void sound() {
        System.out.println("Wof-wof");
    }
}

