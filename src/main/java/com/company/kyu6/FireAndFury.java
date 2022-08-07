package com.company.kyu6;

import java.util.ArrayList;

public class FireAndFury {

    public static void main(String[] args) {
        System.out.println(fireAndFury("AAFIREBBFURYCC"));
    }

    public static String fireAndFury(final String tweet) {

        if (!tweet.contains("FIRE") && !tweet.contains("FURY") || tweet.matches(".*[^FIREUY]+.*") ) {
            return "Fake tweet.";
        }

        ArrayList<String> wordList = new ArrayList<>();
        for (int i = 0; i < tweet.length() - 3; i++) {
            if (tweet.startsWith("FIRE", i) || tweet.startsWith("FURY", i)) {
                wordList.add(tweet.substring(i, i + 4));
            }
        }

        StringBuilder response = new StringBuilder();
        boolean isFire = wordList.get(0).equalsIgnoreCase("FIRE");
        int fireCount = isFire ? 1 : 0;
        int furyCount = isFire ? 0 : 1;

        if (wordList.size() == 1) {
            return addStrings(response, isFire, 1).toString().trim();
        }

        for (int i = 1; i < wordList.size(); i++) {

            int count = (isFire) ? fireCount : furyCount;
            if (wordList.get(i).equals("FURY")) {
                if (isFire) {
                    addStrings(response, true, count);
                    isFire = false;
                    fireCount = 0;
                }
                furyCount++;
            }

            if (wordList.get(i).equals("FIRE")) {
                if (!isFire) {
                    addStrings(response, false, count);
                    isFire = true;
                    furyCount = 0;
                }
                fireCount++;
            }
        }

        if (fireCount > 0 || furyCount > 0) {
            int count = (isFire) ? fireCount : furyCount;
            addStrings(response, isFire, count);
        }

        return response.toString().trim();
    }

    public static StringBuilder addStrings(StringBuilder sb, boolean isFire, int count) {

        if (isFire) {
            sb.append(" You");
            sb.append(" and you".repeat(count - 1));
            sb.append(" are fired!");
        } else {
            sb.append(" I am");
            sb.append(" really".repeat(count - 1));
            sb.append(" furious.");
        }

        return sb;
    }
}
