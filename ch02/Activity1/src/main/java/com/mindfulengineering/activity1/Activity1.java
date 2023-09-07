/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mindfulengineering.activity1;

/**
 * DATA DEFINITIONS ===
 *
 * Systolic is a Number. INTERPRETATION: Represents the Systolic blood pressure
 *
 * Diastolic is a Number INTERPRETATION: Represents Diastolic blood pressure
 *
 * @author jason
 */
public class Activity1 {

    /**
     * A program that takes a patient's blood pressure as input and then
     * determines if that blood pressure is within the ideal range.
     *
     * @param pressures
     */
    public static void main(String[] pressures) {
        // Check if there is the right number of inputs
        if (!verifyInputs(pressures)){
            System.err.println("Missing inputs.");
            System.exit(-1);
        }

        int systolic = getBloodPressure(pressures[0]),
                diastolic = getBloodPressure(pressures[1]);

        System.out.println(systolic + "/" + diastolic
                + switch (bloodPressureReport(systolic, diastolic)) {
            case 0 ->
                " Low blood pressure.";
            case 1 ->
                " Ideal blood pressure.";
            case 2 ->
                " Pre-high blood pressure.";
            case 3 ->
                " High blood pressure.";
            default ->
                " Non-ideal blood pressure";
        });

    }

    /**
     * 
     * @param args
     * @return 
     */
    public static boolean verifyInputs (String[] args) {
        return args.length == 2;
    }
    
    /**
     * 
     * @param systolic
     * @param diastolic
     * @return 
     */
    public static int bloodPressureReport(int systolic, int diastolic) {
        if (isSystolicLow(systolic) && isDiastolicLow(diastolic)) {
            return 0;
        } else if (isSystolicIdeal(systolic) && isDiastolicIdeal(diastolic)) {
            return 1;
        } else if (isSystolicPreHigh(systolic) && isDiastolicPreHigh(diastolic)) {
            return 2;
        } else if (isSystolicHigh(systolic) && isDiastolicHigh(diastolic)) {
            return 3;
        } else {
            return -1;
        }
    }

    private static boolean isSystolicIdeal(int currentPressure) {
        return isWithinRange(90, currentPressure, 120);
    }

    private static boolean isSystolicLow(int currentPressure) {
        return isWithinRange(currentPressure, 90);
    }

    private static boolean isSystolicPreHigh(int currentPressure) {
        return isWithinRange(120, currentPressure, 140);
    }

    private static boolean isSystolicHigh(int currentPressure) {
        return isWithinRange(140, currentPressure);
    }

    private static boolean isDiastolicIdeal(int currentPressure) {
        return isWithinRange(60, currentPressure, 80);
    }

    private static boolean isDiastolicLow(int currentPressure) {
        return isWithinRange(currentPressure, 60);
    }

    private static boolean isDiastolicPreHigh(int currentPressure) {
        return isWithinRange(80, currentPressure, 90);
    }

    private static boolean isDiastolicHigh(int currentPressure) {
        return isWithinRange(90, currentPressure);
    }

    /* TEMPLATE:
    isWithinRange :: Integer Integer Integer -> Boolean
    Determines if a given number is within range of the other two
    given: 90 100 120, expects: true
    given: 90 80 120, expects: false
     */
    private static boolean isWithinRange(int lowerBound, int testNumber, int upperBound) {
        return (lowerBound < testNumber) && (testNumber <= upperBound);
    }

    /* TEMPLATE:
    isWithinRange :: Integer Integer Integer -> Boolean
    Determines if a given number is within range of the other two
    given: 40 90, expects: true
    given: 140 90, expects: false
     */
    private static boolean isWithinRange(int testNumber, int upperBound) {
        return testNumber <= upperBound;
    }

    /* TEMPLATE: 
    getBloodPressure :: String -> Integer
    Converts a String to a Number
    given: "100", expect: 100
    given: "0", expect: 0
    given: "-1", expect: 0
    given: "42.09", expect: 42
     */
    private static int getBloodPressure(String number) {
        return Integer.parseInt(number);
    }

}
