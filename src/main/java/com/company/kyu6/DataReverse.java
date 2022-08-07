package com.company.kyu6;


import java.util.Arrays;

public class DataReverse {
    public static void main(String[] args) {
        int[] data = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(reverseData(data)));
    }
    public static int[] reverseData(int[] data) {

        int[] newArray = new int[data.length];
        int segment = 0;
        for(int i = 0; i < data.length; i++) {

            segment += (i % 8 == 0) ? 8 : 0;

            newArray[i] = data[data.length - segment + (i % 8)];
        }
        return newArray;
    }
}
