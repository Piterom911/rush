package task_15.task_15_05;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Что-то не копируется...
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            int read;
            while ((read = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

// Есть программа, которая считывает из консоли путь к файлу1 и путь к файлу2 и копирует содержимое файла1 в файл2.
// Но она не работает корректно. Найди и исправь ошибки в коде, чтобы программа заработала как нужно.
