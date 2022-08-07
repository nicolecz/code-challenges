package com.company.kyu6;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {

    public static void main(String[] args) {
        String[] array1 = {"arp", "live", "strong"};
        String[] array2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        System.out.println(Arrays.toString(inArray(array1,array2)));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> containsTree = new TreeSet<>();

        for(int i = 0; i < array2.length; i++) {
            for(int j = 0; j < array1.length; j++) {
                if(array2[i].contains(array1[j])) {
                    containsTree.add(array1[j]);
                }
            }
        }
        String[] newArray = new String[containsTree.size()];
        containsTree.toArray(newArray);
        return newArray;
    }
}
