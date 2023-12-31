package com.mindfulengineering.learn.properties;

import java.util.*;

/**
 * Examples of utilizing {@code Properties}
 * 
 * @author Jason Robinson
 * @version 0.1, 09/13/23
 */
public class Example20 {

    /**
     * Demonstrates usage of {@code java.util.Properties}
     * 
     * @param args unused arguments
     */
    public static void main(String[] args) {
        
        Properties props = new Properties();
        Set setOfKeys;
        String key;
        
        props.setProperty("OS", "Oracle Linux");
        props.setProperty("version", "9.2");
        props.setProperty("language", "English (UK)");
        
        // iterate through the map
        setOfKeys = props.keySet();
        Iterator iter = setOfKeys.iterator();
        while(iter.hasNext()) {
            key = iter.next().toString();
            System.out.println(key + " = " + props.getProperty(key));
        }
        System.out.println();
        
        // looking for URL that is not in the list
        String value = props.getProperty("keyboard layout", "unset");
        
        System.out.println("keyboard layout = " + value);
    }
    
}
