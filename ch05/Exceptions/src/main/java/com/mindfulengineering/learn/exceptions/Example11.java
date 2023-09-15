package com.mindfulengineering.learn.exceptions;

/**
 * Example11 hands over the exception to another class higher up in the hierarchy.
 * @author Jason Robinson
 */
public class Example11 {
    /**
     * Demonstrates how to hand over an exception occuring within this class to one
     * higher up in the hierarchy.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        String text = null;
        
        try{
            System.out.println(text.length());
        } catch (Exception x) {
            System.out.println("Exception: this should be a NullPointerException");
            throw new RuntimeException();
        }
    }
}
