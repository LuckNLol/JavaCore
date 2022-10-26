package Lesson3;
import java.util.Scanner;

public class MathSumm_20_4_17_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value n: ");
        int n = scanner.nextInt();
        System.out.println("enter value x: ");
        int x = scanner.nextInt();
        MathSumm_20_4_17_2 summ = new MathSumm_20_4_17_2();
        float result = summ.calculate(n, x);
        System.out.println("result = " +result);
    }
}