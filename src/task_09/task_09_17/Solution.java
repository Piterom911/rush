package task_09.task_09_17;

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        return first.intern() == second.intern();
    }
}

// Метод equal(String, String) сравнивает строки по ссылке, используя оператор ==. Нужно сделать так,
// чтобы метод возвращал true, если содержимое строк одинаковое, и false — если разное, не используя метод equals().