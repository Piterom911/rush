package task_13.task_13_21;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String ruLower = ru.toLowerCase();
        String en;
        if (ruLower.equals("понедельник")) {
            en = "Monday";
        } else if (ruLower.equals("вторник")) {
            en = "Tuesday";
        } else if (ruLower.equals("среда")) {
            en = "Wednesday";
        } else if (ruLower.equals("четверг")) {
            en = "Thursday";
        } else if (ruLower.equals("пятница")) {
            en = "Friday";
        } else if (ruLower.equals("суббота")) {
            en = "Saturday";
        } else if (ruLower.equals("воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;
    }
}

// В классе Solution есть метод getTranslationForDayOfWeek(String), который возвращает перевод дня недели с русского на
// английский. Твоя задача — переписать метод, используя только оператор if-else.
