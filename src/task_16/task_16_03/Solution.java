package task_16.task_16_03;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Чиним формат
*/

public class Solution {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}

// Исправь ошибку, чтобы программа вывела "2010-01-06". Инициализацию переменной date не меняй.
