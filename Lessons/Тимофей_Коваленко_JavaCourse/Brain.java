package Тимофей_Коваленко_JavaCourse;
/*Создаем папку с txt файлами на ПК(1), указываем к ней путь интерпретаторе(2), проверяем, что
* путь верный и файлы внутри папки существуют(3), создаем/удаляем новую директорию, создаем новый файл*/

import java.io.File;
import java.io.IOException;

public class Brain {
// (1) указываем путь до созданной директории
    public static final String PATH = "C:/Users/HP/Desktop/Test";
// (2) Проверяем что путь к директории верный
    public static void main(String[] args) {
        File dir = new File(PATH);
        if (dir.exists()) {
            System.out.println("Папка существует");
        } else {
            System.out.println("Папка не существует");
        }
//(3) Проверяем что файлы внутри директории существуют
        File[] fileArray = dir.listFiles();

        if (fileArray == null) {
            System.out.println("Папка пустая");
            return;
        }

        for(File file: fileArray) {
            System.out.println(file.getName());
            if (file.isDirectory()) {
                System.out.println("Это папка");
            }
        }
// (4) Создаем новы(е) файл(ы) внутри существующей директории
        File newDir = new File(dir, "newFolder1");
        if (!newDir.exists()) { // Проверяем существует ли создаваемая папка
            newDir.mkdir(); // mkdir - команда для создания директории
        }
// (5) Удаляем папку
        File newDir1 = new File(dir, "newFolder1");
        if(newDir1.exists()) {
            newDir1.delete(); // команда удаления фиректории
        }
// (6) Создаем новый файл

        File newFile = new File(dir, "Busik.txt");
        if (!newDir.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Ошибка создания файла " + e.getMessage());
            }
        }
    }
}
