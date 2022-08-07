package com.company.kyu7;

public class StringMerge {

    public static void main(String[] args) {
        System.out.println(stringMerge("wonderful", "people", 'e'));
    }

    public static String stringMerge(String s1, String s2, char letter) {
        StringBuilder modifiedString = new StringBuilder();
        boolean foundLetter = false;
        boolean foundLetterAgain = false;

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == letter && !foundLetter) {
                modifiedString.append(s1.substring(0,i));
                modifiedString.append(letter);
                foundLetter = true;
            }
        }
        for(int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == letter && !foundLetterAgain) {
                modifiedString.append(s2.substring(i + 1, s2.length()));
                foundLetterAgain = true;
            }
        }
        return modifiedString.toString();
    }
}
