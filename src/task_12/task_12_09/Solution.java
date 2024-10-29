package task_12.task_12_09;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (name == null) return;
        if (waitingEmployees.contains(name)) {
            int id = waitingEmployees.indexOf(name);
            waitingEmployees.set(id, null);
            alreadyGotSalaryEmployees.add(name);
        }
    }
}

// В классе Solution есть список сотрудников waitingEmployees, которые ждут зарплату, и список сотрудников
// alreadyGotSalaryEmployees, которые её уже получили. Необходимо реализовать метод paySalary(String), который в
// качестве аргумента принимает имя сотрудника, желающего получить зарплату. Метод должен проверить наличие сотрудника
// в списке waitingEmployees, и если он не получал зарплату, выдать её:
// Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
// Добавить имя сотрудника в список alreadyGotSalaryEmployees.
// В списке waitingEmployees заменить имя сотрудника на null.
