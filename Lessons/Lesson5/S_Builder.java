package Lesson5;

import java.lang.StringBuilder;

public class S_Builder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("OROROD");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.setCharAt(1, 'G');
        }
        System.out.println((System.currentTimeMillis() - startTime));
        //System.out.println(sb);
    }

}
