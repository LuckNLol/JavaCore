package Lesson7.HW.Ex8;

public class MainPlayer {
    public static void main(String[] args) {
        Player warrior = new Warrior(50, 15, "Hornkeeper", "leather dick", "knight");
        System.out.println(warrior.getFullInfo());
        System.out.println(warrior.levelUp());
        System.out.println(warrior.doDamage());
        System.out.println();

        Player wizard = new Wizard(40, 20, "Hiromant", "Stick", 19, "water");
        System.out.println(wizard.getFullInfo());
        System.out.println(wizard.levelUp());
        System.out.println(wizard.doDamage());
        System.out.println(((Wizard) wizard).getManaLevel());

    }
}
