package com.company.kyu6;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {

    public static void main(String[] args) {
        int[] a = {5,4,3,2,1,5,4,3,2,10,10};
        System.out.println(findIt(a));
    }

    public static int findIt(int[] a) {
        // create map to store counts for each int
        Map<Integer,Integer> intCounts = new HashMap<>();

        // use for loop to go through each element in the array and add to map with count for each int
        for(int i = 0; i < a.length; i++) {
            if(intCounts.containsKey(a[i])) {
                intCounts.put(a[i],intCounts.get(a[i]) + 1);
            } else {
                intCounts.put(a[i], 1);
            }
        }

        // determine which values in map are odd
        int oddInt = 0;
        for(Integer intCounter : intCounts.keySet()) {
            if(intCounts.get(intCounter) % 2 > 0) {
                oddInt = intCounter;
            }
        }
        return oddInt;
    }
}
