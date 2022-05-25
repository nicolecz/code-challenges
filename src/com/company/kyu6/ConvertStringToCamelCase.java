package com.company.kyu6;

public class ConvertStringToCamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }

    public static String toCamelCase(String s) {
        // convert string into split array
        String[] arr = s.split("-|_");

        // create StringBuilder
        StringBuilder newString = new StringBuilder();

        // add first element to StringBuilder
        newString.append(arr[0]);

        // loop through each element in the array, check if first letter is capitalized
        // Capitalize the first letter of each word and add to string builder
        for(int i = 1; i < arr.length; i++) {
            newString.append(arr[i].substring(0,1).toUpperCase() + arr[i].substring(1));
        }

        return newString.toString();
    }
}
