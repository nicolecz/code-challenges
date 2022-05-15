package com.company.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(words));
    }

    public static List<String> removeAnagrams(String[] words) {
        ArrayList<String> arrList = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            arrList.add(words[i]);
        }

        for(int i = 1; i < arrList.size(); i++) {
            if (sortedString(arrList.get(i)).equals(sortedString(arrList.get(i - 1)))) {
                arrList.remove(i);
                i--;
            }
        }

        return arrList;
    }

    public static String sortedString(String originalString) {
        char[] arr = originalString.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
}
