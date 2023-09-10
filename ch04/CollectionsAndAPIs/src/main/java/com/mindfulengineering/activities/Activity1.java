/*
 * Activity 1: Searching for Multiple Occurrences in an Array
*/
package com.mindfulengineering.activities;

import java.util.*;

/**
 * A Class that will count multiple occurrences of a certain word in an array of
 * strings, where each one of the objects is a single word. 
 * <p>
 * Uses the following array, a famous quote by Frank Zappa, as a point of departure:
 * <br>
 * {@code 
 * String[] text = {"So", "many", "books", "so", "little", "time"};
 * }
 * 
 * @author Jason Robinson
 * @version 0.1, 09/10/23
 */
public class Activity1 {
    
    private String[] text;
    private int occurrence;
    
    /**
     * Class Constructor that sets the initial array of Strings.
     * @param text an array of single word strings
     */
    public Activity1(String[] text) {
        this.text = text;
        occurrence = -1;
    }
    
    /**
     * Retrieves the text that is being used for the application
     * @return an array of Strings that the application uses
     */
    public String[] getText () {
        return Arrays.copyOf(text, text.length);
    }
    
    /**
     * Returns the positions of the word in the initialized text.
     * 
     * @param word the word to be searched for
     * @return the positions of the word as an array of indices
     */
    public int[] searchFor(String word) {
        
        int [] posn = new int[text.length];
        int posx = 0;
                
        for (int idx = 0; idx < text.length; idx++) {
            
            int result = word.compareToIgnoreCase(text[idx]);
            if (result == 0) {
                incrementOccurrence();
                posn[posx++] = idx;
            }
        }
        
        return Arrays.copyOfRange(posn, 0, wordOccured());
    }
    
    /**
     * Increments the occurrence, each time the word is found with the text.
     */
    public void incrementOccurrence() {
        if (occurrence == -1) {
            occurrence = 1;
        } else {
            ++occurrence;
        }
    }
    
    /**
     * 
     * @return the total count of the occurrences.
     */
    public int wordOccured () {
        return occurrence;
    }
    
    /**
     * Demonstrates how to count multiple occurrences of a certain word in an array
     * of strings, where each one of the objects is a single word.
     * <p>
     * This has the known side-effect of printing to {@code System.out}
     * 
     * @param args optional arguments that are not used in this demonstration, however,
     * configuration is possible.
     */
    public static void main(String[] args) {
        
        Activity1 a = new Activity1(
                new String [] {"So", "many", "books", "so", "little", "time"});
        //String word = "so";
        
        for (int posn : a.searchFor("so"))
            System.out.println("Found query at: " + posn);
                    
        System.out.println("Found: " + a.wordOccured() + " coinciding words");
        
    }
}
