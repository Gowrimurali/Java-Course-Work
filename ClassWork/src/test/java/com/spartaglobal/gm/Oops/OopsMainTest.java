package com.spartaglobal.gm.Oops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OopsMainTest {
    @Test
    @DisplayName("Object not created if name is empty")
    void ObjectNotCreatedIfNAmeIsEmpty(){
        Cat cat1 = OopsMain.constructCat("", "Maane Coone", 3);
        Assertions.assertEquals(null, OopsMain.constructCat("", "Maane Coone", 3).checkNameField(OopsMain.constructCat("", "Maane Coone", 3)));
    }

    @Test
    @DisplayName("Object not created if name contain digits")
    void ObjectNotCreatedIfNameContainDigits(){
        Cat cat1 = OopsMain.constructCat("", "Maane Coone", 3);
        Assertions.assertEquals(null, OopsMain.constructCat("Felix23", "Maane Coone", 3).checkNameField(OopsMain.constructCat("Felix23", "Maane Coone", 3)));
    }

    @Test
    @DisplayName("Object not created if name contain any symbols")
    void ObjectNotCreatedIfNameContainAnySymbols(){
        Cat cat1 = OopsMain.constructCat("", "Maane Coone", 3);
        Assertions.assertEquals(null,OopsMain.constructCat("Felix#!", "Maane Coone", 3).checkNameField(OopsMain.constructCat("Felix#!", "Maane Coone", 3)));


        @Test
        @DisplayName("Cat speak purr")
        void catSpeakPurr () {
            Assertions.assert.Equals("purr", OopsMain.constructCat("Felix", "Maane Coone", 3));
        }    
        
    }







}
