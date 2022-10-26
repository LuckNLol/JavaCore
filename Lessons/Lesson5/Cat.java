package Lesson5;

public class Cat {
    // Поля класса:
    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount; // Статичное поле


// Конструктор
    public Cat(double weight, String name, int age, String color){
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount ++; // Увеличиваем счетчик кошек
    }

// Способ 1. Создаем объект
    public Cat() {
        this(3000, "Barsik", 1, "Grey");
    }

// Способ 2. Создаем объект
//    Cat barsik = new Cat();
//    Cat bigCat = new Cat(5000, "Murka", 2, "Black");
//    Cat smallCat = new Cat(1000, "Kuzya", 0, "White");

// Геттеры и Сеттеры (Методы класса:)

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("Meow");
    }
    public void pee() {
        weight -= 20;
    }
    public void eat() {
        weight += 50;
        if (50 / weight > .01) {
            pee();
        }
    }


}
