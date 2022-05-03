package com.company.kyu6;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {1,4,0};

        System.out.println(Arrays.toString(twoSum(numbers,4)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] indexArray = new int[2];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 1; j < numbers.length; j++) {
                System.out.println(numbers[i] + numbers[j]);
                if(numbers[i] + numbers[j] == target) {
                    indexArray[0] = i;
                    indexArray[1] = j;
                    return indexArray;
                }
            }
        }
        return indexArray;
    }
}
