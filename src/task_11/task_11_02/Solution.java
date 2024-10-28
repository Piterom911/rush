package task_11.task_11_02;

/* 
Земля: техническая характеристика
*/

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}

// Сделай все переменные класса Planet не статическими. После этого внеси необходимые правки в метод main.