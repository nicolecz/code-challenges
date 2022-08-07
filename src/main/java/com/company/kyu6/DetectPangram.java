package com.company.kyu6;

import java.util.HashSet;
import java.util.Set;

public class DetectPangram {

    public static void main(String[] args) {
        System.out.println(check("You shall not pass!"));
    }

    public static boolean check(String sentence) {
        // create hashset
        Set<Character> letterSet = new HashSet<>();
        sentence = sentence.toLowerCase();

        // loop through all characters in lowercase sentence. If alphabetic, add to set.
        for(int i = 0; i < sentence.length(); i++) {
            if(Character.isAlphabetic(sentence.charAt(i))) {
                letterSet.add(sentence.charAt(i));
            }
        }

        // if set size is 26, return true, else return false.
        return letterSet.size() == 26;
    }
}
