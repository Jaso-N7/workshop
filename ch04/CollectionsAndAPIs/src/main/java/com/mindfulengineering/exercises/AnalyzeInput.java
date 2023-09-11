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
    }

}
