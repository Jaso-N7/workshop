package com.packtpub.steps;

/**
 *
 * @author jason
 */
public class DailyGoal {
    
    private int dailyGoal = 10_000;

    private DailyGoal(int dailyGoal) {
        this.dailyGoal = dailyGoal;
    }
    
    public static DailyGoal of(int goal) {
        return new DailyGoal(goal);
    }
    
    public boolean hasMetGoal(Steps steps) {
        
        if(steps.getSteps() >= dailyGoal) { 
            return true; 
        }
        
        return false;
    }

    
    
}
