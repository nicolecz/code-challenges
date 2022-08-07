package com.company.kyu6;

import java.util.Arrays;

public class MexicanWave {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave(" gap ")));
    }

    public static String[] wave(String str) {

        // loop through characters in str to determine how many are alphabetic
        int alphabeticCount = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                alphabeticCount++;
            }
        }

        // create String array with length of alphabetic characters
        String[] wave = new String[alphabeticCount];
        Arrays.fill(wave, str);

        int index = 0;

        for(int i = 0; i < wave.length; i++, index++) {
            if(Character.isSpaceChar(wave[i].charAt(index))){
                i--;
            }
            else{
                wave[i] = capLetter2(str, index);
            }
        }

        return wave;
    }

    private static String capLetter2(String str, int index) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index, Character.toUpperCase(str.charAt(index)));
        return sb.toString();
    }
}
