package task_06.task_06_14;

public class Solution {
    final public static double PI = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Плошадь круга равна: " + PI * radius * radius);
        System.out.println("Периметр круга равен: " + PI * diameter);
    }
}

// Посмотри, что делает программа. Расставь модификатор final общепринятым константам (переменным с неизменными значениями).
// Кроме этого такие константы должны быть переименованы согласно конвенции (заглавными буквами).
// Подсказка: Переименовать переменную (и не только) во всей программе можно с помощью комбинации клавиш Shift+F6 (Intellij IDEA).