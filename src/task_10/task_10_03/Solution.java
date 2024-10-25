package task_10.task_10_03;

public class Solution {
    private int floorsCount;
    private String developer;

    public Solution() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Solution(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Solution skyscraper = new Solution();
        Solution skyscraperUnknown = new Solution(50, "Неизвестно");
    }
}

// Давай построим бизнес-центр, который состоит из двух зданий, один из которых только начинаем строить, а второй —
// на этапе планирования, поэтому о нем мало что известно. Тебе нужно будет создать два конструктора:
// один с параметрами, второй — без. Они оба должны инициализировать поля floorsCount и developer.