package task_06.task_06_04;

public class Solution {
    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot = "Пол";
        String secondPilot = "Джордж";
        String flightEngineer = "Ринго";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("Четвёрка, которой предстоит покорить космос:");
        System.out.println("Штурман: " + navigator);
        System.out.println("Пилот: " + pilot);
        System.out.println("Второй пилот: " + secondPilot);
        System.out.println("Бортинженер: " + flightEngineer);
    }
}

// Метод createCrew() выводит должности и имена членов экипажа космического корабля.
// Во избежание путаницы внутри метода, измени имена параметров createCrew(),
// чтобы они соответствовали именам переменных, которые передаются в метод:
// name1 в navigator
// name2 в pilot
// name3 в secondPilot
// name4 в flightEngineer
// При этом результат выполнения программы не должен измениться.