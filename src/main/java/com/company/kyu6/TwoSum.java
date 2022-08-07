package com.company.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        System.out.println(Arrays.toString(twoSumNew(numbers,4)));
    }

    public static int[] twoSumNew(int[] numbers, int target) {

        int[] solution = new int[2];

        Map<Integer,Integer> sumMap = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            int pair = target - numbers[i];
            if(sumMap.containsKey(pair)) {
                solution[0] = sumMap.get(pair);
                solution[1] = i;
            }
            sumMap.put(numbers[i],i);
        }
        return solution;
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
