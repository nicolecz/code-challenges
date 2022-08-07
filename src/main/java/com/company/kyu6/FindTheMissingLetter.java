package com.company.kyu6;

public class FindTheMissingLetter {
    public static void main(String[] args) {
        char[] array = {'O','Q','R','S'};
        System.out.println(findMissingLetter(array));
    }

    public static char findMissingLetter(char[] array) {
        // loop through each element of the array and subtract each element from the next element. If the variance is greater
        // than one, the missing character will be between those two elements

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i + 1] - array[i] > 1) {
                return (char) (array[i] + 1);
            }
        }

        // add one to current index value and return the corresponding char
        return 'x';
    }
}
