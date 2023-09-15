package com.mindfulengineering.tests.activities;

import com.mindfulengineering.activities.Activity2;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jason
 */
public class Activity2Test {
    
    // attempting to simulate an array size of varying lengths
    private static final int CAPACITY = 
            Math.toIntExact(Math.round((1 + Math.random()) * (1 + Math.random() * 10)));
    
    private Activity2 a2 = Activity2.instance();
        
    private List<Double> data;
    private Double expectedAvg = 42.5D;
    
    
   
    
    @Test
    public void testCreatingInstance() {
        assertInstanceOf(Activity2.class, a2);
    }

    /*
    Using an oracle to confirm if the computation is accurate
    */
    @Test
    public void testComputeAverage() {
        
        Double[] backingArray = new Double[CAPACITY];
        Arrays.fill(backingArray, expectedAvg);
        data = Arrays.asList(backingArray);
        
        assertEquals(expectedAvg, a2.computeAverage());
        // fail("Expected: " + expectedAvg + ", actual: " + a2.computeAverage());
    }
    
    /*
     * Confirms if Data can be stored and retrieved
     */
    @Test
    public void testDataStorage() {
        
        Double testDbl = 42.7D;
        a2.setData(testDbl);
        
        assertNotNull(a2.getData());
        assertTrue(a2.getData().contains(testDbl));
        
        // fail("CAP=" + CAPACITY + ", expected=" + expectedAvg + ", data="+ data);
    }
}
