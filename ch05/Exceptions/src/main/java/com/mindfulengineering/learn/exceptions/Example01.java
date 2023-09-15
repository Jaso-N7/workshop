package com.mindfulengineering.learn.exceptions;

/**
 * Example01 is a class that throws a simple exception
 * 
 * @author Jason Robinson
 * @version 0.1.1, 09/15/23
 */
public class Example01 {

    /**
     * Demonstrates how to generate and catch a simple exception
     * @param args 
     */
    public static void main(String[] args) {
        // declare a String with nothing inside
        String text = null;
        
        // you will see this at the console
        System.out.println("Go Java Go!");
        
        try {
            // null'ed String(s) should crash your program
            System.out.println(text.length());
        } catch (NullPointerException npe) {
            System.out.println("Exception: cannot get the text's length");
        }
        
        // you'll never see this print
        System.out.println("Hello World!");
    }
}
