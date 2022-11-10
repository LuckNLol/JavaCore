package Lesson7.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.change(new PopcornShop(), 1); // i = на какое место между клетками ставим ларёк
        zoo.print();

        Zoo zoo1 = new Zoo();
        zoo1.change(new Dog(), 2); // i = на какое место между клетками ставим ларёк
        System.out.println(zoo1);

    }


}
