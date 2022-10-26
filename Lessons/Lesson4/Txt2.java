package Lesson4;

public class Txt2 {
    public static void main(String[] args) {
        //1
        String name = "Петя";
        int age = 23;
        String proffesion = "водитель";
        System.out.printf("Всем привет, меня зовут %s мне %d моя профессия - %s", name, age, proffesion);
        System.out.println();

//2

        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
         return str.replace(" ", "");
    }
}


