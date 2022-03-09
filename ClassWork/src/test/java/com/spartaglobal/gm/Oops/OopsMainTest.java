package com.spartaglobal.gm.Oops;

import com.spartaglobal.gm.Oops.OopsMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OopsMainTest {
    @Test
    @DisplayName("Name should not be empty")
    void nameShouldNotBeEmpty(){
        Assertions.assertEquals(false,Cat.checkNameField(OopsMain.constructObject("", " Maane Coone", 15).getName()));
    }

    @Test
    @DisplayName("Name should not contain digits")
    void nameShouldNotContainDigits(){
        Assertions.assertEquals(false,Cat.checkNameField(OopsMain.constructObject("Felix23","Maane Coone",15).getName()));
    }

    @Test
    @DisplayName("Name should not contain any symbols")
    void nameShouldNotContainAnySymbols(){
        Assertions.assertEquals(false,Cat.checkNameField(OopsMain.constructObject("Felix//+", "MaaneCoone", 15).getName()));
    }






}
