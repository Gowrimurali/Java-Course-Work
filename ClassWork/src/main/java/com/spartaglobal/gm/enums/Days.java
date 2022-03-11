package com.spartaglobal.gm.enums;

import java.util.Arrays;

public enum Days {

    MONDAY("Today is Monday"),
    TUESDAYS("Today is Tuesday"),
    WEDNESDAY("Today is Wednesday"),
    THURSDAY("Today is Thursday"),
    FRIDAY("Today is Friday"),
    SATURDAY("Today is Saturday"),
    SUNDAY("Today is Sunday");

    private String name;
    Days(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Days myDateObject = Days.SUNDAY;
        Days myDateObeject1 = Days.WEDNESDAY;
        System.out.println(myDateObeject1.compareTo(myDateObject));
        System.out.println(Arrays.toString(Days.values()));
        System.out.println(Days.WEDNESDAY);
    }
}
