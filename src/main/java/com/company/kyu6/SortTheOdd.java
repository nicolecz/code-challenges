package com.company.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTheOdd {

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        // create ArrayList
        ArrayList<Integer> oddArrayList = new ArrayList<>();

        // loop through elements of the array. If odd, add to arrayList and replace with x in original array
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 > 0) {
                oddArrayList.add(array[i]);
                array[i] = 'x';
            }
        }
        // sort ArrayList
        Collections.sort(oddArrayList);

        // loop through elements of array and if x, x counter++, replace with element in ArrayList
        int xCount = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 'x') {
                array[i] = oddArrayList.get(xCount++);
            }
        }

        // return array
        return array;
    }
}
