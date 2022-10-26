package Lesson1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] questions = {
                "Как вас зовут?",
                "Сколько вам лет?",
                "Изучаете ли вы Java?",
                "Сколько уроков вы уже прошли?"
        };

        String[] titles = {
                "Имя",
                "Возраст",
                "Изучает Java",
                "Прогресс в уроках",
        };

        String[] answers = new String[questions.length];

        askQuestions(questions, answers);
        printAnswers(titles, answers);
    }

    static void askQuestions(String[] questions, String[] answers){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа - опросник студента изучающего Java.");
        System.out.println();
        System.out.println("Пожалуйста, ответьте на несколько вопросов.");

        System.out.println("Нажмите интер, когда будете готовы.");
        scanner.nextLine();

        for (int i = 0; i < questions.length; i++) {
            String quest = questions[i];
            System.out.println(quest);
            System.out.flush();
            String answer = scanner.nextLine();
            answers[i] = answer;
        }
    }

    static void printAnswers(String[]titles, String[] answers){
        System.out.println();
        System.out.println("Результат опроса:");
        for (int i= 0; i < answers.length; i ++){
            System.out.printf("%s : %s \n", titles[i], answers[i]);
        }
    }
}
