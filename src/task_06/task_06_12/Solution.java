package task_06.task_06_12;

public class Solution {
    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrtText = "Корень квадратный для числа ";
        for (int element : array) {
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtText + element + " равен " + elementSqrt);
        }
    }
}

// Метод printSqrt(int[] array) должен выводить корень квадратный для каждого элемента переданного массива.
// Но этого не происходит из-за конфликта имен переменных. Исправь имена переменных так, чтобы код компилировался.
// В результате работы программа должна выводить в консоли соответствующую строку для каждого элемента массива.