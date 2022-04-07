package com.company.kyu7;

import java.util.Arrays;

public class LargestPairSumInArray {
    public static void main(String[] args) {
        int[] numberArray = {99, 2, 2, 23, 19};
        System.out.println(largestPairSum(numberArray));
    }
    public static int largestPairSum(int[] numbers) {
        Arrays.sort(numbers);
        int sum = numbers[numbers.length-1] + numbers[numbers.length-2];
        return sum;
    }
}
