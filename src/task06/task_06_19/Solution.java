package task06.task_06_19;

import java.util.Arrays;

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 51;

    public static void main(String[] args) {
        int[] arrayForSort = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayForSort);

        int valueInArr = Arrays.binarySearch(arrayForSort, element);
        System.out.println(valueInArr >= 0);
    }
}

// Реализуй метод main(String[]), который выводит в консоль true,
// если элемент содержится в переданном массиве, иначе — false.
// Массив array не должен изменять расположение своих элементов.
// Для поиска элемента в массиве нужен бинарный поиск.
// Чтобы это сделать, используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
// Первым параметром нужно передать отсортированный массив, в котором выполнить поиск,
// вторым параметром — искомый элемент. Метод Arrays.binarySearch(int[], int) возвращает
// индекс искомого элемента, если такой элемент есть в массиве.
// Для сортировки массива можно использовать метод Arrays.sort(int[]).
// При тестировании значения переменных класса Solution будут разными.