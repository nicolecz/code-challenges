package com.company.kyu7;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static void main(String[] args) {
        Integer[] reversedArray = reverseSortArray(digitsToArray(1476));
        int highestInt = arrayToInt(reversedArray);
        System.out.println(Arrays.toString(reverseSortArray(digitsToArray(1476))));
        System.out.println(highestInt);
    }

    public static Integer[] digitsToArray(int num) {
        int number = num;
        int length = String.valueOf(num).length();
        Integer[] intArray = new Integer[length];

        for(int i=0; i< length; i++) {
            intArray[i] = number % 10;
            number /= 10;
        }
        return intArray;
    }

    public static Integer[] reverseSortArray(Integer[] intArray) {
        Arrays.sort(intArray, Collections.reverseOrder());
        return intArray;
    }

    public static int arrayToInt(Integer[] intArray) {
        int newInt = 0;
        for(int i = 0; i < intArray.length; i++) {
            newInt = (newInt * 10) + intArray[i];
            System.out.println(newInt);
        }
        return newInt;
    }

}
