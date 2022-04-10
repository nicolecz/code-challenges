package com.company.kyu7;

public class FixStringCase {
    public static void main(String[] args) {
        System.out.println(solve("coDE"));
    }
    public static String solve(final String str) {
        int upperCounter = 0;
        int lowerCounter = 0;
        char[] charArray = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(charArray[i])) {
                upperCounter++;
            }
            else if(Character.isLowerCase(charArray[i])) {
                lowerCounter++;
            }
        }
        if(upperCounter > lowerCounter) {
            for(int i = 0; i < str.length(); i++) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        } else {
            for(int i = 0; i < str.length(); i++) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        String convertedString = new String("");
        for(int i = 0; i < str.length(); i++) {
            convertedString += charArray[i];
        }
        return convertedString;
    }
}
