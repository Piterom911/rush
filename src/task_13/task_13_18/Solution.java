package task_13.task_13_18;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] months = Month.values();
        if (month.ordinal() + 1 >= months.length) return months[0];
        return months[month.ordinal() + 1];
    }
}

// В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц, а если передан последний
// месяц, возвращать первый. Используй методы values и ordinal. Метод main не участвует в проверке.
