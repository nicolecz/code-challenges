package com.company.kyu8;

public class ParseIntFromChar {
    public static int howOld(final String herOld) {
        char ageChar = herOld.charAt(0);
        return Character.getNumericValue(ageChar);
    }
}
