package task_11.task_11_21;

import java.util.Arrays;

/* 
Забытая инициализация
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}

// В программе массив заполняется числами от 0 до 9 и выводится на экран. Но из-за ошибки программа не компилируется.
// Сделай так, чтобы программа компилировалась и работала правильно.
