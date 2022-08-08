package com.company.kyu6;

public class WhatsYourRunningPace {

    public static String calculate(double distance, String time) {
        // create new double variable for time converted to double
        String[] timeArray = time.split(":");
        double minutes = Double.parseDouble(timeArray[0]);
        double seconds = Double.parseDouble(timeArray[1]);
        double convertedTime = minutes + (seconds / 60);

        // create variable for calculating pace
        double pace = convertedTime / distance;

        // create minutes variable for pace
        int paceMinutes = (int) pace;

        // create seconds variable for pace
        double paceSeconds = (pace - paceMinutes) * 60;
        int paceSecondsInt = (int) Math.round(paceSeconds);

        if(paceSecondsInt == 60) {
            paceMinutes++;
            paceSecondsInt = 0;
        }

        // return minutes and seconds
        if(paceSecondsInt < 10) {
            return paceMinutes + ":0" + paceSecondsInt;
        }
        return paceMinutes + ":" + paceSecondsInt;
    }
}
