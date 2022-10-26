package Lesson3;

public class Vedro_20_4_13 {
    public static void main(String[] args) {
        int firstCan = 30;
        int emptyCan = 0;

        while (firstCan > 0) {
            firstCan--;

            if (firstCan % 10 != 0) {
                emptyCan++;
            }
            System.out.println(firstCan);
            System.out.println(emptyCan);
        }
    }
}
