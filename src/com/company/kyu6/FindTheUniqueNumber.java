package com.company.kyu6;

import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueNumber {

    public static void main(String[] args) {
        double[] arr = { 0, 1, 0 };
        System.out.println(findUniq(arr));
    }

    public static double findUniq(double arr[]) {
        // create hashMap
        Map<Double, Double> numberCount = new HashMap<>();

        // loop through all elements of the array and add to map with value as count
        for(int i = 0; i < arr.length; i++) {
            if(numberCount.containsKey(arr[i])) {
                numberCount.put(arr[i], numberCount.get(arr[i]) + 1.0);
            }
            else {
                numberCount.put(arr[i], 1.0);
            }
        }

        // return map key with value 1
        for(Map.Entry<Double,Double> valueCount : numberCount.entrySet()) {
            if(valueCount.getValue() == 1) {
                return valueCount.getKey();
            }
        }
        return -1;
    }
}
