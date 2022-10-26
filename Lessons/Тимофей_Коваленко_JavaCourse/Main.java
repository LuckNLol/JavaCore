package Тимофей_Коваленко_JavaCourse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Building building1 = new Building();
        building1.color = "red";
        building1.countPeple = 100;
        building1.test();

        Building building2 = new Building();
        building2.color = "blue";
        building2.countPeple = 60;
        building2.test();


        Building building3 = new Building();
        building3.color = "yellow";
        building3.countPeple = 150;
        building3.test();


        printBuilding(building1);

        printBuilding(building2);

        printBuilding(building3);
    }
    public static void printBuilding(Building building) {
        System.out.println("color = " + building.color + "; " + "countPeople = " + building.countPeple);

    }
}
