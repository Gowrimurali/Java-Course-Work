package com.spartaglobal.gm.WeekAndDays;

public class WeeksAndDays {

    public static String getWeeksAndDays (int number){
        int week = number / 7;
        int days = number % 7;
        return week + " week/s and " + days + " day/s";
    }

    public static void main(String[] args) {
        System.out.println(getWeeksAndDays(15));
    }
}
