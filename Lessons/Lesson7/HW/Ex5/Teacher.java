package Lesson7.HW.Ex5;

public class Teacher extends People {
    private String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    @Override
    public String getProfession() {
        return profession;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
    public void giveALesson() {
        System.out.println("The lesson was ended");
    }
}
