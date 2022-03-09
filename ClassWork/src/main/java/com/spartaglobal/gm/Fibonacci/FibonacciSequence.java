package com.spartaglobal.gm.Fibonacci;

public class FibonacciSequence {
    public static int fibonacciNumber(int Number){
        if(Number > 2){
            return fibonacciNumber(Number-2) + fibonacciNumber(Number-1);
        }else if(Number == 2){
            return 1;
        }else if(Number == 1){
            return 0;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int Number = 5;
        for (int i = 1; i<= Number; i++){
            System.out.println(fibonacciNumber(i));
        }
    }
}
