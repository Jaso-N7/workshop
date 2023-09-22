package com.workshop.summertemps;

import com.google.common.collect.Tables.*;

/**
 * {@code SummerHighs} is a class to hold the overall data store.
 *
 * @author Jason Robinson
 * @version 1.0, 9/22/23
 */
private final class SummerHighs {

    Table<String String, SummerHigh> data;
    
    public SummerHighs () {
	data = HashBasedTable.create();
    }

    /**
     * Retrieve the data by city name (regardless of case).
     *
     * @param name the city name
     * @return the data as a {@code SummerHigh} object
     */
    public SummerHigh getDataByCity(String name) {
	return null;
    }

    /**
     * Retrieve the data by country's name (regardless of case).
     *
     * @param name the country name
     * @return the data as a {@code SummerHigh} object
     */
    public SummerHigh getDataByCountry(String name) {
	return null;
    }
    
}
