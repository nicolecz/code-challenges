package com.company.kyu7;

public class MoneyMoneyMoney {
    public static void main(String[] args) {
        System.out.println(calculateYears(1000.00,0.05,0.18,1000.00));
    }
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        double interestAmount;
        double taxAmount;
        double interestAfterTax;
        int years = 0;
        while(principal < desired) {
            interestAmount = principal * interest;
            taxAmount = interestAmount * tax;
            interestAfterTax = interestAmount - taxAmount;
            principal += interestAfterTax;
            years ++;
        }
        return years;
    }
}
