package task_08.task_08_05;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random rd = new Random();
        int value = rd.nextInt(8);
        return switch (value) {
            case 0 -> CERTAIN;
            case 1 -> DEFINITELY;
            case 2 -> MOST_LIKELY;
            case 3 -> OUTLOOK_GOOD;
            case 4 -> ASK_AGAIN_LATER;
            case 5 -> TRY_AGAIN;
            case 6 -> NO;
            case 7 -> VERY_DOUBTFUL;
            default -> null;
        };
    }
}
