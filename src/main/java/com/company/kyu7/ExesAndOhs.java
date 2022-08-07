package com.company.kyu7;

import java.util.HashMap;
import java.util.Map;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
    }
    public static boolean getXO(String str) {
        String lowerString = str.toLowerCase();
        Map<Character, Integer> xoMap = new HashMap<>();
        for(int i = 0; i < lowerString.length(); i++) {

            char character = lowerString.charAt(i);
            if(xoMap.containsKey(character)) {
                xoMap.put(character, (xoMap.get(character) + 1));
            } else {
                xoMap.put(character, 1);
            }
        }
        if(!xoMap.containsKey('x') && !xoMap.containsKey('o')) {
            return true;
        }
        if(!xoMap.containsKey('x') || !xoMap.containsKey('o')) {
            return false;
        }
        if(xoMap.get('x').equals(xoMap.get('o'))) {
            return true;
        }
        return false;
    }
}
