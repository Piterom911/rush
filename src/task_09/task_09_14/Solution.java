package task_09.task_09_14;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int index1 = path.indexOf("jdk");
        int index2 = path.indexOf("/", index1);
        String oldJdk = path.substring(index1, index2);

        return path.replace(oldJdk, jdk);
    }
}

// Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути,
// полученном первым параметром метода, на версию, полученную вторым параметром, и возвращал новый путь.
// Версия jdk начинается со строки "jdk" и заканчивается на "/".

// Пример: путь — "/usr/java/jdk1.8/bin/" версия jdk — "jdk-13"
// Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin/".
// Метод main() не принимает участия в тестировании.