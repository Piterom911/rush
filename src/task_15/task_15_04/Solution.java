package task_15.task_15_04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file1Path = scanner.nextLine();
        String file2Path = scanner.nextLine();

        try (InputStream inputStream = Files.newInputStream(Paths.get(file1Path));
             OutputStream outputStream = Files.newOutputStream(Paths.get(file2Path))) {

            byte[] buffer = new byte[2];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) > 0) {
                if (bytesRead == 2) {
                    outputStream.write(buffer[1]);
                    outputStream.write(buffer[0]);
                } else {
                    outputStream.write(buffer[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2. Далее все байты из файла1 записывает в
// файл2, но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д. Если последний
// байт в файле1 нечетный, то пишем его в файл2 как есть. Для чтения и записи файлов используй методы newInputStream и
// newOutputStream класса Files.
