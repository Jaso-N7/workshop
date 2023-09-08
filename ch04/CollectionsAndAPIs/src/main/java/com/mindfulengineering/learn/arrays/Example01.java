/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
*/

package com.mindfulengineering.learn.arrays;

import java.util.Arrays;

/**
 * Example of how to sort Arrays and print their contents
 * 
 * @author Jason Robinson
 * @version 0.1, 09/08/23
 */
public class Example01 {

    /**
     * Demonstrates how to sort Arrays and print their contents.
     * 
     * This method has a side-effect of printing to System.out
     * 
     * @param args optional arguments that are not used for this demonstration.
     */
    public static void main(String[] args) {
        
        String [] text = new String [] {"spam", "more", "buy"};
        
        Arrays.sort(text);
        
        // How to print elements of the array
        System.out.println("Using Arrays.toString(Object o) => " +
                Arrays.toString(text));
        
        // Using the C-style for loop
        System.out.println("\nUsing array indices:");
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i] + " ");
        }
        
        // Using the enhanced for loop
        System.out.println("\nUsing enhanced for:");
        for (String t : text) {
            System.out.print(t + " ");
        }
        
    }
}
