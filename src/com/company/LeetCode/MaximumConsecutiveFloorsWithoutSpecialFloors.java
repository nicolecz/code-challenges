package com.company.LeetCode;

import java.util.ArrayList;

public class MaximumConsecutiveFloorsWithoutSpecialFloors {
    public static void main(String[] args) {
        int[] special = {4, 6};
        System.out.println(maxConsecutive(2, 9, special));
    }

    public static int maxConsecutive(int bottom, int top, int[] special) {
        int count = 0;
        int maxCount = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < special.length; i++) {
            arr.add(special[i]);
        }

        for (int i = bottom; i <= top; i++) {
            if (!arr.contains(i)) {
                count++;
            } else if (count > maxCount) {
                maxCount = count;
                count = 0;
            } else {
                count = 0;
            }
        }

        if (count > maxCount) {
            maxCount = count;
        }
        return maxCount;
    }
}
