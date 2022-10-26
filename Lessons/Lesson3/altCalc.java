package Lesson3;
import java.util.Scanner;

public class altCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите число");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите операцию");
            String s = sc.nextLine();
            System.out.println("Введите число");
            int b = sc.nextInt();
            if (s.equals("+")) {
                int res = 0;
                res = a + b;
                System.out.println(res);
            }
            char c = s.charAt(0);
            if (c == ('q'))
                System.exit(0);

        } while (true);
    }
}
