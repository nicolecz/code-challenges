package com.company.kyu6;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitStrings {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("HelloWorld")));
    }

    public static String[] solution(String s) {
        // create ArrayList
        ArrayList<String> stringList = new ArrayList<>();

        // create charcounter
        int charCount = 0;

        // create StringBuilder
        StringBuilder twoChar = new StringBuilder();

        // determine if string length is odd
        boolean isOdd = s.length() % 2 > 0;

        // loop through each character of the String
        for(int i = 0; i < s.length(); i++) {
            twoChar.append(s.charAt(i));
            charCount++;

            if(charCount == 2) {
                stringList.add(twoChar.toString());
                twoChar.delete(0,twoChar.length());
                charCount = 0;
            }
            if(i == s.length() - 1 && isOdd) {
                twoChar.append("_");
                stringList.add(twoChar.toString());
            }
        }

        return stringList.toArray(new String[0]);
    }
}
