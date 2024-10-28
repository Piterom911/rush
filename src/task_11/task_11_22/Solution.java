package task_11.task_11_22;

/* 
Затенение поля класса
*/

public class Solution {
    public static int salary;

    public static void add(int increase) {
        Solution.salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}

// В методе main вызывается метод add, который должен увеличить значение поля salary класса Solution на переданное
// значение, но при выводе поля salary получаем 0. Сделай так, чтобы программа работала правильно.
