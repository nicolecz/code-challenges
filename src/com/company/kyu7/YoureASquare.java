package com.company.kyu7;

public class YoureASquare {
    public static void main(String[] args) {
        System.out.println(isSquare(145908496));
    }
    public static boolean isSquare(int n) {
        if(n < 0) {
            return false;
        }
        for(long i = 0; i <= n/2; i++) {
            if((i*i) == n) {
                System.out.println(i * i);
                System.out.println(n);
                return true;
            }
        }
        return false;
    }
}
