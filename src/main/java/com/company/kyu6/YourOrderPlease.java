package com.company.kyu6;

public class YourOrderPlease {

    public static void main(String[] args) {
        System.out.println(order(""));
    }

    public static String order(String words) {
        // if String is empty, return empty string
        if(words.length() == 0) {
            return "";
        }

        // create array and split string at each space, making each word an element of the array
        String[] wordArray = words.split(" ");

        int counter = 1;

        // create a StringBuilder
        StringBuilder sortedString = new StringBuilder();

        // loop through each element of the array to see if it contains the counter variable. If it does, append to StringBuilder
        while(sortedString.length() - 1 < words.length()) {
            for (int i = 0; i < wordArray.length; i++) {
                if (wordArray[i].contains(counter + "")) {
                    sortedString.append(wordArray[i] + " ");
                    counter++;
                }
            }
        }

        // return StringBuilder
        return sortedString.toString().trim();
    }
}
