package com.company.kyu6;

public class HiddenCubicNumbers {

    public static void main(String[] args) {
        System.out.println(isSumOfCubes("407tshjfgh"));
        System.out.println(isCubicNumber(407));
    }
    public static String isSumOfCubes(String s) {
        int sum = 0;
        int count = 0;
        int number = 0;
        StringBuilder cubes = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                number = (number * 10) +
                        Character.getNumericValue(s.charAt(i));
                count++;

                if(count == 3) {
                    if(isCubicNumber(number)){
                        sum = sumAndAppend(sum, number, cubes);
                    }
                    count = 0;
                    number = 0;
                }
            }
            else if(count > 0){
                if(isCubicNumber(number)){
                    sum = sumAndAppend(sum, number, cubes);
                }
                count = 0;
                number = 0;
            }
        }

        if(count > 0 && isCubicNumber(number)){
            sum = sumAndAppend(sum, number, cubes);
        }

        cubes.append((cubes.length() > 0) ? sum + " Lucky" : "Unlucky");

        return cubes.toString();
    }

    public static int sumAndAppend(int sum, int number, StringBuilder cubes){
        sum += number;
        cubes.append(number);
        cubes.append(" ");
        return sum;
    }
    public static boolean isCubicNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        while(number > 0) {
            sum += (Math.pow(number % 10,3));
            number /= 10;
        }
        return sum == originalNumber;
    }
}
