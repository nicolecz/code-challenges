package com.company.LeetCode;

public class PercentageOfLetterInString {

    public static void main(String[] args) {
        System.out.println(percentageLetter("jjjj",'k'));
    }

    public static int percentageLetter(String s, char letter) {
        double letterCount = 0;
        double charCount = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter) {
                letterCount++;
            }
            charCount++;
        }
        System.out.println("letter count " + letterCount);
        System.out.println("char count " + charCount);

        double letterPercent = (letterCount / charCount) * 100.0;

        return (int)letterPercent;
    }
}
