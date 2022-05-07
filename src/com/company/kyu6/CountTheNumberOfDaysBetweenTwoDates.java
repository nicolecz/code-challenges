package com.company.kyu6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CountTheNumberOfDaysBetweenTwoDates {
    public static void main(String[] args) {
        System.out.println(getDaysAlive(1998, 1, 10, 2008, 7, 8));
    }
    public static long getDaysAlive(int year, int month, int day, int year2, int month2, int day2) {
        LocalDate initialDate = LocalDate.of(year, month, day);
        LocalDate finalDate = LocalDate.of(year2, month2, day2);

        Duration diff = Duration.between(initialDate.atStartOfDay(),finalDate.atStartOfDay());

        return diff.toDays();
    }
}
