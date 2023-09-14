package com.mindfulengineering.learn.properties;

import java.util.*;

/**
 * Examples of utilizing {@code Properties.propertyNames()}
 * 
 * @author Jason Robinson
 * @version 0.1, 09/13/23
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
            System.out.println(e.nextElement());
        }
    }
    
}
