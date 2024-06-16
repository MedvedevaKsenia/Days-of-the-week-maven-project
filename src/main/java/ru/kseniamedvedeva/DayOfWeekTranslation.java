package ru.kseniamedvedeva;

public class DayOfWeekTranslation {
    public static String dayOfWeekTranslation(String day) {
        String translateDay;
        switch (day) {
            case "monday" -> translateDay = "понедельник";
            case "tuesday" -> translateDay = "вторник";
            case "wednesday" -> translateDay = "среда";
            case "thursday" -> translateDay = "четверг";
            case "friday" -> translateDay = "пятница";
            case "saturday" -> translateDay = "суббота";
            case "sunday" -> translateDay = "воскресенье";
            default -> translateDay = "- incorrect day's name";
        }
        return translateDay;
    }
}