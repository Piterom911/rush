package task_16.task_16_07;

import java.time.LocalDate;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(2020, 256);
    }

    static LocalDate ofEpochDayExample() {
        return LocalDate.ofEpochDay(18517);
    }
}

// В классе Solution реализуй 4 метода:
// метод nowExample должен вернуть текущую дату;
// остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.
