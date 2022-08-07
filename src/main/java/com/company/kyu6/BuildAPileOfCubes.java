package com.company.kyu6;

public class BuildAPileOfCubes {
    public static void main(String[] args) {
        System.out.println(findNb(1609074227202466816L));
    }
    public static long findNb(long m) {
        long sum = 0;
        long numberOfCubes = 0;
        while(sum < m) {
            numberOfCubes++;
            sum += (numberOfCubes * numberOfCubes * numberOfCubes);
        }
        return sum == m ? numberOfCubes : -1;
//        if(sum == m) {
//            return numberOfCubes;
//        }
//        else {
//            return -1;
//        }
    }
}
