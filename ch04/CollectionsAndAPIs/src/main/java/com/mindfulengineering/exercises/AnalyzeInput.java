/*
* Exercise 1
*/
package com.mindfulengineering.exercises;

import java.io.Console;
import java.util.*;

/**
 * AnalyzeInput is a Class that will respond to the CLI by storing whatever strings that are provided to it,
 * then run statistical operations on the data.
 * 
 * @author Jason Robinson
 * @version 0.3, 09/11/23
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
        
        Map map = new HashMap(); // for storing the frequencies
        
        while (iter.hasNext()) {
            String s = (String) iter.next(); // point to next element
            // get the amount of times this word shows up in the text
            int freq = Collections.frequency(text, s);
            
            System.out.println(s + " appears " + freq + " times");
            
            // add items to the map
            map.put(s, freq);
        }
        
        TreeMap mapTree = new TreeMap(map);
        // mapTree.putAll(map);
        System.out.println(mapTree);

    }

}
