package Lesson7.HW.Ex7;

public abstract class Transport {
    public int fuel;
    public int speed;

    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }

    abstract boolean carMove(int n);
    abstract int getFuelLevel();
}
