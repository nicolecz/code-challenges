package com.company.kyu7;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        if(str.length() >= ending.length()) {
            String endOfStr = str.substring(str.length() - ending.length());
            return endOfStr.equals(ending);
        }
        else{
            return false;
        }
    }
}
