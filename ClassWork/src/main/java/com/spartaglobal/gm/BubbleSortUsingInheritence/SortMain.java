package com.spartaglobal.gm.BubbleSortUsingInheritence;

import java.util.Arrays;

public class SortMain {

    public static void main(String[] args) {
        child1 ch = new child1(new int[]{9, 34, 21, -67, 9, 0, -34, 74, 90, 3, 1, 8});
        System.out.println("The input array is: " + Arrays.toString(ch.array));
        int[] sortedArray = ch.getSortedArray(ch.array);
        System.out.println("Sorted Array is: " + Arrays.toString(sortedArray));
    }
}
