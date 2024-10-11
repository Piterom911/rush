package task06.task0605;

import java.util.Scanner;

/*
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = console.nextInt();
        }

        if (result.length % 2 == 1) {
            for (int j : result) {
                System.out.println(j);
            }
        } else {
            for (int i = result.length - 1; i >= 0; i--) {
                System.out.println(result[i]);
            }
        }
    }
}

// Тебе нужно написать программу, которая:
// Считывает с консоли целое число N.
// Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
// Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
// Каждое число выводить с новой строки. Число N выводить не нужно.
