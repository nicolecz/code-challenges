package com.company.kyu6;

import java.util.Arrays;

public class FibonacciTribonacciAndFriends {

    public static void main(String[] args) {
        double[] signature = {1.0, 8.0, 12.0, 4.0, 17.0, 0.0, 0.0, 15.0};
        System.out.println(Arrays.toString(xbonacci(signature,10)));
    }

    public static double[] xbonacci(double[] signature, int n) {
        double[] doubleArray = Arrays.copyOf(signature, n);
        double sum = 0.0;

        for (int i = signature.length; i < n; i++) {

            for(int j = i-1; j >= i - signature.length; j-- ){
                sum += doubleArray[j];
            }
            doubleArray[i] = sum;
            sum = 0.0;
        }
        return doubleArray;
    }
}
