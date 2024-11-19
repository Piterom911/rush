package task_16.task_16_01;

import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(90, 0, 17);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        return switch (date.getDay()) {
            case 0 -> "Воскресенье";
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            default -> null;
        };
    }
}

// Проинициализируй переменную birthDate объектом Date с датой своего рождения. Реализуй метод getDayOfWeek(Date date),
// чтобы он возвращал русское название дня недели аргумента date.
