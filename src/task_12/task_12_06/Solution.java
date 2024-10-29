package task_12.task_12_06;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int digits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) digits++;
        }
        return digits;
    }

    public static int countLetters(String string) {
        int letters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) letters++;
        }
        return letters;
    }

    public static int countSpaces(String string) {
        int spaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) spaces++;
        }
        return spaces;
    }
}

// Реализуй методы countDigits(String), countLetters(String), countSpaces(String), которые должны возвращать количество
// цифр, букв и пробелов в строке. Метод main не принимает участия в проверке.
