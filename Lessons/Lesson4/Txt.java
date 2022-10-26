package Lesson4;

public class Txt {
    public static void main(String[] args) {
//2, 3
        String a = "иван иванов";
        String b = "Иван Иванов";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        checkUserName(a, b);
//1
        String str = "Sometimes";
        System.out.println(str.charAt(2));
//4
        checkUserName2(a, b);
    }
//2, 3
    public static void checkUserName(String a, String b) {
        if (a.equalsIgnoreCase(b) == true) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя!");
        }
    }
//4, 5
    public static void checkUserName2(String a, String b) {
        String[] parts = b.split(" ");
        String res = parts[0];

        String tabs = b.replace(" ", "");


        if (a.equalsIgnoreCase(b) == true) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + b.length() + " символов");
            System.out.println("А без фамилии ваше имя занимает " + res.length() + " символов");
            System.out.println("А без пробелов ваше имя занимает " + tabs.length() + " символов");
        }
    }

}
