package com.company.kyu6;

public class TakeATenMinutesWalk {
    public static void main(String[] args) {
        char[] walk = {'n','n','n','s','n','s','n','s','n','s'};
        System.out.println(isValid(walk));
    }
    public static boolean isValid(char[] walk) {
        int sCount = 0;
        int nCount = 0;
        int eCount = 0;
        int wCount = 0;

        for(int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n':
                    nCount++;
                    break;
                case 's':
                    sCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'w':
                    wCount++;
                    break;
            }
        }
        if((walk.length == 10) && (sCount == nCount) && (eCount == wCount)) {
            return true;
        }
        return false;
    }
}
