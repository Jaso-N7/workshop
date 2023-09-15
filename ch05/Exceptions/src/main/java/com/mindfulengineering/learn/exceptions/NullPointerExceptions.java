package com.mindfulengineering.learn.exceptions;

class BadClass {
    
    /**
     * Demonstrates the fact that a {@code String} variable that is initialized
     * to {@code null} cannot have access to the {@code equals()} method.
     * @param args 
     */
    public static void failing(String[] args) {
        
        String vehicleType = null;
        String vehicle = "car";
        
        // This is the point of failure
        if(vehicleType.equals(vehicle)) {
            System.out.println("it's a car");
        } else {
            System.out.println("it's not a car");
        }
        
    }
}

class GoodClass {
    
    /**
     * Demonstrates that {@code equals()} method for the {@code String} class is
     * prepared to handle the situation of its parameter being {@code null}.
     * 
     * @param args 
     */
    public static void working(String[] args) {
        
        String vehicleType = null;
        String vehicle = "car";
        
        if(vehicle.equals(vehicleType)) {
            System.out.println("it's a car");
        } else {
            System.out.println("it's not a car");
        }
        
    }
}

/**
 * Highlighting a different way of thinking when dealing with any type of exception
 * in your code.
 * 
 * @author Jason Robinson
 */
public class NullPointerExceptions {
    public static void main(String[] args) {
        GoodClass.working(new String[]{""});
        BadClass.failing(new String[]{""});
    }
}
