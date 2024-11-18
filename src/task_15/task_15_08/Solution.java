package task_15.task_15_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             InputStreamReader inputStreamReader = new InputStreamReader(stream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line = bufferedReader.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

// Программа считывает из консоли строку и выводит ее на экран, чередуя регистр символов: первый символ — в нижнем
// регистре, второй — в верхнем, третий — в нижнем, и т.д. Не меняя функциональности программы, перепиши код
// с использованием BufferedReader для чтения из консоли.
