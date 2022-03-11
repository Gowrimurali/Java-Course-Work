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
            System.out.println("Enter the colour name: ");
            Scanner sc = new Scanner(System.in);
            String[] colourName = new String[Colous.values().length];
            for (int i = 0; i<colourName.length; i++){
                colourName[i] = sc.nextLine();
            }
            System.out.println("Enter the colour code: ");
            int[] colourCode = new int[Colous.values().length];
            for (int i = 0; i<colourCode.length; i++){
                colourCode[i] = sc.nextInt();}
            for (int i =0; i<Colous.values().length; i++){
                Colous.values()[i].setColourName(colourName[i]);
                Colous.values()[i].setColourCode(colourCode[i]);
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
