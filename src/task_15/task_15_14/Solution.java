package task_15.task_15_14;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        try {
            Path path1 = Path.of(str1);
            Path path2 = Path.of(str2);

            if (path1.isAbsolute() == path2.isAbsolute()) {
                Path relativePath = path1.relativize(path2);
                System.out.println(relativePath);
            }
        } catch (IllegalArgumentException e) {}
    }
}

// Напиши программу, которая будет считывать с клавиатуры два пути и выводить в консоль
// относительный путь между первым и вторым путями, если он существует.
// В противном случае выводить ничего не нужно.
