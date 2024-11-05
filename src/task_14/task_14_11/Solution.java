package task_14.task_14_11;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Распаковка исключений
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause instanceof FileNotFoundException) System.out.println(FAILED_TO_READ);
            if (cause instanceof FileSystemException) System.out.println(FAILED_TO_WRITE);
        }
    }
}

//В методе main перехвати RuntimeException. Определи, какое исключение в нем сохранено. Если это FileNotFoundException,
// выведи в консоли сообщение: "Не удалось прочесть файл.", а если FileSystemException — "Не удалось записать в файл.".
