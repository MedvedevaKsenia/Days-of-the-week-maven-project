package ru.kseniamedvedeva;

public class DaysOfWeekController {
    public static String daysOfWeekController(String day) {
        return "Russian name day is " + DayOfWeekTranslation.dayOfWeekTranslation(day);
    }
}