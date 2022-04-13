package com.company.kyu6;

import java.util.Arrays;

public class BuyingACar {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nbMonths(8000,8000,1000,1.5)));
    }

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int totalSavings = 0;
        double currentPriceOld = startPriceOld;
        double currentPriceNew = startPriceNew;
        int monthCount = 0;
        double percentLoss = percentLossByMonth / 100;
        double moneyLeft = 0;

        int[] monthsArray = new int[2];
        if(startPriceOld > startPriceNew) {
            monthsArray[1] = startPriceOld - startPriceNew;
        } else {
            while (currentPriceOld + totalSavings < currentPriceNew) {
                monthCount++;
                if (monthCount % 2 == 0) {
                    percentLoss += 0.005;
                }
                totalSavings += savingperMonth;
                currentPriceOld = currentPriceOld - (currentPriceOld * percentLoss);
                currentPriceNew = currentPriceNew - (currentPriceNew * percentLoss);
                moneyLeft = Math.round((currentPriceOld + totalSavings) - currentPriceNew);
            }

            monthsArray[0] = monthCount;
            monthsArray[1] = (int) moneyLeft;
        }
        return monthsArray;
    }
}
