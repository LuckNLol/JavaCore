package Lesson6.Matrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 2);

        Matrix matrix2 = new Matrix(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6}
                });

        matrix1.sum(-4);
        matrix1.pprint();
        matrix2.pprint();

        matrix2.sum(matrix1);
        matrix2.pprint();

    }
}
