package task_06.task_06_05;

public class Solution {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int frontValue = array[i];
            int backIndex = array.length - 1 - i;
            array[i] = array[backIndex];
            array[backIndex] = frontValue;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

// Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray()
// выводит в консоли все элементы массива. Тебе осталась мелочь: реализовать метод reverseArray().
// Он должен менять порядок элементов массива на обратный. Метод должен работать только
// с массивами целочисленных значений (int[]).