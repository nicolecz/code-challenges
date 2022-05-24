package com.company.kyu6;

public class EqualSidesOfAnArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};
        System.out.println(findEvenIndex(arr));
    }

    public static int findEvenIndex(int[] arr) {
        // create variables for leftSum and rightSum

        int leftSum = 0;
        int rightSum = 0;

        // create loop to go through each element of the array, add to leftSum each time
        // create second loop to go through each element to the right of the array and add them to rightSum
        // check if leftSum and rightSum are equal, if they are, return current index

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if(leftSum == rightSum) {
                return i;
            } else {
                leftSum += arr[i];
                rightSum = 0;
            }
        }
        return -1;
    }
}
