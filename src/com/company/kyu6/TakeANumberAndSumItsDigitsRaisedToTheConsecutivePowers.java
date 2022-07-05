package com.company.kyu6;

import java.util.ArrayList;
import java.util.List;

public class TakeANumberAndSumItsDigitsRaisedToTheConsecutivePowers {

    public static void main(String[] args) {
        System.out.println(sumDigPow(10,150));
    }

    public static List<Long> sumDigPow(long a, long b) {
        // create ArrayList
        List<Long> result = new ArrayList<>();

        // loop through numbers between a and b, if Eureka, add to ArrayList
        while(a <= b) {
            if(isEureka(a)) {
                result.add(a);
            }
            a++;
        }

        // return ArrayList
        return result;
    }

    public static boolean isEureka(long num) {
        // create sum variable
        long digitSum = 0;

        // create copy of num to modify
        long copy = num;

        // create counter variable
        int counter = 0;

        // determine number of digits
        while(copy > 0) {
            counter++;
            copy /= 10;
        }

        // create copy of num to modify
        long numCopy = num;

        // loop through each digit, %10, take to power of counter, add to sum variable
        while(numCopy > 0) {
            digitSum += Math.pow((numCopy % 10),counter);
            numCopy /= 10;
            counter--;
        }
        // if sum variable = num, return true
        return num == digitSum;
    }
}
