package task_13.task_13_02;

import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Проверка присутствия
*/

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        System.out.println(words.contains(word) ? "Слово " + word + " есть в множестве" : "Слова " + word + " нет в множестве");
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}

// В классе Solution есть метод checkWords(String), который должен проверять наличие переданного слова в множестве words.
// Если слово есть, то выводим в консоль: Слово [переданное слово] есть в множестве Если нет:
// Слова [переданное слово] нет в множестве
// Метод main не участвует в проверке.
// Пример вывода: Слово Java есть в множестве
