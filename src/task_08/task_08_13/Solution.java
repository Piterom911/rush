package task_08.task_08_13;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2;
        for(int i = 0; i < power - 1; i++) {
            result = result << 1;
        }
        return result;
    }
}

// Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
// Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.