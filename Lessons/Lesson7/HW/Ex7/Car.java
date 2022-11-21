package Lesson7.HW.Ex7;

public class Car extends Transport {
    int maxPassengers;


    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    @Override
    int getFuelLevel() {
        return fuel;
    }

    @Override
    boolean carMove(int n) {
        if (fuel >= n) {
            fuel -= n;
            return true;
        } else return false;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
