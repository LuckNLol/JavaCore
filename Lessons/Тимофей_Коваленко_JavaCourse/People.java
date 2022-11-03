package Тимофей_Коваленко_JavaCourse;

public abstract class People {
    private String name;
    private int age;

    public abstract String getPeople();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
