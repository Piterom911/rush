package task_12.task_12_21;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// В классе UniversityDepartment есть метод printStudentNames(ArrayList), который принимает список объектов и выводит их
// имена. Но на данный момент программа не компилируется. Твоя задача исправить этот баг. Для этого нужно исправить
// сигнатуру метода printStudentNames(ArrayList), чтобы он принимал список объектов только типа
// Student(используй дженерик). Метод main не участвует в проверке.
