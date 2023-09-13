/*
* Exercise 1
*/
package com.mindfulengineering.exercises;

import java.io.Console;
import java.util.*;

/**
 * DataPoint is a class of:
 * <pre>
 * <code>
 *   DataPoint dp = DataPoint.of(Word, Frequency);
 * </code>
 * <pre>
 * 
 * INTERPRETATION: A class containing the two data points
 * <br>WHERE: Word is a String and Frequency is an integer representing
 * how often the word occurs.
 * 
 * @author Jason Robinson
 * @version 0.1, 09/12/23
 * @since 0.6, 09/11/23
 */
class DataPoint {

    private String key;
    private Integer value;
    
    private DataPoint(String s, Integer i) {
        key = s;
        value = i;
    }
    
    /**
     * Creates a new instance of the data point.
     * 
     * @param s word
     * @param i how often the word occurs
     * @return a new DataPoint instance
     */
    public static DataPoint of(String s, Integer i) {
        return new DataPoint(s, i);
    }
}

/**
 * AnalyzeInput is a Class that will respond to the CLI by storing whatever strings that are provided to it,
 * then run statistical operations on the data.
 * 
 * @author Jason Robinson
 * @version 0.6, 09/12/23
 * @since 09/11/23
 */
public class AnalyzeInput {

    /** 
     * Starts the application.
     * 
     * <p>Application is run within the Command Line Interface
     *
     * @param args 
     */
    public static void main(String[] args) {

        ArrayList<String> text = new ArrayList<>();
        Console console;
        String line = "";

        /* For testing purposes use
        this is a test
        is a test
        test is this
        .
        */
        // while user has not entered "." (Ed style)
        while (!line.equals(".")
                // ensure the terminal is ready to read data
                && (console = System.console()) != null
                // & ensure when hitting 'Enter', the resulting data is not empty
                && (line = console.readLine()) != null) {
            
            List<String> lineList =
                    new ArrayList<>(Arrays.asList(line.split(" ")));
            text.addAll(lineList);

        }
        System.out.println("You typed: " + text);
        System.out.println("Word count: " + text.size());
        
        // 1. Automatically eliminate duplicates
        Set<String> textSet = new HashSet<>(text);
        // textSet.addAll(text);
        // 2. Check how many copies of each element from the set can be found
        Iterator iter = textSet.iterator();
        
        List<DataPoint> frequencies = new ArrayList<>(); // for storing the frequencies
        
        while (iter.hasNext()) {
            String s = (String) iter.next(); // point to next element
            // get the amount of times this word shows up in the text
            int freq = Collections.frequency(text, s);
            
            System.out.println(s + " appears " + freq + " times");
            
            // Create the object to be stored
            DataPoint dp = DataPoint.of(s, freq);
            // add datapoints to the list
            frequencies.add(dp);
        }

    }

}
