package com.company.kyu6;

public class RemoveTheParentheses {

    public static void main(String[] args) {
        System.out.println(removeParentheses("(first group) (second group) (third group)"));
    }

    public static String removeParentheses(final String str) {
        StringBuilder noParentheses = new StringBuilder();
        boolean inParentheses = false;
        int openingParenthesesCount = 0;
        int closingParenthesesCount = 0;

        for(int i = 0; i < str.length(); i++) {
            if((Character.isAlphabetic(str.charAt(i)) || Character.isSpaceChar(str.charAt(i))) && (!inParentheses)) {
                noParentheses.append(str.charAt(i));
            }
            if(str.charAt(i) == '(') {
                openingParenthesesCount++;
                inParentheses = true;
            }
            if(str.charAt(i) == ')') {
                closingParenthesesCount++;
            }
            if(closingParenthesesCount == openingParenthesesCount) {
                inParentheses = false;
            }
        }

        return noParentheses.toString();
    }
}
