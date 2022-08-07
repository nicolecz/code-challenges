package com.company.kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountWordInParagraph {
    public static void main(String[] args) {
        System.out.println(wordCount("You live in the city of Cartesia where all roads are laid out in a perfect grid. You " +
                "arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a " +
                "short walk.","the"));
    }
    public static int wordCount(String paragraph, String word) {
//        int count = 0;
        String[] stringArray = paragraph.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();
        for(int i = 0; i < stringArray.length; i++) {
            if(wordMap.containsKey(stringArray[i])) {
                wordMap.put(stringArray[i],wordMap.get(stringArray[i]) + 1);
            } else {
                wordMap.put(stringArray[i], 1);
            }
        }

//        for(int i = 0; i < stringArray.length; i++) {
//            if(stringArray[i].equals(word)) {
//                count++;
//            }
//        }
//         return count;
        return wordMap.get(word);
    }
}
