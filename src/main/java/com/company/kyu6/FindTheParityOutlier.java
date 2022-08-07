package com.company.kyu6;

public class FindTheParityOutlier {

    public static void main(String[] args) {
        int[] integers = {Integer.MAX_VALUE, 0, 1};
        System.out.println(find(integers));
    }

    public static int find(int[] integers) {

        // create even/odd counter
        int evenCount = 0;
        int oddCount = 0;

        // loop through the first three elements and determine if at least 2/3 are even or odd
        for(int i = 0; i < 3; i++) {
            if(integers[i] % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }

        boolean isEven = evenCount > oddCount;

        // loop through the entire array and determine which element isn't even/odd
        int outlier = 0;

        for(int i = 0; i < integers.length; i++) {
            if(isEven && (integers[i] % 2 != 0)) {
                outlier = integers[i];
            }
            if(!isEven && (integers[i] % 2 == 0)) {
                outlier = integers[i];
            }
        }

        // return outlier integer
        return outlier;
    }
}
