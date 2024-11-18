package task_15.task_15_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String string: lines) {
                for (int i = 0; i < string.length(); i++) {
                    char cur = string.charAt(i);
                    if (cur != ' ' && cur != '.' && cur != ',') System.out.print(string.charAt(i));
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

// Напиши программу, которая считывает из консоли имя текстового файла, далее читает символы из этого файла (используй
// метод readAllLines(Path) класса Files) и выводит на экран все, за исключением точки, запятой и пробела.
