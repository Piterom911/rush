package task_09.task_09_15;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        int tokenNum = st.countTokens();
        String[] arr = new String[tokenNum];
        for (int i = 0; i < tokenNum; i++) {
            arr[i] = st.nextToken();
        }
        return arr;
    }
}

// Используя StringTokenizer раздели query на части по разделителю delimiter.
// Пример: getTokens("java.util.stream", "\\.") возвращает массив строк {"java", "util", "stream"}
// Hint: решить задачу поможет метод countTokens().