package Lesson5;

public class MainDeveloper {
    public static void main(String[] args) {
        Developer devInfo = new Developer("Славян", "Java", 1000);
        Developer devInfo2 = new Developer("Петюня", "Kotlin", 500);
        Worker_abstr natasha = new Developer("Наталья", "Pascal" , 720);

        natasha = new Designer(950);

//        devInfo.sayHi();
//        devInfo.setName("ЛеопольдИна");
//        devInfo.sayHi();
//        devInfo2.sayHi();
//
//        System.out.println("Имя 1го разраба: " + devInfo.getName());
//        System.out.println("Имя 2го разраба: " + devInfo2.getName());
//        System.out.println();

        System.out.println(devInfo.getName());
        System.out.println("Зарплата: " + devInfo.getSalary());
        devInfo.addToSalary(100);
        System.out.println("с учетом надбавки: " + devInfo.getSalary());
        devInfo.addAgeCoefficient(1.5f);
        System.out.println("Итого с учетом региона: " + devInfo.getSalary());

        System.out.println();

        System.out.println(devInfo2.getName());
        System.out.println("Зарплата: " + devInfo2.getSalary());
        devInfo2.addToSalary(200);
        System.out.println("с учетом надбавки: " + devInfo2.getSalary());
        devInfo2.addAgeCoefficient(2.1f);
        System.out.println("Итого с учетом региона: " + devInfo2.getSalary());

        System.out.println();

        Werwolf jacob = new Werwolf();
        Human j = new Werwolf();
        Animal b = new Werwolf();

        jacob.sayHi();
        j.walk();
        b.scream();

    }
}
