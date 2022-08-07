package com.company.kyu6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortAndCountWordsInParagraph {
    public static void main(String[] args) {
        System.out.println(wordCount("You live in the city of Cartesia where all roads are laid out in a perfect grid. You " +
                "arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a " +
                "short walk."));
    }

    public static Map<String, Integer> wordCount(String paragraph) {
        String[] stringArray = paragraph.split(" ");
        Map<String, Integer> wordMap = new TreeMap<>();
        for(int i = 0; i < stringArray.length; i++) {
            if(wordMap.containsKey(stringArray[i])) {
                wordMap.put(stringArray[i],wordMap.get(stringArray[i]) + 1);
            } else {
                wordMap.put(stringArray[i], 1);
            }
        }
        return wordMap;
    }
}
