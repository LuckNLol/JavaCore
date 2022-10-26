package Lesson5;

public class Tank {
    private int x, y;
    private int direction;
    private int fuel = 100;
    static final String MODEL = "T34";
    static int numtanks;
    private int n;

    // вариант 1
    public Tank() {
        this(0,0,100);
    }

    public Tank(int x, int y) {
        this(x, y,100);
    }

    Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++numtanks;
    }

//Вариант 2
//// это justTank
//    public Tank() {
//        this.fuel = 100;
//    }
//// это anywareTank
//    public Tank(int x, int y) {
//        this.x = x;
//        this.y = y;
//        this.fuel = 100;
//    }
//// это customTank
//    public Tank(int x, int y, int fuel) {
//        this.x = x;
//        this.y = y;
//        this.fuel = fuel;
//    }

    public void goForward(int i) {
        if(i < 0 && -i > - fuel) i = -fuel;

        if (i > fuel) i = fuel;

        if (direction == 0) x += i;
        else if (direction == 1) y += i;
        else if (direction == 2) x -= i;
        else y -= i;
    }

    public void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + n + " at " + x + ", " + y + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public void turnLeft() {
        direction--;
        if (direction == -1) {
            direction = 3;
        }
    }

    public void turnRight() {
        direction++;
        if (direction == 4) {
            direction = 0;
        }
    }
}