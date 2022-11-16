package Lesson7.Zoo;

public abstract class Animal {
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I'm an Animal";
    }

    public abstract void sound();
}


