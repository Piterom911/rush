package task_10.task_10_17;

public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(23452);
        Antarctica antarctica = new Antarctica(23452);
        Australia australia = new Australia(23452);
        Eurasia eurasia = new Eurasia(23452);
        NorthAmerica northAmerica = new NorthAmerica(23452);
        SouthAmerica southAmerica = new SouthAmerica(23452);
    }
}

// Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс.
// В каждом классе должно быть поле, которое хранит площадь соответствующего материка.
// Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
// Ты можешь использовать любые числа для задания площади материков.