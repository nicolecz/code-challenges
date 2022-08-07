package com.company.kyu6;

public class WhatCenturyIsIt {

    public static void main(String[] args) {
        System.out.println(whatCentury(2000));
    }

    public static String whatCentury(int year) {

        // if number % 100 is 0, use number / 100
        // otherwise, number / 100 + 1
        if (year % 100 == 0) {
            year /= 100;
        } else {
            year = (year / 100) + 1;
        }

        // if number % 10 = 0, "th"
        // if number % 10 = 1, "st"
        // if number % 10 = 2, "nd"
        // if number % 10 = 3, "rd"
        // otherwise, "th"

        // return string

        if (year < 20) {
            return year + "th";
        }
        switch (year % 10) {
            case 1:
                return year + "st";
            case 2:
                return year + "nd";
            case 3:
                return year + "rd";
            default:
                return year + "th";
        }
    }
}
