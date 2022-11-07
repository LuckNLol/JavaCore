package Lesson6;

class Cat extends Animal {
    public Cat() {
        //хищник, питается мясом и молоком
        super(false, "milk and meat");
    }

    public Cat(boolean veg, String food) {
        super(veg, food);
    }

    public void sound() {
        System.out.println("Meow");
    }
}
