package task_13.task_13_11;

import java.util.HashMap;

/* 
Успеваемость студентов-3
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
        for (var pair: grades.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}

// В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение -
// его средняя оценка. Попробуем сделать один метод, который будет выводить полную информацию о студентах, используя
// метод entrySet класса HashMap.
//Вывод должен быть следующий: [полное имя] : [средняя оценка] Для студента Андрей Петров со средним баллом 4.5,
// вывод будет следующим: Андрей Петров : 4.5
