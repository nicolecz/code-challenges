package com.company.kyu6;

import java.util.Arrays;

public class TribonacciSequence {

    public static void main(String[] args) {
        double[] s = {11,11,2};
        System.out.println(Arrays.toString(tribonacci(s, 2)));
    }

    public static double[] tribonacci(double[] s, int n) {
        double[] doubleArray = new double[n];

        if(n == 0) {
            return doubleArray;
        } else if(n <= 3) {
            for(int i = 0; i < n; i++) {
                doubleArray[i] = s[i];
            }
        } else {

            for (int i = 0; i < s.length; i++) {
                doubleArray[i] = s[i];
            }

            for (int i = 3; i < n; i++) {
                doubleArray[i] = doubleArray[i - 3] + doubleArray[i - 2] + doubleArray[i - 1];
            }
        }

        return doubleArray;
    }
}
