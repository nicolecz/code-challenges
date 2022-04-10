package com.company.kyu7;

import java.util.Arrays;

public class ComplementaryDNA {

    public static void main(String[] args) {
        String dna = "ATGC";
        System.out.println(makeComplement(dna));
    }

    public static String makeComplement(String dna) {
        char[] charArray = dna.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case 'A':
                    charArray[i] = 'T';
                    break;
                case 'T':
                    charArray[i] = 'A';
                    break;
                case 'C':
                    charArray[i] = 'G';
                    break;
                case 'G':
                    charArray[i] = 'C';
                    break;
            }
        }
        String stringArray = new String(charArray);
        return stringArray;
    }
}
