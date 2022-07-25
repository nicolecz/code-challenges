package com.company.kyu6;

public class PersistentBugger {

    public static void main(String[] args) {
        System.out.println(persistence(25));
    }

    public static int persistence(long n) {

        // create int counter
        int counter = 0;

        if(numberOfDigits(n) == 1) {
            return counter;
        }

        // create while loop while n % 10 > 0
        while(numberOfDigits(n) > 1) {
            n = productOfDigits(n);
            counter++;
        }
        return counter;

    }

    // create new method to calculate number of digits
    public static int numberOfDigits(long n) {
        // create counter int
        int counter = 0;

        // create while loop while n % 10 > 0
        while (n > 0) {
            counter++;
            n /= 10;
        }
        // return int
        return counter;
    }

    // create new method to calculate product of digits
    public static long productOfDigits(long n) {
        long product = n % 10;
        n /= 10;

        while(n > 0) {
            product = product * (n % 10);
            n /= 10;
        }
        return product;
    }

}
