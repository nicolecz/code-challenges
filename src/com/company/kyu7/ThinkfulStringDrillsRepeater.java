package com.company.kyu7;

public class ThinkfulStringDrillsRepeater {
    public static void main(String[] args) {
        System.out.println(repeat("hi",10));
    }
    public static String repeat(String string, long n) {
        StringBuilder repeatingString = new StringBuilder();
        for(int i = 0; i < n; i++) {
            repeatingString.append(string);
        }
        return repeatingString.toString();
    }

}
