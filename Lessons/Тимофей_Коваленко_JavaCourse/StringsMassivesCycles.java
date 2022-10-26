package Тимофей_Коваленко_JavaCourse;

public class StringsMassivesCycles {
    public static void main(String[] args) {

        stringsBad();
        testMassive();
        stringsGood();
    }

// Неудачный вывод строк:
        public static void stringsBad() {
            System.out.println();
            String a = "Hello ";
            String b = a + "world " + "19" + "85"; //запись созд. лишнние переменные, увеличивает время рабты и забивает память
            System.out.println(b);
            System.out.println();
        }
// Удачный вывод строк:
        public static void stringsGood() {
            System.out.println();
            StringBuilder sb = new StringBuilder();
            sb.append("Hello");
            sb.append(" word");
            sb.append(" 2022");
            sb.append("г." + "\n");
            sb.append("Hello next 2023 year");
            System.out.println(sb.toString());

// стравнить строки (в 99% случаев через "equals"). Вар1
            String text1 = "Hello";
            String text2 = "Hello";
            if (text1.equals(text2)) {
                System.out.println("equals"); // сравнивается содержимое ячейки
            }
            if (text1 == text2) {
                System.out.println("=="); // сравниваются адреса хранения
            }
// стравнить строки. Вар2
            String text3 = new String("Hello");
            String text4 = new String("Hello");
            if (text3.equals(text4)) {
                System.out.println("equals"); // сравнивается содержимое ячейки
            }
            if (text3 == text4) {
                System.out.println("=="); // сравниваются адреса хранения
            }
        }


// массивы
        public static void testMassive() {
            int[] array = new int[5];
            array[0] = 10;
            array[1] = 11;
            array[2] = 13;
            array[3] = 4;
            array[4] = 6;
            //System.out.println(array[2]);

//Вар.1 для for (есть доступ к индексам массива)
            for (int i = 0; i < array.length; i++) {
                array[i] += 10; //прибавляем к каждому значению в массиве число 10
                System.out.println("i=" + i + " " + array[i]);
            }
//Вар.2 для for (нет доступа к конкретному индексу массива, но есть доступ к содержимому)
            for (int value : array) {
                System.out.println(value);
            }

// while

            int i = 0;
            while (i < array.length) {
                array[i] += 10;
                System.out.println("i=" + i + " " + array[i]);
                i++;
            }
// do while
            do {
                System.out.println("do while");
            } while (false);

        }
    }
