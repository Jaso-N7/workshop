package com.mindfulengineering.learn.properties;

import java.util.*;

/**
 * Examples of utilizing {@code Properties.propertyNames()}, an alternative to
 * creating a {@code Set} and running the {@code keySet()} method.
 * 
 * @author Jason Robinson
 * @version 0.2, 09/13/23
 */
public class Example22 {

    /**
     * Demonstrates usage of {@code java.util.Properties.propertyNames()}
     * 
     * @param args unused arguments
     */
    public static void main(String[] args) {
        
        Properties props = new Properties();
        props.setProperty("OS", "Oracle Linux");
        props.setProperty("version", "9.2");
        props.setProperty("language", "English (UK)");
        props.setProperty("keyboard layout", "Programmer's Dvorak");
        
        Enumeration e = props.propertyNames();
        while (e.hasMoreElements()) {
            
            // Printing the Keys
//            System.out.println(e.nextElement());

            // Printing the K,V pairs
            String key = (String) e.nextElement();
            System.out.println(key + " = " + props.getProperty(key));

        }
        
        // Adapting the enumeration as an iterator, as specified by the javadoc
        System.out.println();
        Iterator eIter = props.propertyNames().asIterator();
        while (eIter.hasNext()) {
            String key = (String) eIter.next();
            System.out.println(key + ", " + props.getProperty(key));
        }
    }
    
}
