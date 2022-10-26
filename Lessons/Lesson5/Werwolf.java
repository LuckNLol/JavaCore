package Lesson5;

public class Werwolf implements Human, Animal {
    @Override
    public void bite() {
        System.out.println("Кус-кусь, ауф");
    }

    @Override
    public void scream() {
        System.out.println("Уаф-Уаф, ауф");

    }

    @Override
    public void sayHi() {
        System.out.println("Привет, ауф");

    }

    @Override
    public void sayBye() {
        System.out.println("Пока ауф");

    }

    @Override
    public void walk() {  //Это общее действие между Человеком и Животным
        System.out.println("Топ-Топ");

    }
}
