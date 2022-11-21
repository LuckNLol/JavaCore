package Lesson8.Text;

import java.io.File;
import java.io.IOException;

public class Text {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Bus", "Busses.txt"); // название директории и файла
        System.out.println(file.getAbsolutePath());

        File file1 = new File("C:\\Users\\HP\\Desktop\\Test\\Bus\\CarBuss.txt"); // полный путь
        boolean isCreate = file1.createNewFile();
        System.out.println(isCreate);

        File directory = new File("C\\Bus");
        File file3 = new File(directory, "Busses.txt");
        System.out.println(file3.getName());


    }
}
