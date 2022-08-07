package com.company.kyu6;

public class ConsecutiveStrings {

    public static void main(String[] args) {
        String[] strarr = {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"};
        System.out.println(longestConsec(strarr,0));
    }

    public static String longestConsec(String[] strarr, int k) {
        if(strarr.length < k || k <= 0) {
            return "";
        }
        int maxStringLength = 0;
        int currentStringLength = 0;
        int count = 0;

        String longestString = "";
        StringBuilder currentString = new StringBuilder();

        for(int i = 0; i < strarr.length - k + 1; i++) {
            while(count < k) {
                currentStringLength += strarr[i + count].length();
                currentString.append(strarr[i + count]);
                count++;
            }
            if(currentStringLength > maxStringLength) {
                maxStringLength = currentStringLength;
                longestString = currentString.toString();
            }
            currentString.delete(0,currentString.length());
            currentStringLength = 0;
            count = 0;
        }

        return longestString;
    }
}
