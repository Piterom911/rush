package task_15.task_15_07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String pathString = scanner.nextLine();
        Path path = Paths.get(pathString);

        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                if (i % 2 == 0) System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

// Напиши программу, которая считывает из консоли имя текстового файла, далее читает строки из этого файла (используй
// метод readAllLines(Path) класса Files) и выводит их на экран через одну, начиная с первой.
