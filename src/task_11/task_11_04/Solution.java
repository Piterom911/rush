package task_11.task_11_04;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double dbFromStr = Double.parseDouble(string);
        long num = Math.round(dbFromStr);
        System.out.println(num);
    }
}

// В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double. Затем
// округли полученное значение, используя статический метод round класса Math. Результат выведи на экран.