package task_15.task_15_15;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str);
        System.out.println(!path.isAbsolute() ? path.toAbsolutePath() : path);
    }
}

// Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли, при этом если путь не абсолютный, то перед выводом его нужно преобразовать к таковому.