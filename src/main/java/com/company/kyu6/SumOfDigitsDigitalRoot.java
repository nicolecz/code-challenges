package com.company.kyu6;

public class SumOfDigitsDigitalRoot {

    public static void main(String[] args) {
        System.out.println(digital_root(16));
    }

    public static int digital_root(int n) {
        int sum = sumDigits(n);

        while (sum / 10 > 0) {
            sum = sumDigits(sum);
        }
        return sum;
    }

    public static int sumDigits(int n) {
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
