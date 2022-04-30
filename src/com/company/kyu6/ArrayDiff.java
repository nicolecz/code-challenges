package com.company.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayDiff {

    public static void main(String[] args) {
        int[] a = {1,2,2};
        int[] b = {2};

        System.out.println(Arrays.toString(arrayDiff_yousuck(a, b)));
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            newArray.add(a[i]);
        }
        for (int i = 0; i < newArray.size(); i++) {
            if (b.length > 0) {
                for (int j = 0; j < b.length; j++) {
                    if (newArray.get(i).equals(b[j])) {
                        newArray.remove(i);
                        i--;
                    }
                }
            }
        }
        int[] diffArray = new int[newArray.size()];
        for (int i = 0; i < newArray.size(); i++) {
            diffArray[i] = newArray.get(i);
        }
        return diffArray;
//        ArrayList<Integer> newArray = new ArrayList<>();
//
//            for (int i = 0; i < a.length; i++) {
//                if (b.length > 0) {
//                    for (int j = 0; j < b.length; j++) {
//                        if (a[i] != b[j]) {
//                            newArray.add(a[i]);
//                        }
//                    }
//                } else {
//                    newArray.add(a[i]);
//                }
//            }
//        int[] diffArray = new int[newArray.size()];
//        for(int i = 0; i < newArray.size(); i++) {
//            diffArray[i] = newArray.get(i);
//        }
//        return diffArray;
    }

    public static int[] arrayDiff_yousuck(int[] a, int[] b) {

        ArrayList<Integer> solution = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean contains = false;
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    contains = true;
                    break;
                }
            }
            if(!contains){
                solution.add(a[i]);
            }
        }

        int[] diffArray = new int[solution.size()];
        for(int i = 0; i < solution.size(); i++) {
            diffArray[i] = solution.get(i);
        }
        return diffArray;
    }

    public static int[] arrayDiff_gooder(int[] a, int[] b) {

        ArrayList<Integer> solution = new ArrayList<>();
        Set<Integer> bSet = IntStream.of(b).boxed().collect(Collectors.toSet());

        for (int num : a) {
            if (!bSet.contains(num)) {
                solution.add(num);
            }
        }

        return solution.stream().mapToInt(i -> i).toArray();
    }
}
