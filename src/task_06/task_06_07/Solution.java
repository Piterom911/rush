package task_06.task_06_07;

public class Solution {
    public static void main(String[] args) {
        signIn("Roman");
    }

    public static void signIn(String username){
        if (username.equals("user")) return;
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}

// Перед тобой метод signIn(), который приветствует пользователей сайта.
// Сейчас он приветствует всех пользователей, а должен только зарегистрированных.
// Имена всех незарегистрированных пользователей — "user".
// Добавь проверку имени пользователя в начало метода signIn().
// Если имя "user", прерви выполнение метода, используя ключевое слово return.