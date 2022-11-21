package Lesson8.Text;

import java.io.File;
import java.io.IOException;

public class Catalog {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\HP\\Desktop\\Test\\Bus");
        String[] files = file.list();
        for(String fileName : files) {
            System.out.println(fileName);
        }

        File folder = new File("C:\\Users\\HP\\Desktop\\Test");
        long size = getFolderSize(folder);
        System.out.println(size  + "Byte");

    }

    private static long getFolderSize(File folder) {
        File[] files = folder.listFiles();
        long length = 0;
        int count = files.length;
        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            } else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
    }
}
