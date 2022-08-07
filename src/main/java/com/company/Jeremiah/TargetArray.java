package com.company.Jeremiah;

import java.util.Arrays;

public class TargetArray {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,5,5,6,7};
        System.out.println(Arrays.toString(calculateArray(arr, 7)));
    }

    public static int[] calculateArray(int[] arr, int target) {
        int[] solutionArray = {-1, -1};
        boolean targetFound = false;

        for(int i = 0; i < arr.length; i++) {

            if((arr[i] == target) && !targetFound) {
                solutionArray[0] = i;
                targetFound = true;
            }

            if((arr[i] == target)) {
                solutionArray[1] = i;
            }
        }
        return solutionArray;
    }
}
