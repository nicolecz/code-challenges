package com.company.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {

    public static void main(String[] args) {
        int[] elements = {};
        System.out.println(Arrays.toString(deleteNth(elements, 5)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer,Integer> elementCount = new HashMap<>();
        ArrayList<Integer> intArrayList = new ArrayList<>();

        for(int i = 0; i < elements.length; i++) {
            if (elementCount.containsKey(elements[i])) {
                elementCount.put(elements[i], elementCount.get(elements[i]) + 1);
            } else {
                elementCount.put(elements[i], 1);
            }
            if (elementCount.get(elements[i]) <= maxOccurrences) {
                intArrayList.add(elements[i]);
            }
        }

        int[] intArray = new int[intArrayList.size()];

        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = intArrayList.get(i);
        }

        return intArray;
    }
}
