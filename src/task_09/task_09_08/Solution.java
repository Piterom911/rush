package task_09.task_09_08;

public class Solution {
   public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) return "";
        if (!binaryNumber.matches("[0-1]+")) return "";

        StringBuilder hexNumber = new StringBuilder();

        int lg = binaryNumber.length() % 4;
        if (lg > 0) {
            StringBuilder binaryNumberBuilder = new StringBuilder(binaryNumber);
            for (int i = 0; i < 4 - lg; i++) {
                binaryNumberBuilder.insert(0, "0");
            }
            binaryNumber = binaryNumberBuilder.toString();
        }

        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String fourth = binaryNumber.substring(i, i + 4);
            switch (fourth) {
                case "0000" -> hexNumber.append("0");
                case "0001" -> hexNumber.append("1");
                case "0010" -> hexNumber.append("2");
                case "0011" -> hexNumber.append("3");
                case "0100" -> hexNumber.append("4");
                case "0101" -> hexNumber.append("5");
                case "0110" -> hexNumber.append("6");
                case "0111" -> hexNumber.append("7");
                case "1000" -> hexNumber.append("8");
                case "1001" -> hexNumber.append("9");
                case "1010" -> hexNumber.append("a");
                case "1011" -> hexNumber.append("b");
                case "1100" -> hexNumber.append("c");
                case "1101" -> hexNumber.append("d");
                case "1110" -> hexNumber.append("e");
                case "1111" -> hexNumber.append("f");
                default -> throw new IllegalArgumentException("Invalid binary group: " + fourth);
            }
        }

        return hexNumber.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) return "";
        if (!hexNumber.matches("[a-f0-9]+")) return "";

        StringBuilder binaryNumber = new StringBuilder();

        for (int i = 0; i < hexNumber.length(); i++) {
            switch (hexNumber.charAt(i)) {
                case '0' -> binaryNumber.append("0000");
                case '1' -> binaryNumber.append("0001");
                case '2' -> binaryNumber.append("0010");
                case '3' -> binaryNumber.append("0011");
                case '4' -> binaryNumber.append("0100");
                case '5' -> binaryNumber.append("0101");
                case '6' -> binaryNumber.append("0110");
                case '7' -> binaryNumber.append("0111");
                case '8' -> binaryNumber.append("1000");
                case '9' -> binaryNumber.append("1001");
                case 'a' -> binaryNumber.append("1010");
                case 'b' -> binaryNumber.append("1011");
                case 'c' -> binaryNumber.append("1100");
                case 'd' -> binaryNumber.append("1101");
                case 'e' -> binaryNumber.append("1110");
                case 'f' -> binaryNumber.append("1111");
                default -> throw new IllegalArgumentException("Invalid hex group: " + hexNumber.charAt(i));
            }
        }

        return binaryNumber.toString();
    }
}

// Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа, полученное
// в качестве входящего параметра, из двоичной системы счисления в шестнадцатеричную и возвращать его строковое
// представление. А публичный статический метод toBinary(String) наоборот — из строкового представления
// шестнадцатеричного числа в строковое представление двоичного числа.
// Методы работают только с не пустыми строками. Если входящий параметр — пустая строка или null, то оба метода
// возвращают пустую строку. Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1,
// то метод возвращает пустую строку. Если входящий параметр метода toBinary(String) содержит любой символ,
// кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.
// Твоя задача — реализовать эти методы.
// Один из алгоритмов перевода строкового представления двоичного числа в строковое представление шестнадцатеричного
// числа следующий:
// Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
// Если это не так, то добавляем нужное количество 0 в начало строки.
// Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
// Например:
// двоичное представление — "100111010000", где "1001" — "9", "1101" — "d", "0000" — "0",
// шестнадцатеричное представление — "9d0".
// Один из алгоритмов перевода строкового представления шестнадцатеричного числа в строковое представление
// двоичного числа следующий: Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует.
// Например:
// шестнадцатеричное представление — "9d0", где "9" — "1001", "d" — "1101", "0" — "0000",
// двоичное представление — "100111010000".
// Метод main() не принимает участие в тестировании.