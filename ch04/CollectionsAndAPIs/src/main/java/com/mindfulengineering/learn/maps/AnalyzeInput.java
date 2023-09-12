package com.mindfulengineering.learn.maps;

import java.util.*;

/**
 * 
 * @author Jason Robinson
 * @version 0.1, 09/12/23
 */
public class AnalyzeInput {
    
    /**
     * Demonstrates 'a trick' to iterate through a map.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Map map = new HashMap();
        map.put("name", "Kristian");
        map.put("family name", "Larssen");
        map.put("address", "Jumping Rd");
        map.put("mobile", "555-789456");
        map.put("pet", "cat");
        
        Iterator <Map.Entry> miter = map.entrySet().iterator();
        
        while (miter.hasNext()) {
            
            Map.Entry entry = miter.next();
            System.out.print("Key = " + entry.getKey());
            System.out.println(", Value = " + entry.getValue());
        }
        
    }
}
