package com.company.kyu6;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        System.out.println(countSmileys(a));
    }

    public static int countSmileys(List<String> arr) {
        int smileys = 0;

        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i).charAt(0) == ':' || arr.get(i).charAt(0) == ';' ) {
                if (arr.get(i).length() == 2) {
                    if (arr.get(i).charAt(1) == ')' || arr.get(i).charAt(1) == 'D' ) {
                        smileys++;
                    }
                }
                if (arr.get(i).length() == 3) {
                    if (arr.get(i).charAt(2) == ')' || arr.get(i).charAt(2) == 'D' ) {
                        if (arr.get(i).charAt(1) == '-' || arr.get(i).charAt(1) == '~' ) {
                            smileys++;
                        }
                    }
                }
            }
        }
        return smileys;
    }
}
