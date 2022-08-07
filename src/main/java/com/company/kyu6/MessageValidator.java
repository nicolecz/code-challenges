package com.company.kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageValidator {
    public static void main(String[] args) {
        System.out.println(isValidMessageWithRegex("3cat"));
    }

    public static boolean isAValidMessage(String message) {
        // create variable for number
        int number = 0;

        // create variable for word length
        int wordLength = 0;

        // create boolean variable to return if message is valid, default to true
        boolean isLetter = false;
        boolean valid = true;

        if (message.isEmpty()) {
            return true;
        }

        if(message.length() == 1 && message.charAt(0) == '0') {
            return true;
        }

        if (Character.isAlphabetic(message.charAt(0)) || Character.isDigit(message.charAt(message.length() - 1))) {
            return false;
        }



        // loop through each character in the string. If it's a number, set number equal to it, if it's a character, word length ++
        for (int i = 0; i < message.length(); i++) {
            if (Character.isDigit(message.charAt(i)) && isLetter) {
                if (number != wordLength) {
                    return false;
                }
                isLetter = false;
                number = 0;
                wordLength = 0;
            }
            if (Character.isDigit(message.charAt(i)) && !isLetter) {
                number = (number * 10) + Character.getNumericValue(message.charAt(i));
            } else if (Character.isAlphabetic(message.charAt(i))) {
                wordLength++;
                isLetter = true;
            }
        }
        valid = number == wordLength;

        // return boolean variable
        return valid;
    }

    public static boolean isValidMessageWithRegex(String message){

        String regex = "(\\d+)([a-zA-Z]*)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);

        while (matcher.find()){

            int number = Integer.parseInt(matcher.group(1));
            String text = matcher.group(2);

            if(number != text.length()) return false;
        }
        return true;
    }
}
