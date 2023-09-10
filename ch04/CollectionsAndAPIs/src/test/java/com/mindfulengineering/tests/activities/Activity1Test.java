package com.mindfulengineering.tests.activities;

import com.mindfulengineering.activities.Activity1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author jason
 */
public class Activity1Test {
    
    private final String[] testArr;
    private final Activity1 activity1;
    
    public Activity1Test() {
        testArr = new String[] {"So", "many", "books", "so", "little", "time"};
        activity1 = new Activity1(testArr);
    }

    @Test
    @DisplayName("text array may not have been initialized correctly")
    public void testGetText() {
        assertArrayEquals(activity1.getText(), testArr);
    }
    
    @Test
    public void testSearchFor() {
        int[] indices = activity1.searchFor("so");
        int [] expected = {0, 3};
        assertEquals(indices.length, activity1.wordOccured());
        assertArrayEquals(expected, indices);
    }
}
