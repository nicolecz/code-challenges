package com.company.kyu6;

public class BreakCamelCase {

    public static void main(String[] args) {
        System.out.println(camelCase("camelcasingtest"));
    }

    public static String camelCase(String input) {
        // create StringBuilder
        StringBuilder stringWithSpaces = new StringBuilder();

        // create for loop to go through each character in the string.
        // if character is lower case, append to StringBuilder
        // if character is upper case, first append " " and then character to StringBuilder

        for(int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))) {
                stringWithSpaces.append(" ");
                stringWithSpaces.append(input.charAt(i));
            } else {
                stringWithSpaces.append(input.charAt(i));
            }
        }

        // return StringBuilder toString
        return stringWithSpaces.toString();
    }
}
