package task_10.task_10_02;

public class Solution {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Solution() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Solution(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Solution(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        Solution skyscraper = new Solution();
        Solution skyscraperTower = new Solution(50);
        Solution skyscraperSkyline = new Solution("JavaRushDevelopment");
    }
}

// Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
// Объявляет о результате постройки.
// Объявляет о результате и указывает количество этажей.
// Объявляет о результате и указывает застройщика.
// Пример вывода: Небоскреб построен. Небоскреб построен. Количество этажей -
// 50 Небоскреб построен. Застройщик - JavaRushDevelopment
// Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
// Метод main не участвует в тестировании.