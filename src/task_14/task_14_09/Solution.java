package task_14.task_14_09;

/* 
Пропускаем сквозь себя
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}

// Сделай так, чтобы программа компилировалась, не используя try-catch.
