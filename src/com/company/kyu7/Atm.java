package com.company.kyu7;

public class Atm {
    public static void main(String[] args) {
        System.out.println(solve(238));
    }
    public static int solve(int n) {
        int sum = 0;
        int bankNoteCount = 0;
        int originalN = n;

        if(n < 1 || n > 1500) {
            return -1;
        }
        while(sum < originalN) {
            if(n / 500 > 0) {
                bankNoteCount = n / 500;
                sum = 500 * (n / 500);
                n %= 500;
            } else if(n / 200 > 0) {
                bankNoteCount = bankNoteCount + (n / 200);
                sum = sum + (200 * (n / 200));
                n %= 200;
            } else if(n / 100 > 0) {
                bankNoteCount = bankNoteCount + (n / 100);
                sum = sum + (100 * (n / 100));
                n %= 100;
            } else if(n / 50 > 0) {
                bankNoteCount = bankNoteCount + (n / 50);
                sum = sum + (50 * (n / 50));
                n %= 50;
            } else if(n / 20 > 0) {
                bankNoteCount = bankNoteCount + (n / 20);
                sum = sum + (20 * (n / 20));
                n %= 20;
            } else if(n / 10 > 0) {
                bankNoteCount = bankNoteCount + (n / 10);
                sum = sum + (10 * (n / 10));
                n %= 10;
            } else {
                return -1;
            }
        }
        if(sum == originalN) {
            return bankNoteCount;
        } else {
            return -1;
        }
    }
}
