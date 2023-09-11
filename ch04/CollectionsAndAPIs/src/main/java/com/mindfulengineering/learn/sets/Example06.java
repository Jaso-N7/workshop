/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
 */
package com.mindfulengineering.learn.sets;

import java.util.*;

/**
 * Another example of Using Sets.
 * 
 * For further reading, check the Java docs for java.util.Set;
 * 
 * @author Jason Robinson
 * @version 0.1, 09/10/23
 */
public class Example06 {
    
    /**
     * Demonstrates how to populate a set using an Array.
     * 
     * This method has the side-effect of printing to System.out.
     * 
     * @param args optional command line inputs that are never used
     */
    public static void main(String[] args) {
        
        // Populating a set from an array
        String[] arr = new String[]{"3", "25", "2", "79", "2"};
        Set<String> set = new HashSet<>();
        // add all the elements of the array to the set
        // sorting not gauranteed for Strings, however Integers will be sorted
        Collections.addAll(set, arr); 
        System.out.println(set);

    }
}
