package com.company.kyu6;

import java.time.LocalDate;

public class DetermineTheDateByTheDayNumber {

    public static void main(String[] args) {
        System.out.println(getDayNew(41,false));
    }

    public static String getDayNew(int day, boolean isLeap) {
        StringBuilder dateString = new StringBuilder();
        LocalDate newDate;
        String month;

        if(isLeap) {
            newDate = LocalDate.parse("2020-01-01").plusDays(day-1);
        } else {
            newDate = LocalDate.parse("2021-01-01").plusDays(day-1);
        }
        month = newDate.getMonth().toString();
        dateString.append(month.charAt(0) + month.substring(1).toLowerCase());
        dateString.append(", " + newDate.getDayOfMonth());

        return dateString.toString();
    }

    public static String getDayOriginal(int day, boolean isLeap) {

        int date;
        int daysTotal = 0;

        int[] dayArray = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] monthArray = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        StringBuilder dateString = new StringBuilder();

        if(isLeap) dayArray[1]++;

        for(int i = 0; i < dayArray.length; i++) {
            if(day <= (dayArray[i] + daysTotal)) {
                dateString.append(monthArray[i]);
                date = day - daysTotal;
                dateString.append(", " + date);
                break;
            } else {
                daysTotal += dayArray[i];
            }
        }
        return dateString.toString();
    }
}
