package task_07.task_07_10;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}

// Часто перед началом использования массива его необходимо заполнить значениями по умолчанию.
// Реализуй такое заполнение в методе fillArray(Integer[] array, int value).
// В качестве аргументов метод принимает массив и значение, которым его необходимо заполнить.
// Массив заполняется полностью, независимо от его длины.