package com.mindfulengineering.learn.exceptions;

/**
 * Example02 is a class that throws a {@code java.lang.StringIndexOutOfBoundsException}
 * @author Jason Robinson
 */
public class Example02 {

    /**
     * Demonstrates how to generate a simple exception
     * @param args 
     */
    public static void main(String[] args) {
        // declare a String of a fixed length
        String text = "I <3 bananas"; // 12 chars long
        
        // provoke an exception
        char character = text.charAt(15); // get the 15th element
        
        // Never prints
        System.out.println("A sad and lonely string");
    }
}
