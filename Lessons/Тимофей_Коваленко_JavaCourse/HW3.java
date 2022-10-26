package Тимофей_Коваленко_JavaCourse;
import java.util.*;


public class HW3 {
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scr.nextInt();
        int[] array = new int[3];
        System.out.println("Введите числа: ");
            for(int i = 0; i < array.length; i++) {
                array[i] = scr.nextInt();
            }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        }
//
//    public void printAraray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array));
//        }
    }

