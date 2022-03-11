package com.spartaglobal.gm.NumberOfVowels;

public class NumberofVowels {

    public static int getVowels(String name){
        name = name.toLowerCase();
        int numberOfVowels = 0;
        char [] nameArray = name.toCharArray();
        for(int i = 0; i < nameArray.length; i++){
            if((nameArray[i] == 'a')||(nameArray[i] == 'e')||(nameArray[i] == 'i')||(nameArray[i] == 'o')||(nameArray[i] == 'u')){
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }

    public static void main(String[] args) {
        System.out.println(getVowels("Apple"));
    }
}


