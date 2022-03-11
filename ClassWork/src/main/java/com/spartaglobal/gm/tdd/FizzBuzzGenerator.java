package com.spartaglobal.gm.tdd;

public class FizzBuzzGenerator {
    public static String getFizzBuzzValue(int number) {
        if ((number % 5 == 0) && (number % 7 == 0)) {
            return "FizzBuzz";
        } else if (number % 7 == 0) {
            return "Buzz";
        }else if(number % 5 == 0) {
            return "Fizz";
        }else{
            return String.valueOf(number);
        }
    }
}