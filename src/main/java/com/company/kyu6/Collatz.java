package com.company.kyu6;

public class Collatz {

    public static void main(String[] args) {
        System.out.println(collatz(3));
    }

    public static String collatz(int n) {
        // Create StringBuilder
        StringBuilder resultString = new StringBuilder();

        // add n to String Builder
        resultString.append(n);

        // create while loop while n isn't equal to 1
        // if even, n/2
        // if odd, 3n + 1
        // add to stringbuilder "->"
        // add result of calculation to stringbuilder
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n) + 1;
            }
            resultString.append("->");
            resultString.append(n);
        }

        // return string of result
        return resultString.toString();
    }
}
