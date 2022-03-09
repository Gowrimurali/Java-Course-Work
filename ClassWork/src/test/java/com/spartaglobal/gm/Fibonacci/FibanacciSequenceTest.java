package com.spartaglobal.gm.Fibonacci;
import com.spartaglobal.gm.Fibonacci.FibonacciSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibanacciSequenceTest {
    @Test
    public void checkForFibanocciSequence(){
        int Number = 5;
        int[] expectedFibonacci = {0,1,1,2,3};
        for (int i = 1; i <= Number; i++){
            Assertions.assertEquals(expectedFibonacci[i-1], FibonacciSequence.fibonacciNumber(i));
        }
    }
}
