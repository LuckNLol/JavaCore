package Тимофей_Коваленко_JavaCourse;

public class Student {
    private String name;
    private int age;
    public final static String TAG = "Группа-11"; /*static = статический метод одинаковый для всех Студентов,
                                             TAG - констатна (заглавные буквы)
                                             final = константу нельзя больше изменить */


// Setters and Getters (R-button -> Generate -> Getters and Setters):


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
