package Lesson7.HW.Ex5;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван", 35, "teacher", "math");
        System.out.println(teacher.getName() + "; " + teacher.getAge() + "; " + teacher.getProfession()+ "; " + teacher.getSubject());
        teacher.giveALesson();

    }
}
