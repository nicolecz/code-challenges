package com.company.kyu7;

public class SumOfCubes {

    public static void main(String[] args) {
        System.out.println(sumCubes(407));
    }

    public static long sumCubes(long n) {
        long sum = 0;
        for(long i = 1; i <= n; i++) {
            sum += (long)Math.pow(i,3);
        }
        return sum;
    }
}
