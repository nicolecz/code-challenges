package com.company.kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TwoToOne {
    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }
    public static String longest(String s1, String s2) {
        String newString = s1 + s2;
        TreeSet<Character> longestString = new TreeSet<>();
        for(int i = 0; i < newString.length(); i++) {
            longestString.add(newString.charAt(i));
        }
        return longestString.toString();
    }


//    public static void main(String[] args) {
//        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
//    }
//    public static String longest (String s1, String s2) {
//        String newString = s1 + s2;
//        ArrayList<Character> charArray = new ArrayList<>();
//        for(int i = 0; i < newString.length(); i++) {
//            charArray.add(newString.charAt(i));
//        }
//        Collections.sort(charArray);
//        for(int i = 0; i < charArray.size() - 1; i++) {
//            if(charArray.get(i) == charArray.get(i + 1)) {
//                charArray.remove(i + 1);
//                i--;
//            }
//        }
//        String longestString = "";
//        for(int i = 0; i < charArray.size(); i++) {
//            longestString += charArray.get(i);
//        }
//        return longestString;
//    }
}
