package Lesson7.zoo;

public class Reptile extends Animal {

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Reptile";
    }
}