package com.company.kyu6;

public class BankersPlan {

    public static boolean fortune(int f0, double p, int c0, int n, double i) {
        // create int for year end value
        int yearEndBalance = f0;

        // create while loop while n is greater than 0
        while(n - 1 > 0) {
            yearEndBalance = (int)(yearEndBalance + ((p * yearEndBalance) / 100) - c0);
            c0 += (c0 * i) / 100;
            n--;
        }

        return yearEndBalance >= c0;
    }
}
