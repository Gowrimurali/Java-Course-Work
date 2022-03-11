package com.spartaglobal.gm.SpeedChecker;

public class WhileTester implements Loops{
    @Override
    public void loop(int Number) {
        System.out.println("Its while loop");
        int i = 0;
        int total = 0;
        while (i <= Number){
            total+=i;
            i++;
        }
    }
}
