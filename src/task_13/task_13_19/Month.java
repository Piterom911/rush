package task_13.task_13_19;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        return new Month[]{Month.DECEMBER, Month.JANUARY, Month.FEBRUARY};
    }

    public static Month[] getSpringMonths() {
        return new Month[]{Month.MARCH, Month.APRIL, Month.MAY};
    }

    public static Month[] getSummerMonths() {
        return new Month[]{Month.JUNE, Month.JULY, Month.AUGUST};
    }

    public static Month[] getAutumnMonths() {
        return new Month[]{Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER};
    }

}

// В enum Month добавь 4 метода: getWinterMonths(), getSpringMonths(), getSummerMonths(), getAutumnMonths() которые
// будут возвращать массив с тремя месяцами.
