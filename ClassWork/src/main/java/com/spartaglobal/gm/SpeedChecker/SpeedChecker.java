package com.spartaglobal.gm.SpeedChecker;

public class SpeedChecker {

    public static void main(String[] args) {
        ForLoopTester forloop = new ForLoopTester();
        WhileTester whileloop = new WhileTester();
        LoopTester looptester = new LoopTester();
        looptester.doTest(forloop, 30303);
        looptester.doTest(whileloop,30303);
    }

}
