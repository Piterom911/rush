package task_13.task_13_01;

import java.util.HashSet;
import static java.util.Arrays.asList;

/* 
Оформляем возврат
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        return new HashSet<String>(asList(strings));
    }
}

// В классе Solution есть метод arrayToHashSet(String[]), который должен из переданного массива вернуть HashSet<String>
// с теми же элементами. Метод main не участвует в проверке.
