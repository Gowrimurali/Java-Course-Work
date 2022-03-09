package com.spartaglobal.gm.SpeedChecker;

public class ForLoopTester implements Loops{
    @Override
    public void loop(int Number) {
        System.out.println("Its for loop: ");
        int total = 0;
        for (int i =0; i<=Number; i++){
            total+=i;
        }
    }
}
