package com.company.kyu7;

import java.util.Arrays;

public class HighestProfitWins {
    public static void main(String[] args) {
        int[] arr = {1};
        minMax(arr);
    }
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        int[] minMaxArray = new int[2];
        minMaxArray[0] = arr[0];
        minMaxArray[minMaxArray.length - 1] = arr[arr.length - 1];
        return minMaxArray;
    }
}
