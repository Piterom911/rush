package task04.task0404;

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 10) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/*
Используя вложенные циклы while (цикл в цикле)
выведи на экран прямоугольник размером 5 (высота) на 10 (ширина),
заполненный буквой 'Q'.

Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
 */