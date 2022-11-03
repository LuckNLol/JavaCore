package Lesson6;

public class SubClass extends SuperClass {
    int num = 77;
    public void display() {
        System.out.println("Это метод display() подкласса");
    }

    public void myMethod() {
        this.display();
        super.display();
        System.out.println("Значение переменной num в подклассе: " + this.num);
        System.out.println("Значение переменной num в подклассе: " + super.num);
    }

    public static void main(String[] args) {
        SubClass number = new SubClass();
        number.myMethod();

    }
}
