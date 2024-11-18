package task_15.task_15_16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        while (true) {
            if (Files.isRegularFile(Path.of(path))) {
                System.out.println(path + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(path))) {
                System.out.println(path + THIS_IS_DIR);
            } else {
                break;
            }
            path = scanner.nextLine();
        }
    }
}

// Напиши программу, которая будет считывать с клавиатуры строки, и если данная строка — это путь к существующему файлу,
// выводить в консоли "введенная строка> - это файл". Если путь к существующей директории, выводить в консоли
// "введенная строка> - это директория". Если строка не является путем к файлу или директории, то выходим из программы.
// Треугольные скобки и кавычки выводить не нужно. Для проверки файлов и директорий используй методы isRegularFile()
// и isDirectory() класса Files.
