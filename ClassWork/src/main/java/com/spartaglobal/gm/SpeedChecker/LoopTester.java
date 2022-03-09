package com.spartaglobal.gm.SpeedChecker;

public class LoopTester {

    public static void doTest(Loops loops, int Number) {

        double start = System.nanoTime();
        loops.loop(Number);
        double stop = System.nanoTime();
        double totalTime = stop - start;
        System.out.println(" Time in milliseconds is: " + totalTime/1000000);
    }

}
