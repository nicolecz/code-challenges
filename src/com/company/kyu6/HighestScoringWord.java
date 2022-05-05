package com.company.kyu6;

public class HighestScoringWord {

    public static void main(String[] args) {
        System.out.println(high("aaa b"));
    }

    public static String high(String s) {

        String[] wordArray = s.split(" ");

        int wordValue = 0;
        int newWordValue = 0;

        String highestWord = "";

        for(int i = 0; i <wordArray.length; i++) {
            for(int j = 0; j < wordArray[i].length(); j++) {
                newWordValue += wordArray[i].charAt(j) - 'a' + 1;
            }
            if(newWordValue > wordValue) {
                wordValue = newWordValue;
                highestWord = wordArray[i];
                newWordValue = 0;
            } else {
                newWordValue = 0;
            }
        }

        return highestWord;
    }
}
