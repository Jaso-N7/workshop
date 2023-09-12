package com.mindfulengineering.learn.maps;

import java.util.*;

/**
 * Example of Iterating through Collections
 * @author jason
 */
public class Example16 {
    
    /**
     * Demonstrates iterating through a collection.
     * @param args 
     */
    public static void main(String[] args) {
        
        List<Integer> loi = new ArrayList<>();
        loi.add(5);
        loi.add(2);
        loi.add(37);
        
        Iterator<Integer> iter = loi.iterator();
        
        while (iter.hasNext()) {
            // point to next element
            Integer next = iter.next();
            // print elements
            System.out.print(next + " ");
        }
    }
}
