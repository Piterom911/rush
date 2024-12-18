package task_16.task_16_08;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/* 
Просто день недели
*/

public class Solution {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }
}

// Реализуй метод getDayOfWeek(LocalDate date), чтобы он возвращал русское название дня недели аргумента date.
// Воспользуйся методами getDayOfWeek и getDisplayName.
// Пример параметров метода getDisplayName, чтобы получить русское название дня недели:
// getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))
