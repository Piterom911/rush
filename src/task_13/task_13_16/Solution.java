package task_13.task_13_16;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javarushQuests = JavarushQuest.values();
        for (JavarushQuest quest: javarushQuests) {
            System.out.println(quest.ordinal());
        }
    }
}

// В enum JavarushQuest хранится список квестов. Твоя задача — получить массив всех элементов в методе main (используй
// метод values()) и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.
