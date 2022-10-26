package Lesson5;



public class Shtring {

    public static void main(String[] args) {
        String s1 = new String("Строка тоже объект");
        String s2 = "Строка тоже объект";
        String s3 = "Строка тоже объект";
        String s4 = s1;
        String s5 = new String(s1);
        System.out.println(s2 == s4);
        System.out.println();

        System.out.println(mulString("A", 100));
        System.out.println();

    }

    static String mulString(String p, int n) {
        String result = "";
        for (int i = 0; i < n; i++)
            result += p;
        return result;
    }
}
