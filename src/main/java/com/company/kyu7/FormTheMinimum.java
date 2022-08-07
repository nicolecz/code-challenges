package com.company.kyu7;

import java.util.TreeSet;

public class FormTheMinimum {
    public static void main(String[] args) {
        int[] intArray = {1,9,3,1,7,4,6,6,7};
        System.out.println(minValue(intArray));
    }
    public static int minValue(int[] values) {
        TreeSet<Integer> sortedTree = new TreeSet<>();
        for(int i = 0; i < values.length; i++) {
            sortedTree.add(values[i]);
        }

        int smallestNumber = 0;
        for(Integer num : sortedTree) {
            smallestNumber *= 10;
            smallestNumber += num;
        }
        return smallestNumber;
    }
}
