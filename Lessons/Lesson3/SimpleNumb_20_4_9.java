package Lesson3;

public class SimpleNumb_20_4_9 {
    static int var = 2;

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isExit = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isExit = false;
                    break;
                }
            }
            if (isExit) {
                System.out.println(i);
            }
        }
    }
}
