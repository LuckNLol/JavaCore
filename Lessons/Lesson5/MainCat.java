package Lesson5;

public class MainCat {
    public static void main(String[] args) {

        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 0, "White");

// Геттеры и Сеттеры

        bigCat.setName("Pushok");
        System.out.println("Имя большой кошки: " + bigCat.getName());
        System.out.println("Имя маленькой кошки: " + smallCat.getName());


    }
}
