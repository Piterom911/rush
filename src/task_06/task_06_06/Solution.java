package task_06.task_06_06;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

    }

    public static void universalMethod(String str){
        System.out.println(str);
    }

    public static void universalMethod(String str, String str2){
        System.out.println(str + str2);
    }

    public static void universalMethod(String str, int num){
        System.out.println(str + num);
    }

    public static void universalMethod(String str, String str2, int num2){
        System.out.printf(str + "%d" + str2, num2);
    }

    public static void universalMethod(String str, int num, int num2){
        System.out.printf(str + "%d %d", num, num2);
    }

    public static void universalMethod(boolean isTrue, int num, int num2){
        System.out.println(isTrue ? num : num2);
    }

    public static void universalMethod(boolean isTrue, String str1, String str2){
        System.out.println(isTrue ? str1 : str2);
    }

    public static void universalMethod(boolean isTrue, int num, int num2, String str){
        System.out.printf(str + ": %d", isTrue ? num : num2);
    }

    public static void universalMethod(int[] arrayNum){
        System.out.println(Arrays.toString(arrayNum));
    }

    public static void universalMethod(String[] arrayText){
        System.out.println(Arrays.toString(arrayText));
    }
}

// Неплохо было бы иметь один метод для решения различных задач.
// У тебя есть возможность написать такой. Создай еще 9 методов universalMethod().
// В сумме их должно получиться 10. Параметры, которые они должны принимать, придумай сам.