package com.company.kyu8;

public class IfYouCantSleepCountSheep {
    public static String countingSheep(int num) {

        StringBuilder sheepString = new StringBuilder();
        for(int i = 1; i<= num; i++) {
            sheepString.append(i).append(" sheep...");
        }
        return sheepString.toString();
    }
}
