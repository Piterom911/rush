package task_13.task_13_12;

import java.util.HashMap;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> programmingLanguages = new HashMap<>();
        programmingLanguages.put(0, "Java");
        programmingLanguages.put(1, "Kotlin");
        programmingLanguages.put(2, "Go");
        programmingLanguages.put(3, "Javascript");
        programmingLanguages.put(4, "Typescript");
        programmingLanguages.put(5, "Python");
        programmingLanguages.put(6, "PHP");
        programmingLanguages.put(7, "C++");
        return programmingLanguages;
    }
}

// В классе Solution есть метод getProgrammingLanguages, который возвращает список языков программирования.
// Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>.
// Ключом в этой коллекции будет индекс элемента в ArrayList.
