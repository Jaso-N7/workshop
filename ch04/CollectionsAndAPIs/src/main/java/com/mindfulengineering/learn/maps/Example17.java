package com.mindfulengineering.learn.maps;

import java.util.*;

/**
 * Example of Iterating through Collections
 * @author jason
 */
public class Example17 {
    
    /**
     * Demonstrates iterating through a collection using listIterator.
     * @param args 
     */
    public static void main(String[] args) {
        
        List<Double> lod = new ArrayList<>();
        lod.add(5.0D);
        lod.add(2.2D);
        lod.add(37.5D);
        lod.add(3.1D);
        lod.add(1.3D);
        System.out.println("Original List: "+ lod);
        
        ListIterator<Double> list = lod.listIterator();
        while (list.hasNext()) {
            // point to the next element
            Double d = list.next();
            // round up the decimal number
            list.set(Math.rint(d));
        }
        
        System.out.println("Modified list: " + lod);
    }
}
