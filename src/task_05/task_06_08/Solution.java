package task_05.task_06_08;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) continue;
            String str = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (str.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}

// В этой задаче тебе нужно:
// Считать 6 строк и заполнить ими массив strings.
// Удалить повторяющиеся строки из массива strings,
// заменив их на null (null должны быть не строками "null").
// Примеры.
// Массив после чтения строк: {"Hello", "Hello", "World", "Java", "Tasks", "World"}
// Массив после удаления повторяющихся строк: {null, null, null, "Java", "Tasks", null}
