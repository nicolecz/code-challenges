package com.company.kyu6;

import java.util.Arrays;

public class TheSupermarketQueue {

    public static void main(String[] args) {
        int[] customers = {10,2,3,3};
        System.out.println(solveSuperMarketQueue(customers,2));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int totalTime = 0;
        int currentTime = 0;

        int[] currentQueue = Arrays.copyOfRange(customers,0, n);

        for(int i = 0; i < n; i++) {
            if(customers[i] > totalTime) {
                totalTime = customers[i];
            }
        }

        // decrement by 1 until one is 0
        for(int i = n; i < customers.length; i++) {

        }
        return 1;
    }
}
