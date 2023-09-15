package com.mindfulengineering.learn.exceptions;

import java.util.*;
import java.nio.file.*;

/**
 * Example03 is a class that throws the checked exception
 * {@code java.lang.IOException} by trying to read  a whole text file into a list
 * that will be printed using an iterator.
 * 
 * <p><b>WARNING: This file will never compile</b>
 * 
 * @author Jason Robinson
 * @version 0.1, 09/15/23
 */
public class Example03 {

    /**
     * Demonstrates how to generate an IOException
     * @param args unused optional argument
     */
    public static void main(String[] args) {
        // declare a list that will contain all of the files inside of the
        // non-existent 'readme.txt' file
        List<String> lines = Collections.emptyList();
        
        // !!! provoke an exception
        //lines = Files.readAllLines(Paths.get("readme.txt"));
        
        // you will never see this print or get this far without capturing or
        // throwing
        Iterator<String> iter = lines.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
