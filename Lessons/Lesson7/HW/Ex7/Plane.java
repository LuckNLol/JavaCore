package Lesson7.HW.Ex7;

public class Plane extends Transport{

    public Plane(int fuel, int speed) {
        super(fuel, speed);
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

    void fillFuel(int n) {
        fuel += n;
    }
}
