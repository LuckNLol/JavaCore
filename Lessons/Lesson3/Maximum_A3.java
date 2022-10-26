package Lesson3;

public class Maximum_A3 {

//    public void max(int a, int b, int c, int d) {
//        findMaximum(a, b, c, d);
//    }

    public static int findMaximum(int a, int b, int c, int d) {
        int maxx3 = Math.max(a, b);
        int maxx2 = Math.max(c, d);
        int maxx = Math.max(maxx3, maxx2);
        return maxx;
    }

    public static void main(String[] args) {
        int a = 4, b = 3, c = 5, d = 7;
        System.out.println(findMaximum(a, b, c, d)) ;
    }
}
