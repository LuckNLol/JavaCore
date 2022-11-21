package Lesson7;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorByLength implements Comparator<String> {
    public static void main(String[] args) {
        String[] array = {"баркас", "ёлка", "баржа", "арбузы", "тыква"};
        Arrays.sort(array);

        ComparatorByLength comp = new ComparatorByLength();
        Arrays.sort(array, new ComparatorByLength());
        System.out.println(Arrays.toString(array));
    }

    @Override
    public int compare(String arg0, String arg1) {
        if (arg0 == null)
            return 1;
        if (arg1 == null)
            return -1;
        return arg0.length() - arg1.length();
    }
}
