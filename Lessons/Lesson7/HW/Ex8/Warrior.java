package Lesson7.HW.Ex8;

public class Warrior extends Player {
    String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    @Override
    String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + armor;
    }

    @Override
    int levelUp() {
        return ++level;
    }

    @Override
    boolean doDamage() {
        return true;
    }
}
