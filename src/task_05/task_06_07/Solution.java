package task_05.task_06_07;

import java.util.Scanner;

/*
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(console.nextLine());
        }

        int max = array[0];
        for (int j : array) {
            if (j > max) max = j;
        }

        System.out.println(max);
    }
}

//В этой задаче тебе нужно:
//Ввести с клавиатуры число N.
//Считать N целых чисел и заполнить ими массив array.
//Найти максимальное число среди элементов массива.
