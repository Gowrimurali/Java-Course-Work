package com.spartaglobal.gm.FahrenheitToCelsius;

public class FahrenheitToCelsius {

    public static double convertToCelsius(double fahrenheit){
        return ((fahrenheit - 32) * 5)/9;
    }

    public static void main(String[] args) {
        System.out.println(convertToCelsius(50.0));
    }

}
