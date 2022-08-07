package com.company.kyu8;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(5,"Hello"));
    }
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder newString = new StringBuilder();
        for(int i = 0; i < repeat; i++) {
            newString.append(string);
        }
        return newString.toString();
    }
}
