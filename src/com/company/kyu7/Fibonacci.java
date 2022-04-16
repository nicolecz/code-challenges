package com.company.kyu7;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(21));
    }

    public static List<Long> fib(int n) {
        List<Long> nextFibNumbers = new ArrayList<>();

        long priorInt = 0;
        long nextInt = 1;
        long fibInt = 0;

        if(n == 1) fibInt = 1;

        while(fibInt < n) {
            fibInt = (priorInt + nextInt);
            priorInt = nextInt;
            nextInt = fibInt;
            if(fibInt >= n) {
                nextFibNumbers.add(fibInt);
            }
        }

        for(int i = 0; i < 4; i++) {
            fibInt = (priorInt + nextInt);
            priorInt = nextInt;
            nextInt = fibInt;
            nextFibNumbers.add(fibInt);
        }
        return nextFibNumbers;
    }

//    public static long fib(int n) {
//
//        long priorInt = 0;
//        long nextInt = 1;
//        long fibInt = 0;
//
//        if(n <= 1) return n;
//
//        for (long i = 2; i <= n; i++) {
//            fibInt = (priorInt + nextInt);
//            priorInt = nextInt;
//            nextInt = fibInt;
//        }
//
//        return fibInt;
//    }

//    public static boolean isFib(long n) {
//        long priorInt = 0;
//        long nextInt = 1;
//        long fibInt = 0;
//
//        if(n <= 1) fibInt = n;
//        if(fibInt == n) return true;
//
//        for (long i = 1; i <= n; i++) {
//            fibInt = (priorInt + nextInt);
//            priorInt = nextInt;
//            nextInt = fibInt;
//            if(fibInt == n) {
//                return true;
//            }
//        }
//        return false;
//    }
}
