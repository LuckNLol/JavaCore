package Lesson7.HW.Ex7;

public class MainTransport {
    public static void main(String[] args) {
       Transport plane = new Plane(200, 250);

       Transport car = new Car(50, 180, 5);
        System.out.println(car.carMove(20));
        System.out.println(car.getFuelLevel());
    }
}

