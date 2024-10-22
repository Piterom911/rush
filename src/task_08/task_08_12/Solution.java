package task_08.task_08_12;

public class Solution {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}

// В классе Pair реализуй метод swap() так, чтобы он менял местами значения переменных x и y.
// Можно использовать только операции:
// Исключающее или.
// Присваивание.
// Исключающее или с присваиванием.
// Не оставляй комментарии, не меняй остальной код.