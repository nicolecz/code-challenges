package com.company.kyu7;

public class ReverseLetter {
    public static void main(String[] args) {
        System.out.println(reverseLetter("fa15rm"));
    }
    public static String reverseLetter(final String str) {
        StringBuilder builder = new StringBuilder(str).reverse();
        for(int i = 0; i < builder.length(); i++) {
            if(!Character.isAlphabetic(builder.charAt(i))) {
                builder.deleteCharAt(i--);
            }
        }
        return builder.toString();
    }
}
