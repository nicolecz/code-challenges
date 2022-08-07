package com.company.kyu7;

public class MaximumLengthDifference {
    public static void main(String[] args) {
        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(mxdiflg(a1,a2));
    }
    public static int mxdiflg(String[] a1, String[] a2) {
        int a1Max = Integer.MIN_VALUE;
        int a1Min = Integer.MAX_VALUE;
        int a2Max = Integer.MIN_VALUE;
        int a2Min = Integer.MAX_VALUE;

        if((a1.length == 0) || (a2.length == 0)) {
            return -1;
        }

        for(int i = 0; i < a1.length; i++) {
            if(a1[i].length() < a1Min) {
                a1Min = a1[i].length();
            }
            if(a1[i].length() > a1Max) {
                a1Max = a1[i].length();
            }
        }
        for(int i = 0; i < a2.length; i++) {
            if(a2[i].length() < a2Min) {
                a2Min = a2[i].length();
            }
            if(a2[i].length() > a2Max) {
                a2Max = a2[i].length();
            }
        }

        if(Math.abs(a2Max - a1Min) > Math.abs(a1Max - a2Min)) {
            return Math.abs((a2Max - a1Min));
        }
        else {
            return Math.abs(a1Max - a2Min);
        }

    }
}
