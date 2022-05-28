package com.company.kyu6;

import java.util.Arrays;

public class BuildTower {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(6)));
    }

    public static String[] towerBuilder(int nFloors) {
        // starCount+=2
        // spaceCount-=1
        int starCount = 1;
        int spaceCount = nFloors - 1;

        // create StringBuilder
        StringBuilder tempString = new StringBuilder();

        // create String array
        String[] stringArray = new String[nFloors];

        // add StringBuilder to array, then zero out StringBuilder
        for(int i = 0; i < nFloors; i++) {
            tempString.append(" ".repeat(spaceCount));
            tempString.append("*".repeat(starCount));
            tempString.append(" ".repeat(spaceCount));
            stringArray[i] = tempString.toString();
            tempString.delete(0,tempString.length());
            starCount += 2;
            spaceCount--;
        }

        // return String array
        return stringArray;
    }
}
