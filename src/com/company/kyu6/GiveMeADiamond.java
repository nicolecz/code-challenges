package com.company.kyu6;

public class GiveMeADiamond {

    public static void main(String[] args) {
        System.out.println(print(5));
    }

    public static String print(int n) {
        StringBuilder sb = new StringBuilder();
        int starNumber = 1;
        int spaceNumber = (n / 2);
        int starCount = 0;
        int spaceCount = 0;

        if(n % 2 == 0 || n <= 0) {
            return null;
        }

        for(int i = 0; i <= n / 2; i++) {
            while (starNumber <= n) {
                while (spaceCount < spaceNumber) {
                    sb.append(" ");
                    spaceCount++;
                }
                while (starCount < starNumber) {
                    sb.append("*");
                    starCount++;
                }
                sb.append("\n");
                starCount = 0;
                spaceCount = 0;
                starNumber += 2;
                spaceNumber--;
            }
        }
        spaceNumber = 0;
        starNumber = n;
        for(int i = 0; i < n / 2; i++) {
            starNumber -= 2;
            spaceNumber++;
            while (spaceNumber > spaceCount) {
                sb.append(" ");
                spaceCount++;
            }
            while (starNumber > starCount) {
                sb.append("*");
                starCount++;
            }
            sb.append("\n");
            starCount = 0;
            spaceCount = 0;
        }
        return sb.toString();
    }
}
