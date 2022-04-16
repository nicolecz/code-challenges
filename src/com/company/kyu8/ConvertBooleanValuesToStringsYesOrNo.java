package com.company.kyu8;

public class ConvertBooleanValuesToStringsYesOrNo {
    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }
    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}
