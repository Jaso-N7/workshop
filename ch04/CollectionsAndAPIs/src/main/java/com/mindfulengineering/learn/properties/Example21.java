package com.mindfulengineering.learn.properties;

import java.util.*;

/**
 * Examples of utilizing {@code Properties.list()}
 * 
 * @author Jason Robinson
 * @version 0.1, 09/13/23
 */
public class Example21 {

    /**
     * Demonstrates usage of {@code java.util.Properties.list()}
     * 
     * @param args unused arguments
     */
    public static void main(String[] args) {
        
        Properties props = new Properties();
        props.setProperty("OS", "Oracle Linux");
        props.setProperty("version", "9.2");
        props.setProperty("language", "English (UK)");
        props.setProperty("keyboard layout", "Programmer's Dvorak");
        
        props.list(System.out);
    }
    
}
