/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
 */
package com.mindfulengineering.learn.arrays;

import java.util.Arrays;

/**
 * Examples of how to do conduct searches on Arrays.
 * 
 * For further reading, check the Java docs for Arrays.binarySearch()
 * 
 * @author Jason Robinson
 * @version 0.1, 09/10/23
 */
public class Example04 {
    
    /**
     * Demonstrates how to do searches with Arrays.
     * 
     * This method has the side-effect of printing to System.out.
     * 
     * @param args optional command line inputs that are never used
     */
    public static void main(String[] args) {
        
        String[] text = {"love", "is", "in", "the", "air"};
        
        /* Demonstrating what happens when searching an unsorted Array */
        int search = Arrays.binarySearch(text, "is");
        // System.out.println(search);
        System.out.format("Unsorted: Arrays.binarySearch(%s, \"is\") :: %d%n",
                Arrays.toString(text),
                search);
        
        String[] copyOfText = Arrays.copyOf(text, text.length);
        Arrays.sort(copyOfText);
        search = Arrays.binarySearch(copyOfText, "is");
        // System.out.println(search);
        System.out.format("Sorted: Arrays.binarySearch(%s, \"is\") :: %d%n",
                Arrays.toString(copyOfText),
                search);

    }
}
