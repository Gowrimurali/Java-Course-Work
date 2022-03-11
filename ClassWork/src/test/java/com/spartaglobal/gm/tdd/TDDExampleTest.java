package com.spartaglobal.gm.tdd;
import com.spartaglobal.gm.tdd.FizzBuzzGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TDDExampleTest {

    @Test
    @DisplayName("Five should return Fizz")
    void fiveShouldReturnFizz(){
        Assertions.assertEquals("Fizz", FizzBuzzGenerator.getFizzBuzzValue(5));

    }

    @Test
    @DisplayName("Seven should return Buzz")
    void SevenShouldReturnBuzz(){
        Assertions.assertEquals("Buzz", FizzBuzzGenerator.getFizzBuzzValue(7));
    }

    @Test
    @DisplayName("Two should return two")
    void twoShouldReturnTwo(){
        Assertions.assertEquals("2", FizzBuzzGenerator.getFizzBuzzValue(2));
    }

    @Test
    @DisplayName("Thirty five should return FizzBuzz")
    void thirtyFiveShouldReturnFizzBuzz(){
        Assertions.assertEquals("FizzBuzz", FizzBuzzGenerator.getFizzBuzzValue(35));
    }

}
