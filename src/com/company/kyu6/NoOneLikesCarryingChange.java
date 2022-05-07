package com.company.kyu6;

import java.util.Arrays;

public class NoOneLikesCarryingChange {
    public static void main(String[] args) {
        int[]coinAmounts = {1,5,10,25};
        System.out.println(solve(123,coinAmounts));
    }

    public static int solve(int amount, int[] coinAmounts) {
        int count = 0;

        Arrays.sort(coinAmounts);

        for(int i = coinAmounts.length - 1; i >= 0; i--) {
            count += amount / coinAmounts[i];
            amount = amount % coinAmounts[i];
        }
        return count;
    }
}
