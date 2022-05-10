package com.company.kyu6;

import java.util.Arrays;

public class WhereIsMyParentCry {

    public static void main(String[] args) {
        System.out.println(findChildren("CbcBcbaA"));
    }

    public static String findChildren(final String text) {
        char[] charArray = text.toLowerCase().toCharArray();

        Arrays.sort(charArray);

        StringBuilder charString = new StringBuilder();

        for(int i = 0; i < charArray.length; i++) {
            if(i == 0) {
                charString.append(Character.toUpperCase(charArray[i]));
            } else if(charArray[i] != charArray[i - 1]) {
                charString.append(Character.toUpperCase(charArray[i]));
            } else {
                charString.append(charArray[i]);
            }
        }

        return charString.toString();
    }
}

