package com.spartaglobal.gm.NumberOfVowels;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberOfVowelsTest {

    @Test
    @DisplayName("Apple should return two")
    public void appleShouldReturnTwo(){
        Assertions.assertEquals(2,NumberofVowels.getVowels("Apple"));
    }

}
