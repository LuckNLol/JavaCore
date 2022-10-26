package Тимофей_Коваленко_JavaCourse;

public class HW2 {
    public static void main(String[] args) {
        int[] num = {3, 5, 14, 74, 55, 11, 2, 8, 82, 43};

        System.out.println("Наибольшее значение в массиве: " + maxNumber(num));
        System.out.println("Наименьшее значение в массиве: " + minNumber(num));
    }

    private static void replace() {
        //maxNumber() = 99;

    }



    private static int maxNumber(int num[]) {
        int maxDigit = num[0];
        for (int i : num) {
            if (i > maxDigit) {
                maxDigit = i;
            }
        }
        return maxDigit;
    }

    private static int minNumber(int num[]) {
        int minDigit = num[0];
        for (int i : num) {
            if (i < minDigit) {
                minDigit = i;
            }
        }
        return minDigit;
    }
}

