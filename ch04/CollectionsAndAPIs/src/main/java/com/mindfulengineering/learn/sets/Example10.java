/*
 * Chapter 4: Collections, Lists and Java Built-in APIs
 */
package com.mindfulengineering.learn.sets;

import java.util.*;

/**
 * Examples of using LinkedHashSet.
 * <p>
 * For further reading, check the Java docs for java.util.LinkedHashSet;
 * 
 * @author Jason Robinson
 * @version 0.1, 09/10/23
 */
public class Example10 {
    
    /**
     * Demonstrates the LinkedHashSet, which will sort the objects in order of
     * their arrival.
     * <p>
     * 
     * This method has the side-effect of printing to System.out.
     * 
     * @param args optional command line inputs that are never used in this demo
     */
    public static void main(String[] args) {
        
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(35);
        set1.add(19);
        set1.add(11);
        set1.add(83);
        set1.add(7);
        System.out.println(set1); // => [35, 19, 11, 83, 7]
        
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(19);
        set2.add(11);
        set2.add(0);
        set2.add(7);
        
        System.out.println("set1.containsAll(set2) :: " + set1.containsAll(set2));
        System.out.println("set1.contains(set2) :: " + set1.contains(set2));
        
        set1.removeAll(set2);
        System.out.println(set1);
        
        
    }
}
