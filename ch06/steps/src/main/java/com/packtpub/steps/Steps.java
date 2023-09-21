package com.packtpub.steps;

import java.time.LocalDate;

/**
 * Records the number of steps taken so far in a day.
 * 
 * <pre>
 *   <code>
 *     Steps s = Steps.of(10_000, LocalDate.now());
 *   </code>
 * </pre>
 * 
 * @author Jason Robinson
 * @version 0.1, 09/17/23
 */
public class Steps {
    private int steps;
    private LocalDate date;

    private Steps(int steps, LocalDate date) {
        this.steps = steps;
        this.date = date;
    }
    
    /**
     * Generates a new instance of the Steps class.
     * 
     * @param steps the number of steps taken
     * @param date when the tracking was done
     * @return a new instance of Steps
     */
    public static Steps of(int steps, LocalDate date) {
        return new Steps(steps, date);
    }

    /**
     * Retrieve the number of steps recorded
     * @return the number of steps recorded
     */
    public int getSteps() {
        return steps;
    }

    /**
     * Sets or updates the number of steps taken
     * @param steps the number of steps taken
     */
    public void setSteps(int steps) {
        this.steps = steps;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
        
}
