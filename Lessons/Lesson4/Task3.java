package Lesson4;
import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[][] scoreTable = {{3,5,1,2,4},
                              {1,1,2,5,3},
                              {2,3,3,1,2},
                              {4,4,4,4,4},
                              {5,2,3,5,5}};

        String[] result = new String[5];
        int[] sumScores = new int[5];
        String[] nameGamers =  {"Саша", "Игорь", "Миша", "Коля", "Владимир"};;

        for (int i = 0; i < nameGamers.length; i++) {
            for (int j = 0; j < scoreTable[i].length; j++) {
                sumScores[i] += scoreTable[i][j];
            }
            result[i] = nameGamers[i] + " - " + sumScores[i];
            System.out.println(result[i]);
        }
    }
}
