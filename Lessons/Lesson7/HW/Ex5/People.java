package Lesson7.HW.Ex5;

public abstract class People {
    public String name, profession;
    public int age;

    public People(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public abstract String getProfession();
    public abstract int getAge();
    public abstract String getName();

}
