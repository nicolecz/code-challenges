package com.company.kyu6;

public class HowManyPagesInABook {

    public static void main(String[] args) {
        System.out.println(amountOfPages(660));
    }

    public static int amountOfPages(int summary) {
        long digitCount = 0;
        int pages = 0;

        while(digitCount < summary) {
            pages++;
            int number = pages;
            while (number > 0) {
                digitCount++;
                number /= 10;
            }
        }
        return pages;
    }
}
