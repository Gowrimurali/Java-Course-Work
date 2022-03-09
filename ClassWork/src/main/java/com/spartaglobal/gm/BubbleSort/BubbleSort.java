package com.spartaglobal.gm.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] inputArray){
        int sortFlag = 1;
        while(sortFlag != 0){
            sortFlag = 0;
            for(int i = 0; i < inputArray.length-1; i++){
                if(inputArray[i]>inputArray[i+1]){
                    sortFlag++;
                    int m = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = m;
                }

            }
        }
        return inputArray;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the input array: ");
        //int[] inputArray = scanner.nextInt();
        int[] inputArray = {9,34,21,-67,9,0,-34,74,90,3,1,8};
        System.out.println("The input array is: "+ Arrays.toString(inputArray));
        int[] sortedArray = bs.bubbleSort(inputArray);
        System.out.println("The sorted array is: "+Arrays.toString(sortedArray));
    }

}
