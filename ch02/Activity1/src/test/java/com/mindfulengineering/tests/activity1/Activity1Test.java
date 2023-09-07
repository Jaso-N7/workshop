package com.mindfulengineering.tests.activity1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

import com.mindfulengineering.activity1.Activity1;

/**
 *
 * @author jason
 */
public class Activity1Test {

    public Activity1Test() {
    }

    @Test
    @DisplayName("Main must only accept two(2) inputs")
    public void testMainCorrectInputs() {

        assertTrue(Activity1.verifyInputs(new String[]{"100", "90"}));
        assertTrue(!Activity1.verifyInputs(new String[]{"100", "90", "1"}));
        assertTrue(!Activity1.verifyInputs(new String[]{"100"}));
        assertTrue(!Activity1.verifyInputs(new String[]{}));
    }

    @Test
    @DisplayName("Blood Pressure must report accurate results")
    public void testBloodPressureReport() {

        int low = Activity1.bloodPressureReport(90, 60);
        int ideal = Activity1.bloodPressureReport(105, 70);
        int pre = Activity1.bloodPressureReport(130, 85);
        int high = Activity1.bloodPressureReport(150, 100);
        int wonky = Activity1.bloodPressureReport(6, 1_000);

        assertEquals(0, low);
        assertEquals(1, ideal);
        assertEquals(2, pre);
        assertEquals(3, high);
        assertEquals(-1, wonky);

    }

}
