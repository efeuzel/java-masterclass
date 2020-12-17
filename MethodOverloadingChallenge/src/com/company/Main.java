package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,10));
        System.out.println(getDurationString(100_000));
        System.out.println(getDurationString(-42));
        System.out.println(getDurationString(65,9));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0) return INVALID_VALUE_MESSAGE;
        if (seconds < 0 || seconds > 59) return INVALID_VALUE_MESSAGE;
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String remainderMinutesString = remainderMinutes + "m";
        if (remainderMinutes < 10) {
            remainderMinutesString = "0" + remainderMinutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10)  {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + remainderMinutesString + " " + secondsString;
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) return INVALID_VALUE_MESSAGE;
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }

}
