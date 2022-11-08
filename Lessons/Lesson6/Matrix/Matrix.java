package Lesson6.Matrix;

public class Matrix {
    private int [][] matrix;
    private int h; //высота
    private int w; //ширина

// Конструкторы (карткас матрицы):
    public Matrix(int w, int h) {
        this.w = w;
        this.h = h;

        this.matrix = new int[h][w];
    }

// Конструктор (передаём значения в матрицу):
    public Matrix(int[][] matrix) {
        this.h = matrix.length;
        this.w = matrix[0].length;
        this.matrix = matrix;
    }

// Прибавить число к матрице
    public void sum(int n){
        for (int i = 0; i < h ; i++) {
            for(int j = 0; j < w; j++) {
                this.matrix[i][j] += n;
            }
        }
    }

// Сложить две матрицы
    public void sum(Matrix matrix) {
        if ((this.h == matrix.getH()) && (this.w == matrix.getW())) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; i < w; j++) {
                    this.matrix[i][j] += matrix.getMatrix()[i][j];
                }
            }
        } else {
            System.out.println("Матрицы разных размеров, не буду это считать!");
            }
        }

    public void pprint() {
        for(int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.printf(this.matrix[i][j] + "\t");
            }
           System.out.println();
        }
    }



// Геттеры и Сеттеры
public int[][] getMatrix() {
    return matrix;
}

    public int getH() {
        return h;
    }


    public int getW() {
        return w;
    }

}
