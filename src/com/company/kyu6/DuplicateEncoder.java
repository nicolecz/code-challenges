package com.company.kyu6;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    public static void main(String[] args) {
        System.out.println(encode("   ()(   "));
    }

    public static String encode(String word) {
        // create hashmap and loop through each character in the string to determine frequency
        Map<Character, Integer> characterCount = new HashMap<>();

        for(int i = 0; i < word.length(); i++) {
            char currentChar = Character.toLowerCase(word.charAt(i));
            if(characterCount.containsKey(currentChar)) {
                characterCount.put(currentChar,characterCount.get(currentChar) + 1);
            } else {
                characterCount.put(currentChar, 1);
            }
        }

        // create a string builder
        StringBuilder encodedString = new StringBuilder();

        // loop through each character in the string again and add ( to string builder if frequency = 1, otherwise add )
        for(int i = 0; i < word.length(); i++) {
            char currentChar = Character.toLowerCase(word.charAt(i));
            if(characterCount.get(currentChar) > 1) {
                encodedString.append(")");
            } else {
                encodedString.append("(");
            }
        }

        // return string builder
        return encodedString.toString();
    }
}
