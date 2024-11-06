package task_15.task_15_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Сокращаем try
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

// Программа считывает с консоли строку и выводит ее на экран в нижнем регистре. Не меняя функциональности программы,
// перепиши код с использованием try-with-resources. Вынеси в круглые скобки создание объектов с внешними ресурсами.
// Не забудь удалить ненужные вызовы метода close().
