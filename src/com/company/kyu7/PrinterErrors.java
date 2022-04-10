package com.company.kyu7;

public class PrinterErrors {

    public static void main(String[] args) {
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }

    public static String printerError(String s) {
        int length = s.length();
        int errorCounter = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > 'm') {
                errorCounter++;
            }
        }
        return errorCounter + "/" + length;
    }
}
