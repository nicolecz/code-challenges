package com.company.kyu6;

public class GoodVsEvil {

    public static String battle(String goodAmounts, String evilAmounts) {
        // split good and evil strings into arrays
        String[] goodCountArray = goodAmounts.split(" ");
        String[] evilCountArray = evilAmounts.split(" ");

        // create arrays with good and evil values
        int[] goodValuesArray = {1, 2, 3, 3, 4, 10};
        int[] evilValuesArray = {1, 2, 2, 2, 3, 5, 10};

        // create good and evil sums
        int goodSum = 0;
        int evilSum = 0;

        // loop through good array and evil array, multiplying the value to the count and adding it to the sum
        for(int i = 0; i < goodCountArray.length; i++) {
            goodSum += Integer.parseInt(goodCountArray[i]) * goodValuesArray[i];
        }

        for(int i = 0; i < evilCountArray.length; i++) {
            evilSum += Integer.parseInt(evilCountArray[i]) * evilValuesArray[i];
        }

        // create if statement to return values for which side wins
        if(goodSum > evilSum) {
            return "Battle Result: Good triumphs over Evil";
        } else if(evilSum > goodSum) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }
}
