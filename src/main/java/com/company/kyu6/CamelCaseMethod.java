package com.company.kyu6;

public class CamelCaseMethod {

    public static String camelCase(String str) {

        if(str.isEmpty()) {
            return str;
        }

        if(Character.isSpaceChar(str.charAt(0)) && str.length() == 1) {
            return "";
        }

        if(str.length() == 1) {
            return str.toUpperCase();
        }

        // create array and split words based on space as delimiter
        String[] wordArray = str.split(" ");

        // create StringBuilder
        StringBuilder camelString = new StringBuilder("");

        // loop through array and capitalize the first letter and make sure the remaining letters are lowercase. Add word to StringBuilder
        for(int i = 0; i < wordArray.length; i++) {
            if(!wordArray[i].isEmpty()) {
                wordArray[i] = Character.toUpperCase(wordArray[i].charAt(0)) + wordArray[i].substring(1).toLowerCase();
                camelString.append(wordArray[i]);
            }
        }

        // return StringBuilder as string
        return camelString.toString();
    }
}
