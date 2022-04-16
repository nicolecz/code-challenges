package com.company.kyu7;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(1));
    }

    public static long fib(int n) {
        long priorInt = 0;
        long nextInt = 1;
        long fibInt = 0;

        if(n <= 1) return n;

        for (long i = 2; i <= n; i++) {
            fibInt = (priorInt + nextInt);
            priorInt = nextInt;
            nextInt = fibInt;
        }

        return fibInt;

    }
}
