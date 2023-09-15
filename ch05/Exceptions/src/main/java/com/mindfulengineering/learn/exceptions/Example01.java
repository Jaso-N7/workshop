package com.mindfulengineering.learn.exceptions;

/**
 * Example01 is a class that throws a simple exception
 * @author Jason Robinson
 */
public class Example01 {

    /**
     * Demonstrates how to generate a simple exception
     * @param args 
     */
    public static void main(String[] args) {
        // declare a String with nothing inside
        String text = null;
        
        // you will see this at the console
        System.out.println("Go Java Go!");
        
        // null'ed String(s) should crash your program
        System.out.println(text.length());
        
        // you'll never see this print
        System.out.println("Hello World!");
    }
}
