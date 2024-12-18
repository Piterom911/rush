package task_08.task_08_03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min  = ints[0];
        for (int i = 1; i < ints.length; i++) {
            min = Math.min(min, ints[i]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        int[] arr = new int[10];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int value = Integer.parseInt(console.nextLine());
            arr[i] = value;
        }
        return arr;
    }
}

// В этой задаче тебе нужно:
// Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
// Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
// В методе min(int[]) обязательно используй метод Math.min(int, int).