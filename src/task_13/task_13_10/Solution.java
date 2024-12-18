package task_13.task_13_10;

import java.util.HashMap;

/* 
Успеваемость студентов-2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for (String name: grades.keySet()) {
            System.out.println(name);
        }
    }

    public static Double getAverageMark() {
        double commonMark = 0;
        for (Double mark: grades.values()) {
            commonMark += mark;
        }
        return commonMark / grades.size();
    }
}

// В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение -
// его средняя оценка. На этот раз твоя задача — реализовать методы:
// printStudents, который выводит только имена всех студентов (ключ коллекции);
// getAverageMark, который возвращает средний балл всех студентов.
