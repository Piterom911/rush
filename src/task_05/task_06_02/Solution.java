package task_05.task_06_02;

public class Solution {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 1)
                strings[i] = ODD;
            else strings[i] = EVEN;
        }

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}

// В методе main(String[]) тебе нужно заполнить массив strings значениями.
// Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная),
// иначе присвоить "Нечётный". Вывод текста в консоль в тестировании не участвует.
