package task_14.task_14_13;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Лонг дринк
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        try {
            ingredients.put("ice cubes", 7);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addVodka(Map<String, Integer> ingredients) {
        try {
            ingredients.put("vodka", 50);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addJuice(Map<String, Integer> ingredients) {
        try {
            ingredients.put(null, 100);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addOrange(Map<String, Integer> ingredients) {
        try {
            ingredients.put("orange slice", 1);
        } catch (Exception e) {
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement = stackTraceElements[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}

// При запуске программа заканчивается исключением. Но из текста исключения в консоли неясно, где оно возникло.
// В этой задаче тебе нужно:
// обернуть в try-catch код методов addIce, addVodka, addJuice и addOrange;
// в блоках catch вызвать метод printBugMethodName и передать в него stack trace.
// Если сделаешь все правильно, при запуске программы на экран выведутся имена методов, в которых возникает исключение.
