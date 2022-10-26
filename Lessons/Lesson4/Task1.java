package Lesson4;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        task1();

    }

    public static int[] task1(){
        int[] array = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array) + "\n " + array[2]);
        return array;
    }
}
