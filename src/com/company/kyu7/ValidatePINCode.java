package com.company.kyu7;

public class ValidatePINCode {
    public static void main(String[] args) {
        System.out.println(validatePIN("a234"));
    }
    public static boolean validatePIN(String pin) {
        boolean isNumber = false;
        for(int i = 0; i < pin.length(); i++) {
            if(Character.isDigit(pin.charAt(i))) {
                isNumber = true;
            } else {
                return false;
            }
        }
        if(pin.length() == 4 || pin.length() == 6 && isNumber) {
            return true;
        }
        return false;
    }
}
