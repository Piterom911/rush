package task_10.task_10_19;

import java.util.Calendar;

public class Solution {
    private int currentYear;

    public Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
    }
}

// В классе Solution есть поле currentYear, которое должно инициализироваться значением текущего
// года(Calendar.getInstance().get(Calendar.YEAR)) при создании нового объекта типа Solution.
// Тебе нужно найти ошибку и исправить её, чтобы при создании объекта класса Solution поле currentYear
// правильно инициализировалось.