package com.spartaglobal.gm.MergeArray;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {-2,1,2,4,6};
        int[] array2 = {-9,0,1,2,4,4,5,7};
        int[] mergedArray = Merge.mergedArray(array1,array2);
        //int[] mergedSortedArray = ch1.getSortedArray(mergedArray);
        System.out.println("Merged sorted array is: " + Arrays.toString(mergedArray));
    }
}
