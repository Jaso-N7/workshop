/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
 */
package com.mindfulengineering.learn.arrays;

import java.util.Arrays;

/**
 * Examples of how to do comparisons on Arrays.
 * 
 * For further reading, check the Java docs for Arrays.deepEquals()
 * 
 * @author Jason Robinson
 * @version 0.1, 09/08/23
 */
public class Example03 {
    
    /**
     * Demonstrates how to do comparisons on Arrays.
     * 
     * This method has the side-effect of printing to System.out.
     * 
     * @param args optional command line inputs that are never used
     */
    public static void main(String[] args) {
        
        int[] numbers1 = new int[3];
        Arrays.fill(numbers1, 1);
        
        // comparing numbers1 to numbers2 using Arrays.equals
        int[] numbers2 = {0, 0, 0};
        boolean comparison = Arrays.equals(numbers1, numbers2);
        System.out.format("Arrays.equals(%s, %s) : %s%n",
                Arrays.toString(numbers1),
                Arrays.toString(numbers2), 
                comparison);
        
        // comparing numbers1 to numbers3
        int[] numbers3 = {1, 1, 1};
        comparison = Arrays.equals(numbers1, numbers3);
        System.out.format("Arrays.equals(%s, %s) : %s%n",
                Arrays.toString(numbers1),
                Arrays.toString(numbers3), 
                comparison);
        
        // comparing numbers1 to numbers4
        int[] numbers4 = {1, 1};
        comparison = Arrays.equals(numbers1, numbers4);
        System.out.format("Arrays.equals(%s, %s) : %s%n",
                Arrays.toString(numbers1),
                Arrays.toString(numbers4), 
                comparison);
        
    }
}
