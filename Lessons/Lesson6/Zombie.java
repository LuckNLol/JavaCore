package Lesson6;

public class Zombie extends Monster {

    public Zombie(String name) {

        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.println("Хуя се");
        super.growl();
    }

    @Override
    public void attack() {
        System.out.println();
        super.attack();
        growl();
    }
}
