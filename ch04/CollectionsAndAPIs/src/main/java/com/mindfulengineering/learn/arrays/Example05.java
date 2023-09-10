/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
 */
package com.mindfulengineering.learn.arrays;

import java.util.*;

/**
 * Examples of how to do populate a set using an Array.
 * 
 * For further reading, check the Java docs for java.util.*;
 * 
 * @author Jason Robinson
 * @version 0.1, 09/10/23
 */
public class Example05 {
    
    /**
     * Demonstrates how to populate a set using an Array.
     * 
     * This method has the side-effect of printing to System.out.
     * 
     * @param args optional command line inputs that are never used
     */
    public static void main(String[] args) {
        
        Integer[] ia = new Integer[] {3, 25, 2, 79, 2};
        Set<Integer> intSet = new HashSet<>(Arrays.asList(ia));
        System.out.println(intSet);
        
        /* Original Array is unchanged 
        System.out.println(Arrays.toString(ia)); */
    }
}
