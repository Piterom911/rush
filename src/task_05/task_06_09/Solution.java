package task_05.task_06_09;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
// заполни его таблицей умножения и выведи в консоли в следующем виде:
// 1 2 3 4 …
// 2 4 6 8 …
// 3 6 9 12 …
// 4 8 12 16 …
// …
// Числа в строке разделены пробелом.
