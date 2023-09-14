package com.mindfulengineering.learn.properties;

import java.util.*;

/**
 * Examples of utilizing {@code setProperty()}
 * 
 * @author Jason Robinson
 * @version 0.1, 09/13/23
 */
public class Example23 {

    /**
     * Demonstrates usage of {@code setProperty()}
     * 
     * @param args unused arguments
     */
    public static void main(String[] args) {
        
        Properties props = new Properties();
        props.put("OS", "Oracle Linux");
        props.put("version", "9.2");
        props.put("language", "English (UK)");
        
        String oldValue = (String) props.setProperty("language", "Hebrew");
        
        if(oldValue != null) {
            System.out.println("modified the language property");
        }
        
        props.list(System.out);
    }
    
}
