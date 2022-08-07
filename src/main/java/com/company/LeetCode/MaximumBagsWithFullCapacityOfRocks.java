package com.company.LeetCode;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityOfRocks {

    public static void main(String[] args) {
        int[] capacity = {91,54,63,99,24,45,78};
        int[] rocks = {35,32,45,98,6,1,25};
        System.out.println(maximumBags(capacity,rocks,17));
    }

    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int maxFullBags = 0;

        int[] varianceArray = new int[capacity.length];

        for(int i = 0; i < capacity.length; i++) {
            varianceArray[i] = capacity[i] - rocks[i];
            if(varianceArray[i] == 0) {
                maxFullBags++;
            }
        }

        Arrays.sort(varianceArray);

        for(int i = 0; i < varianceArray.length; i++) {
            if(varianceArray[i] > 0 && additionalRocks >= varianceArray[i]) {
                additionalRocks -= varianceArray[i];
                maxFullBags++;
            }
            if(additionalRocks <= 0) {
                return maxFullBags;
            }
        }
        return maxFullBags;
    }
}
