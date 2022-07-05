package com.company.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumGroups {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 2, 6, 5, 0, 2, 0, 5, 5, 7, 7, 4, 3, 3, 9};

        List<Integer> integerList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> sumArrayList = null;
        do {
            sumArrayList = sumGroups(sumArrayList == null ? integerList : sumArrayList);

        } while (consecEvenOrOdd(sumArrayList));

        System.out.println(sumArrayList.size());
    }

    public static List<Integer> sumGroups(List<Integer> arrList) {
        // create new arrayList
        ArrayList<Integer> sumArrayList = new ArrayList<>();

        // create evenSum and oddSum variables
        int evenSum = 0;
        int oddSum = 0;


        // loop through elements in original array, if even, add to evenSum. If not, add value from evenSum to new
        // array and zero out sum value
        for (int i = 0; i < arrList.size(); i++) {
            if (isEven(arrList.get(i))) {
                evenSum += arrList.get(i);
                if (oddSum > 0) {
                    sumArrayList.add(oddSum);
                    oddSum = 0;
                }
            } else {
                oddSum += arrList.get(i);
                if (evenSum > 0) {
                    sumArrayList.add(evenSum);
                    evenSum = 0;
                }
            }
        }
        if (evenSum > 0) {
            sumArrayList.add(evenSum);
        }

        if (oddSum > 0) {
            sumArrayList.add(oddSum);
        }

        // return length of new array
        System.out.println(sumArrayList);
        return sumArrayList;

    }

    // create method to determine if number is even and return boolean
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    // create method to determine if there are consecutive even or odd values
    public static boolean consecEvenOrOdd(List<Integer> arrList) {
        int evenCount = 0;
        int oddCount = 0;

        int[] newArray = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            newArray[i] = arrList.get(i);
            if (isEven(newArray[i])) {
                evenCount++;
                oddCount = 0;
                if (evenCount > 1) {
                    return true;
                }
            } else {
                oddCount++;
                evenCount = 0;
                if (oddCount > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
