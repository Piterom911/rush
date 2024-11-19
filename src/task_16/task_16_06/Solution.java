package task_16.task_16_06;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Выход из зацикленности
*/

public class Solution {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            start.add(Calendar.DATE, 1);  // was roll instead of add
            System.out.print(".");
        }
        System.out.print("Финиш");
    }
}

// Цикл while должен был завершиться за 31 итерацию, но почему-то зациклился. Найди и исправь ошибку.
