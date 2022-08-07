package com.company.kyu7;

import java.util.Arrays;

public class SortedYesNoHow {
    public static void main(String[] args) {
        int[] array = {3,2,1};
        System.out.println(isSortedAndHow(array));
    }
    public static String isSortedAndHow(int[] array) {
        if(ascending(array)) {
            return "yes, ascending";
        } else if(descending(array)) {
            return "yes, descending";
        } else {
            return "no";
        }
    }

    public static boolean ascending(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }
        Arrays.sort(sortedArray);
        if (Arrays.equals(sortedArray,array)) {
            return true;
        }
        return false;
    }

    public static boolean descending(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }
        Arrays.sort(sortedArray);
        int[] descendingSort = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            descendingSort[i] = sortedArray[array.length - (i + 1)];
        }
        if (Arrays.equals(array, descendingSort)) {
            return true;
        }
        return false;
    }
}
