package task_06.task_06_03;

public class Solution {
    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Любимое блюдо: " + meal);
    }
}

// Переименуй параметры метода printPersonInfo():
// firstName в name;
// lastName в surname;
// favouriteDish в meal;
// таким образом, чтобы функционал программы остался неизменным.
// Имена переменных в методе main() оставь без изменений.