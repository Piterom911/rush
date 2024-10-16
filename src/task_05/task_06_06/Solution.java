package task_05.task_06_06;

import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(console.nextLine());
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}

// Чтобы выполнить эту задачу, тебе нужно:
// Ввести с клавиатуры число N.
// Считать N целых чисел и заполнить ими массив.
// Найти минимальное число среди элементов массива и вывести в консоль.
