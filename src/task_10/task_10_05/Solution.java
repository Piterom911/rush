package task_10.task_10_05;

public class Solution {
    private String type;

    public void initialize(String type) {this.type = type;}

    public static void main(String[] args) {
        Solution building = new Solution();
        building.initialize("Барбершоп");
    }
}

// Постройка здания планировалась под ресторан и успешно завершилась, но спустя некоторое время собственники решили
// переделать его под барбершоп. Нам нужно сделать так, чтобы здание было универсальным, и его назначение можно было
// менять, не создавая нового. Для этого создай метод initialize, который будет устанавливать значение полю type
// (определять тип здания), а конструктор убери.