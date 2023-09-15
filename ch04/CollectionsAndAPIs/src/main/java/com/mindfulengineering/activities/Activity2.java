package com.mindfulengineering.activities;

import java.util.*;

/**
 * Creates a random-sized list of random numbers to perform some basic operations
 * on data, such as obtaining the average.
 * <p>
 * This data could represent the amount of time between different arrivals of 
 * data in your application, temperature data from the nodes in an Internet of 
 * Things network being captured every second.
 * 
 * @author Jason Robinson
 * @version 0.1, 09/14/23
 */
public class Activity2 {
    
    // Please note that while Double is being used, as a Generic type, this 
    // can be swapped with the Class of your choosing.
    private List<Double> data;
    
    private Activity2 () { data = new ArrayList<>(); }
    
    /**
     * Creates a new instance of the {@code Activity2} class.
     * <pre>
     * <code>
     *   Activity2 a2 = Activity2.instance();
     * </code>
     * <pre>
     * 
     * Future implementations not guaranteed to return a new instance for each
     * call / invocation.
     * 
     * @return a new instance of {@code Activity2} class
     */
    public static Activity2 instance() { return new Activity2(); }
    
    /**
     * 
     * @return the current list of data
     */
    public List<Double> getData() { return new ArrayList<>(data); }
    
    /**
     * Adds the data to the current list.
     * 
     * 
     * @param d the information being added to the list of data
     */
    public void setData (Double d) { data.add(d); } 
    // the type of data ^^^^^^^^ and ^^^^^^^^^ underlying implementation can be 
    // changed according to future needs.
    
    /**
     * Computes the average of the data collected thus far.
     * <p>
     * Implementation is non-destructive and side-effect free.
     * 
     * @return the average of the collected data
     */
    public Double computeAverage() {
        
        Double values = 0.0D;
        // for (Double d : data) {
        //   values += d;
        // }
        Iterator<Double> iter = data.iterator();
        while(iter.hasNext()) {
            values += (Double) iter.next();
        }

        return values / data.size();
        
    }
    
    /**
     * Demonstrates how to simulate large sets of data and obtaining the average.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Activity2 a2 = Activity2.instance();
        
        // 1. Create a random list of numbers
        // int capacity = Math.toIntExact(Math.round((1 + Math.random()) * (1 + Math.random() * 10)));
        long capacity = (long) Math.round(Math.random() * 10_000);
        for (int idx = 0; idx < capacity; idx++) {
            a2.setData(Math.random() * 100);
        }
        
        Double avg = a2.computeAverage();
        
        System.out.println("Total amount of numbers: " + capacity);
        System.out.println("Average: " + avg);
        
    }
    
}
