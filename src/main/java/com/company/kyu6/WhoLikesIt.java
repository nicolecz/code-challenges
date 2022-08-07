package com.company.kyu6;

public class WhoLikesIt {

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob"));
    }

    public static String whoLikesIt(String... names) {
        // create switch statement
            // if array is empty
            // 1 name
            // 2 names
            // 3 names
            // 4+ names
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
    }
}
