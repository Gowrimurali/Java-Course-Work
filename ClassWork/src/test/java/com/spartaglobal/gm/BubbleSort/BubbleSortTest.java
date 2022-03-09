package com.spartaglobal.gm.BubbleSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    @DisplayName("Array should be sorted")
    void returnSortedArray(){
        int[] expectedOutput = {-67, -34, 0, 1, 3, 8, 9, 9, 21, 34, 74, 90};
        int[] inputArray = {9, 34, 21, -67, 9, 0, -34, 74, 90, 3, 1, 8};
        Assertions.assertEquals(Arrays.toString(expectedOutput), Arrays.toString(BubbleSort.bubbleSort(inputArray)));
    }

}
