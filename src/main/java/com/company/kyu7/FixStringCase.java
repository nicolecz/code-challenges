package com.company.kyu7;

public class FixStringCase {
    public static void main(String[] args) {
        System.out.println(solve("coDE"));
    }
    public static String solve(final String str) {
        String result = str;
        int upperCounter = 0;
        int lowerCounter = 0;
        
        for(int i = 0; i < str.length(); i++) {
            
            if(Character.isUpperCase(result.charAt(i))) {
                upperCounter++;
            }
            else if(Character.isLowerCase(result.charAt(i))) {
                lowerCounter++;
            }
        }
        result = (upperCounter > lowerCounter) ? result.toUpperCase() : result.toLowerCase();
//        if(upperCounter > lowerCounter) {
//            result = result.toUpperCase();
//        } else {
//            result = result.toLowerCase();
//        }
      
        return result;
    }
}
