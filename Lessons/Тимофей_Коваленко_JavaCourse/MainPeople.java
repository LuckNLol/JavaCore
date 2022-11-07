package Тимофей_Коваленко_JavaCourse;

public class MainPeople {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Ivan");
        student1.setAge(22);
        student1.setSpec("Prikladnaya matematika");

        Student student2 = new Student();
        student2.setName("Roman");
        student2.setAge(20);
        student2.setSpec("Musica");

        Student student3 = new Student();
        student3.setName("Kompot");
        student3.setAge(23);
        student3.setSpec("Prikladnaya matematika");

        FirstInterface people1 = new Student(); //это полиморфизм
        FirstInterface people2 = new Teacher(); //это полиморфизм

        people1.getUniverName();

//        printType(people1); //это полиморфизм
//        printType(people2); //это полиморфизм


//        System.out.println("student3: " + student3.getPeople()); // распечатали абстрактный класс
//        System.out.println("student1: " + student1.getName() + " - " + student1.getAge() + " - " + student1.getSpec());
//        System.out.println("student2: " + student2.getName() + " - " + student2.getAge() + " - " + student2.getSpec());
//        System.out.println("student3: " + student3.getName() + " - " + student3.getAge() + " - " + student3.getSpec());
//        System.out.println();
//
//        Teacher teacher1 = new Teacher();
//        teacher1.setName("BabanSemen");
//        teacher1.setAge(52);
//        teacher1.setSubject("Mathematika");
//        teacher1.setTeachID("ID 1811");
//
//        Teacher teacher2 = new Teacher();
//        teacher2.setName("BabanJan");
//        teacher2.setAge(43);
//        teacher2.setSubject("Music");
//        teacher2.setTeachID("ID 1814");
//
//        System.out.println("teacher1: " + teacher1.getName() + " - " + teacher1.getAge() + " - " + teacher1.getSubject() + " - " + teacher1.getTeachID());
//        System.out.println("teacher2: " + teacher2.getName() + " - " + teacher2.getAge() + " - " + teacher2.getSubject() + " - " + teacher2.getTeachID());
//        System.out.println();
    }

    public static void printType(FirstInterface people) {

        System.out.println("student3 " + people.getUniverName());
    }
}
