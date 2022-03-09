package com.spartaglobal.gm.enums;

import java.util.Arrays;
import java.util.Scanner;

public enum Colous {
    COLOUR1("red", 101),
    COLOUR2("green", 102),
    COLOUR3("yellow", 103),
    COLOUR4("blue", 104),
    COLOUR5("black", 105),
    COLOUR6("white", 106);

    private String colourName;
    private int colourCode;

    Colous(String colourName, int colourCode) {
        this.colourName = colourName;
        this.colourCode = colourCode;
    }


    private static void printColourNAmeAndCode(Colous colour) {
        System.out.println("Colour name is: " + colour.getColourName());
        System.out.println("Colour code is: " + colour.getColourCode());
    }


    public String getColourName() {
        return colourName;
    }

    public int getColourCode() {
        return colourCode;
    }

    public void setColourName(String colourName) {
        this.colourName = colourName;
    }

    public void setColourCode(int colourCode) {
        this.colourCode = colourCode;
    }


    private static void setColourNameAndColourCode() {
        for (Colous colour : Colous.values()) {

            System.out.println("Enter the colour name: ");
            Scanner sc = new Scanner(System.in);
            String colourName = sc.nextLine();
            System.out.println("Enter the colour code: ");
            int colourCode = sc.nextInt();
            colour.setColourCode(colourCode);
            colour.setColourName(colourName);


        }
    }

    public static void main(String[] args) {
        for (Colous colour : Colous.values()) {
            printColourNAmeAndCode(colour);
        }
        setColourNameAndColourCode();

        System.out.println("New set of colour name and colour codes are:");

        for (Colous colour : Colous.values()) {
            printColourNAmeAndCode(colour);
        }

    }

}
