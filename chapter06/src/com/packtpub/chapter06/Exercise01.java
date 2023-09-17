package com.packtpub.chapter06;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

/**
 * An exercise in importing and using classes / libraries into your own package.
 * 
 * @author Jason Robinson
 * @version 0.1, 09/17/23
 */
public class Exercise01 {

    /**
     * Demonstrates how to use classes and libraries imported from other packages.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDateTime ldt = LocalDateTime.now();
        DayOfWeek day = ldt.getDayOfWeek();
        
        System.out.println("The weekday is: " + day);
        System.out.println("The end of Oracle's time is: " + LocalDateTime.MAX);
    }
    
}
