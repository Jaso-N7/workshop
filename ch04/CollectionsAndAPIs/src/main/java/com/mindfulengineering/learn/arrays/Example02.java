/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
 */
package com.mindfulengineering.learn.arrays;

import java.util.Arrays;

/**
 * Examples on filling Arrays or creating new Arrays from pre-existing Arrays.
 *
 * @author jason
 * @version 0.1, 09/08/23
 */
public class Example02 {

    /**
     * Demonstrates filling Arrays or creating new Arrays from pre-existing
     * Arrays.
     *
     * This method has the side-effect of printing to System.out
     *
     * @param args optional arguments that will not affect method
     */
    public static void main(String[] args) {

        int[] numbers = new int[5];

        Arrays.fill(numbers, 1);
        System.out.println("Filling an array of int[5] with 1s => "
                + Arrays.toString(numbers));
        
        int[] shortNumbers = Arrays.copyOfRange(numbers, 0, 2);
        System.out.println("Creating a shorter array => " +
                Arrays.toString(shortNumbers));
        
        int [] longNumbers = Arrays.copyOf(numbers, 10);
        System.out.println("Creating a longer array => " +
                Arrays.toString(longNumbers));

    }

}
