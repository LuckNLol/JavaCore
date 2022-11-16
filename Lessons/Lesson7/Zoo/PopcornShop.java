package Lesson7.Zoo;

public class PopcornShop implements Soundable {

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "It's PopcornShop";
    }

    @Override
    public void sound() {
        System.out.println("Popcorn is here!");

    }
}
