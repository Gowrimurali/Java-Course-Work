package com.spartaglobal.gm.Oops;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OopsMainTest {
    @Test
    @DisplayName("Cat cannot be created without name")
    void catCannotBeCreatedWithoutName() {
        Cat cat1 = OopsMain.constructCat("", "Maane Coone", 3);
        assertEquals(null, OopsMain.constructCat("", "Maane Coone", 3).checkNameField(OopsMain.constructCat("", "Maane Coone", 3)));
    }

    @Test
    @DisplayName("Cat cannot be created with digits in name")
    void catCannotBeCreatedWithDigitsInName() {
        Cat cat1 = OopsMain.constructCat("", "Maane Coone", 3);
        assertEquals(null, OopsMain.constructCat("Felix23", "Maane Coone", 3).checkNameField(OopsMain.constructCat("Felix23", "Maane Coone", 3)));
    }

    @Test
    @DisplayName("Cat cannot be created with special symbols in name")
    void catCannotBeCreatedWithSpecialSymbolsInName() {
        Cat cat1 = OopsMain.constructCat("", "Maane Coone", 3);
        assertEquals(null, OopsMain.constructCat("Felix#!", "Maane Coone", 3).checkNameField(OopsMain.constructCat("Felix#!", "Maane Coone", 3)));
    }

    @Test
    @DisplayName("Cat speak purr")
    void catSpeakPurr() {
        assertEquals("purrr", OopsMain.constructCat("Felix", "Maane Coone", 3).speak());
    }

    @Test
    @DisplayName("Dog speak to owner")
    void dogSpeakToOwner() {
        assertEquals("Peter is speaking to Gowri",OopsMain.constructDog("Peter", "Poodle", 5).speak("Gowri"));
    }

    @Test
    @DisplayName("Dog speak like animals")
    void dogSpeakLikeAnimals() {
        assertEquals("Animal is speaking", OopsMain.constructDog("Peter", "Poodle", 5).speak());
    }

    @Test
    @DisplayName("Cat ")
    void cat() {

        assertEquals(1,1);
    }

    @Test
    @DisplayName("Cats cannot be created with empty breed")
    void catsCannotBeCreatedWithEmptyBreed() {
        assertEquals(null, OopsMain.constructCat("Felix", "", 3).checkNameField(OopsMain.constructCat("Felix", "", 3)));
    }

    @Test
    @DisplayName("Negative age should return error message")
    void negativeAgeShouldReturnErrorMessage() {
        assertEquals("Age can only be positive!!", OopsMain.constructCat("Felix", "Mane Coone", 3).setAge(-10));
    }

    @Test
    @DisplayName("Positive age should be updated successfully")
    void positiveAgeShouldBeUpdatedSuccessfully() {
        int age = 10;
        Assertions.assertEquals("Age updated to " + age,OopsMain.constructCat("Felix", "Mane Coone", 3).setAge(10));
    }
    
    }

