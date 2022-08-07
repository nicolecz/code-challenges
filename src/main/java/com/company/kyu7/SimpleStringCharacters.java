package com.company.kyu7;

import java.util.Arrays;

public class SimpleStringCharacters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft")));
    }

    public static int[] solve(String word) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numbersCount = 0;
        int specialCharCount = 0;

        int[] intArray = new int[4];

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCaseCount++;
            } else if (Character.isLowerCase(word.charAt(i))) {
                lowerCaseCount++;
            } else if (Character.isDigit(word.charAt(i))) {
                numbersCount++;
            } else {
                specialCharCount++;
            }
        }
        intArray[0] = upperCaseCount;
        intArray[1] = lowerCaseCount;
        intArray[2] = numbersCount;
        intArray[3] = specialCharCount;

        return intArray;
    }
}
