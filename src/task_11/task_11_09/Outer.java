package task_11.task_11_09;

/* 
Объекты внутренних и вложенных классов
*/

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}

// В классе Outer есть внутренний (Inner) и вложенный (Nested) классы. В методе main класса Solution создай по одному
// объекту каждого из них.
