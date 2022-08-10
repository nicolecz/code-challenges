package com.company.kyu6;

import java.util.ArrayList;
import java.util.List;

public class SpecialMultiples {

    public static long countSpecMult(long n, long mxval) {
        // create long counter variable
        long numCount = 0;

        // create arrayList to store n primes
        List<Long> primeList = listOfPrimes(n);

        // loop through numbers up to mxval and increase counter for numbers that have n primes as factors

        // create boolean to mark if a number is a factor
        boolean isFactor = true;

        for(long i = 2; i < mxval; i++) {
            for (long num : primeList) {
                if(i % num != 0) {
                    isFactor = false;
                    break;
                }
            }
            if(isFactor) {
                numCount++;
            }
            isFactor = true;
        }

        return numCount;
    }

    public static List<Long> listOfPrimes(long n) {
        // create arrayList to store prime numbers
        List<Long> primeList = new ArrayList<>();

        // while primeList size is less than n, loop through to find prime numbers to add
        long startingNum = 2;

        while(primeList.size() < n) {
            if(isPrime(startingNum)) {
                primeList.add(startingNum);
            }
            startingNum++;
        }
        return primeList;
    }

    public static boolean isPrime(long n) {
        // create boolean variable
        boolean prime = true;

        // loop through all factors of n / 2
        for(long i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
