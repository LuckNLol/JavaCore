package Lesson7.Zoo;

public class Reptile extends Animal {

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm a Reptile";
    }

    @Override
    public void sound() {

    }


}
