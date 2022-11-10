package Lesson7.zoo;

public class Animal {
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm an Animal";
    }
}
