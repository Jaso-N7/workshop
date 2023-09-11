/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
 */
package com.mindfulengineering.learn.sets;

import java.util.*;

/**
 * Examples of Intersection operation of Sets.
 * 
 * For further reading, check the Java docs for java.util.TreeSet;
 * 
 * @author Jason Robinson
 * @version 0.1, 09/10/23
 */
public class Example09 {
    
    /**
     * Demonstrates how to perform the intersection operation for two sets.
     * <p>
     * Gets only those numbers that exist in both arrays.
     * <p>
     * This method has the side-effect of printing to System.out.
     * 
     * @param args optional command line inputs that are never used in this demo
     */
    public static void main(String[] args) {
        
        Integer[] arr1 = new Integer[]{3, 25, 2, 79, 2};
        Integer[] arr2 = new Integer[]{7, 12, 14, 79};
        
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        
        Collections.addAll(set1, arr1); 
        Collections.addAll(set2, arr2);
        
        set1.retainAll(set2); // Intersection
        System.out.println(set1); // => [79]

    }
}
