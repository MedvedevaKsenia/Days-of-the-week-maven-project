package ru.kseniamedvedeva;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week in English: ");
        String dayOfWeek = scanner.nextLine();
        String dayLower = dayOfWeek.toLowerCase();
        System.out.println(DaysOfWeekController.daysOfWeekController(dayLower));
    }
}
