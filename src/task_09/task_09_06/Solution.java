package task_09.task_09_06;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) return "";

        StringBuilder binaryNumber = new StringBuilder();
        while (decimalNumber != 0) {
            binaryNumber.insert(0, decimalNumber % 2);
            decimalNumber = decimalNumber / 2;
        }

        return binaryNumber.toString();
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) return 0;

        int decimalNumber = 0;
        int length = binaryNumber.length();

        for (int i = 0; i < length; i++) {
            char bit = binaryNumber.charAt(length - 1 - i);
            if (bit == '1') {
                decimalNumber += (int) Math.pow(2, i);
            }
        }

        return decimalNumber;
    }
}

// Публичный статический метод toBinary(int) должен переводить целое число, полученное в качестве входящего параметра,
// из десятичной системы счисления в двоичную и возвращать его строковое представление.
// А публичный статический метод toDecimal(String) наоборот — из строкового представления двоичного числа
// в десятичное число. Методы работают только с положительными числами и не пустыми строками.
// Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку.
// Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
// Твоя задача — реализовать эти методы.
// Один из алгоритмов перевода десятичного числа в представление двоичного числа следующий: while(десятичное число
// не равно 0) { двоичное представление = остаток от деления десятичного числа на 2 + двоичное представление
// десятичное число = десятичное число / 2 }
// Один из алгоритмов перевода представления двоичного числа в десятичное число следующий:
// for (int i = 0; i длины двоичного представления; i++) { десятичное число = десятичное число +
// число из двоичного представления * на 2 в степени i }
// Изначально берется крайнее правое число из двоичного представления. С каждой итерацией цикла берется
// следующее число ближе к началу двоичного представления.
// Подсказка: чтобы возвести число к степени можно использовать метод Math.pow(число, степень).
// Метод main() не принимает участие в тестировании.
