package com.company.LeetCode;

import java.util.ArrayList;

public class ThreeSameDigitNumber {

    public static void main(String[] args) {
        System.out.println(largestGoodInteger("42352338"));
    }
    public static String largestGoodInteger(String num) {
        StringBuilder goodNumber = new StringBuilder();
        ArrayList<String> goodArrayList = new ArrayList<>();
        String largestNumber;

        for(int i = 0; i < num.length()-2; i++) {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                goodNumber.append(num.charAt(i));
                goodNumber.append(num.charAt(i+1));
                goodNumber.append(num.charAt(i+2));
                goodArrayList.add(goodNumber.toString());
                goodNumber.delete(0,goodNumber.length());
            }
        }


        if(goodArrayList.isEmpty()) {
            return "";
        }

        String[] intArray = new String[goodArrayList.size()];
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = goodArrayList.get(i);
        }

        int maxValue = 0;

        for(int i = 0; i < intArray.length; i++) {
            if(Integer.parseInt(intArray[i]) >= maxValue) {
                maxValue = Integer.parseInt(intArray[i]);
            }
        }


        String maxString = Integer.toString(maxValue);

        if(goodArrayList.contains("000") && maxValue > 0) {
            return "000";
        } else {

            return maxString;
        }
    }
}
