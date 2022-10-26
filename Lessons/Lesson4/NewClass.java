package Lesson4;
import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {


        int[]  array = new int[11];
        int num = 5;

        for(int i = 0; i < array.length; i++) {
            array[i] = num;
            num++;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int mass: array) {

            System.out.print(mass + " ");
        }

        String word = "abracadabra";
        int x = word.indexOf('b');
        int y = word.lastIndexOf('b');
        System.out.println(x + " " + y);

    }
}

