package com.spartaglobal.gm.WeekAndDays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekAndDaysTest {

    @Test
    public void testGetWeekAndDays(){
        Assertions.assertEquals("2 week/s and 1 day/s", WeeksAndDays.getWeeksAndDays(15));

    }

}
