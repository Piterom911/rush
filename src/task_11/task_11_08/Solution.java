package task_11.task_11_08;

/* 
Утильный калькулятор
*/

public class Solution {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }

    static class Calculator {
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}

// Давай проведем рефакторинг кода: вынесем отдельно утильные методы. Для этого создай внутренний статический (вложенный)
// класс Calculator и перенеси в него методы add, subtract, multiply и divide. Не забудь подкорректировать их вызовы.
