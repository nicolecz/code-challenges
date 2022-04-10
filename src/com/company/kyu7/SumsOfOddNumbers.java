package com.company.kyu7;

import java.util.ArrayList;
import java.util.List;

public class SumsOfOddNumbers {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(4));
    }
    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        List<Integer> oddNumbers = new ArrayList<>();
        int countOfInts = 0;
        for(int i = 1; i <= n; i++) {
            countOfInts += i;
        }
        int number = 0;
        for(int i = 1; i <= countOfInts; i++) {
            oddNumbers.add(number + 1);
            number += 2;
        }
        for(int i = 0; i < n; i++) {
            sum += oddNumbers.get(oddNumbers.size()-(n - i));
        }
        return sum;
    }
}
