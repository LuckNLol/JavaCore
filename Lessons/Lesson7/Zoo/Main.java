package Lesson7.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.change(new PopcornShop(), 1); // i = на какое место между клетками ставим ларёк
        zoo.print();

        System.out.println();

        Zoo zoo1 = new Zoo();
        zoo1.change(new Dog(), 2); // i = на какое место между клетками ставим ларёк
        System.out.println(zoo1);
        System.out.println();

        zoo.sound();


    }
}
