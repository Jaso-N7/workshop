package com.packtpub.steps;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jason
 */
public class WeeklySteps {

    private List<Steps> dailySteps = new ArrayList<>();
    private DailyGoal dailyGoal;

    public List<Steps> getDailySteps() {
        return new ArrayList<>(dailySteps);
    }

    public void setDailySteps(List<Steps> dailySteps) {
        this.dailySteps = dailySteps;
    }

    public DailyGoal getDailyGoal() {
        return dailyGoal;
    }

    public void setDailyGoal(DailyGoal dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    public DayOfWeek bestDay() {
        DayOfWeek best = DayOfWeek.MONDAY;
        int max = 0;

        for (Steps steps : dailySteps) {
            if (steps.getSteps() > max) {
                max = steps.getSteps();
                best = steps.getDate().getDayOfWeek();
            }
        }
        
        return best;
    }
    
    public int getTotalSteps() {
        int total = 0;
        
        for (Steps steps : dailySteps) {
            total += steps.getSteps();
        }
        
        return total;
    }
    
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total steps: ").append(getTotalSteps()).append('\n');
        
        for (Steps steps : dailySteps) {
            if (dailyGoal.hasMetGoal(steps)) {
                sb.append("YAY! ");
            } else {
                sb.append("     ");
            }
            sb.append(steps.getDate().getDayOfWeek());
            sb.append(" ");
            sb.append(steps.getSteps());
            
            DayOfWeek best = bestDay();
            if(steps.getDate().getDayOfWeek() == best) {
                sb.append(" ***** BEST DAY!");
            }
            sb.append('\n');
        }
        
        return sb.toString();
    }
    
    public void addDailySteps (int steps, LocalDate date) {
        dailySteps.add(Steps.of(steps, date));
    }
    
    /**
     * Demonstrates the entire step-tracking package.
     * 
     * @param args 
     */
    public static void main(String[] args) {
       // Initialize sample data
       DailyGoal dailyGoal = DailyGoal.of(10_000);
       
       WeeklySteps weekly = new WeeklySteps();
       weekly.setDailyGoal(dailyGoal);
       
       int year = 2023;
       int month = 9;
       int day = 18;
       
       weekly.addDailySteps(11_543, LocalDate.of(year, month, day));
       day++;
       weekly.addDailySteps(12_112, LocalDate.of(year, month, day));
       day++;
       weekly.addDailySteps(10_005, LocalDate.of(year, month, day));
       day++;
       weekly.addDailySteps(10_011, LocalDate.of(year, month, day));
       day++;
       weekly.addDailySteps(9_000, LocalDate.of(year, month, day));
       day++;
       weekly.addDailySteps(20_053, LocalDate.of(year, month, day));
       day++;
       weekly.addDailySteps(20_048, LocalDate.of(year, month, day));
       
        System.out.println(weekly.format());
    }
}
