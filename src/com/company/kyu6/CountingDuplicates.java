package com.company.kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("ABBA"));
    }

    public static int duplicateCount(String text) {
        int duplicates = 0;
        String lowerCaseString = text.toLowerCase();
        System.out.println(lowerCaseString);

        Map<Character, Integer> duplicateMap = new HashMap<>();

        for(int i = 0; i < lowerCaseString.length(); i++) {

            char stringChar = lowerCaseString.charAt(i);

            if(duplicateMap.containsKey(stringChar)) {
                duplicateMap.put(stringChar,duplicateMap.get(stringChar) + 1);
            } else {
                duplicateMap.put(stringChar, 1);
            }
        }

        System.out.println(duplicateMap.toString());

        for(Integer myInt : duplicateMap.values()) {
            if(myInt > 1) {
                duplicates++;
            }
        }


        return duplicates;
    }
}
