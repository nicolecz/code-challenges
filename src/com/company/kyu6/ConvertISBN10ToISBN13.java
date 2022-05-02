package com.company.kyu6;

public class ConvertISBN10ToISBN13 {
    public static void main(String[] args) {
        System.out.println(isbnConverter("1-7982-0894-6"));
    }

    public static String isbnConverter(String isbn) {
        StringBuilder modifiedString = new StringBuilder(isbn);
        modifiedString.deleteCharAt(12);

        modifiedString.insert(0,"978-");

        int sum = 0;
        int counter = 0;

        for(int i = 0; i < modifiedString.length(); i++) {
            if(Character.isDigit(modifiedString.charAt(i)) && (counter % 2 == 0)) {
                sum += Character.getNumericValue(modifiedString.charAt(i));
                counter++;
            } else if(Character.isDigit(modifiedString.charAt(i)) && (counter % 2 != 0)) {
                sum += Character.getNumericValue(modifiedString.charAt(i)) * 3;
                counter++;
            }
        }

        int endDigit = sum % 10;

        int checkDigit;

        if(endDigit == 0) {
            checkDigit = endDigit;
        } else {
            checkDigit = 10 - endDigit;
        }

        modifiedString.append(checkDigit);

        return modifiedString.toString();
    }
}
