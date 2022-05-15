package com.company.kyu6;

public class StopSpinningMyWords {

    public static void main(String[] args) {
        System.out.println(spinWords("This is another test"));
    }

    public static String spinWords(String sentence) {
        // create Array and add all words
        String[] wordList = sentence.split(" ");

        // create String builder
        StringBuilder updatedSentence = new StringBuilder();

        // use for loop to go through each element in the arraylist, determine length, add to string builder, and reverse words >= 5 characters
        for(int i = 0; i < wordList.length; i++) {
            if(wordList[i].length() < 5) {
                updatedSentence.append(wordList[i] + " ");
            } else {
                updatedSentence.append(reverseWord(wordList[i]) + " ");
            }
        }

        // return String builder
        return updatedSentence.toString().trim();
    }

    public static String reverseWord(String word) {
        StringBuilder newWord = new StringBuilder();
        for(int i = word.length() - 1; i >= 0; i--) {
            newWord.append(word.charAt(i));
        }
        return newWord.toString();
    }
}
