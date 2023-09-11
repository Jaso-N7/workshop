/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
 */
package com.mindfulengineering.learn.sets;

import java.util.*;

/**
 * Examples of Union operation of Sets.
 * 
 * For further reading, check the Java docs for java.util.HashSet;
 * 
 * @author Jason Robinson
 * @version 0.1, 09/10/23
 */
public class Example08 {
    
    /**
     * Demonstrates how to perform the union operation for two sets.
     * 
     * This method has the side-effect of printing to System.out.
     * 
     * @param args optional command line inputs that are never used
     */
    public static void main(String[] args) {
        
        Integer[] arr1 = new Integer[]{3, 25, 2, 79, 2};
        Integer[] arr2 = new Integer[]{7, 12, 14, 79};
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        Collections.addAll(set1, arr1); 
        Collections.addAll(set2, arr2);
        
        set1.addAll(set2);
        System.out.println(set1); // => [2, 3, 7, 25, 12, 14, 79]

    }
}
