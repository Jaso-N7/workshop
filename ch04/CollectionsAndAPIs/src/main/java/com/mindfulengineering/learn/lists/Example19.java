package com.mindfulengineering.learn.lists;

import java.util.*;

/**
 * Examples of sorting
 * 
 * @author Jason Robinson
 * @version 0.1, 09/12/23
 */
public class Example19 {
   
    /**
     * Demonstrates sorting a Collection
     * 
     * @param args unused optional arguments
     */
    public static void main(String[] args) {
        
        List<Double> lod = new ArrayList<>();
        lod.add(5.0D);
        lod.add(2.2D);
        lod.add(37.5D);
        lod.add(3.1D);
        lod.add(1.3D);
        System.out.println("Original list: " + lod);
        
        Collections.sort(lod);
        
        System.out.println("Modified list: " + lod);
    }
}
