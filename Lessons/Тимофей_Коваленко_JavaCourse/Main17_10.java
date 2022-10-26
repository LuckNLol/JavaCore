package Тимофей_Коваленко_JavaCourse;

public class Main17_10 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Ivan");
        student1.setAge(22);

        Student student2 = new Student();
        student2.setName("Roman");
        student2.setAge(20);

        Student student3 = new Student();
        student3.setName("Kompot");
        student3.setAge(23);


        System.out.println("student1: " + student1.getName() + " " + student1.getAge());
        System.out.println("student2: " + student2.getName() + " " + student2.getAge());
        System.out.println("student3: " + student3.getName() + " " + student3.getAge());
        System.out.println(Student.TAG);

        Integer a1 = 3;
        Integer a2 = 3;

        Integer b1 = 33;
        Integer b2 = 33;

        if(a1.equals(a2)) {
            System.out.println("true");
        }

        if(b1.equals(b2)) {
            System.out.println("false");
        }


    }
}
