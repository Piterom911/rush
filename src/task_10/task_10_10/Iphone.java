package task_10.task_10_10;

import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Iphone)) return false;

        Iphone iphone = (Iphone) obj;

        if (this.price != iphone.price) return false;

        if (!Objects.equals(this.model, iphone.model)) return false;

        return Objects.equals(this.color, iphone.color);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}

// В методе main создаются два айфона с одинаковыми параметрами. В консоли выводится результат их сравнения.
// Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был положительным.
// Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
// У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.