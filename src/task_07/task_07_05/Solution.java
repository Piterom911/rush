package task_07.task_07_05;

public class Solution {
    public static void main(String[] args) {
        div(0.0, 1);
        div(0.0, -1);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}

// В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами,
// чтобы вывод в консоли был "Infinity", а второй — "-Infinity". Код метода div() изменять нельзя.