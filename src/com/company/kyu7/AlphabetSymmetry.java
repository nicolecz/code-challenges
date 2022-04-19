package com.company.kyu7;

import java.util.Arrays;

public class AlphabetSymmetry {
    public static void main(String[] args) {
        String[] arr = {"encode","abc","xyzD","ABmD"};
        System.out.println(Arrays.toString(solve(arr)));
    }
    public static int[] solve(String[] arr) {
        int[] intArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr[i].length(); j++) {
                if(arr[i].toLowerCase().charAt(j) == ('a' + j)) {
                    count++;
                }
            }
            intArray[i] = count;
        }
        return intArray;
    }
}
