package com.spartaglobal.gm.MergeArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeArrayTest {

    @Test
    @DisplayName("Return merged sorted array")
    public void returnMergedSortedArray(){
        int[] array1 = {-2,1,2,4,6};
        int[] array2 = {-9,0,1,2,4,4,5,7};
        int[] expectedArray = {-9, -2, 0, 1, 1, 2, 2, 4, 4, 4, 5, 6, 7};
        Assertions.assertEquals(Arrays.toString(expectedArray), Arrays.toString(Merge.mergedArray(array1,array2)));
    }


}
