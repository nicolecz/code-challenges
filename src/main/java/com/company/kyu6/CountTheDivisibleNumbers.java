package com.company.kyu6;

public class CountTheDivisibleNumbers {

    public static long divisibleCount(long x, long y, long k) {
        if(x == 0) {
            return (y / k) + 1;
        }

        return (y / k) - ((x - 1) / k);
    }
}
