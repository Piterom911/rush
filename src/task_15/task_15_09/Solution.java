package task_15.task_15_09;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* 
Еще раз читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

// Программа считывает из консоли строку и выводит список букв, из которых состоит введенная строка.
// Не меняя функциональности программы, перепиши код с использованием Scanner для чтения из консоли.
