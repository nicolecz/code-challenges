package com.company.kyu8;

public class ConvertAStringToANumber {
    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
    }
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
