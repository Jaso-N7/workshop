package com.workshop.summertemps;

/**
 *
 * @author Jason Robinson
 * @version 1.0, 09/21/23
 */
public final class City {
    
    private final String name; // Name of a city
    private final String country; // Where is the city located
    private final double highTemp; // Its summer high temperature

    private City (String cityName, String cityCountry, double summerTemp) {
	name = cityName;
	country = cityCountry;
	highTemp = summerTemp;
    }

    /**
     * Obtains an instance of {@code City} from a name, country and temperature.
     * <p>
     * This returns a {@code City} with the specified name, country and temperature.
     * @param cityName the name of the city
     * @param cityCountry the country where the city is located
     * @param the city's summer high temperature
     * @return the city, not null
     */
    public static City of (String cityName,
			   String cityCountry,
			   double summerTemp) {
	return new City(String cityName, String cityCountry, double summerTemp);
    }

    /**
     * Gets the name field.
     * <p>
     * This method returns the {@code String} object of the city's name, which
     * is not expected to be {@code null}
     *
     * @return the city's name
     */
    public String getName () { return name; }

    /**
     * Gets the country field.
     * <p> 
     * This method returns the {@code String} object for the country, which is 
     * not expected to be {@code null }
     *
     * @return the city's country.
     */
    public String getCountry () { return country; }

    /**
     * Gets the temperature field.
     * This method returns the primitive {@code double} value for the 
     * temperature.
     * Even though this is a summer temperature, do not assume this value will
     * be positive, as some countries may experience below zero temperatures, 
     * even in Summer.
     *
     * @return the city's summer high temperature, from
     */
    public double getSummerTemp () { return highTemp; }

    /**
     * Returns a copy of {@code City} with the city's name altered.
     *
     * @param cityName the name of the city to set in the result
     * @return a {@code City} based on this city with the requested city name
     */
    public City withName(String cityName) {
	return new City(cityName, country, highTemp);
    }

    /**
     * Returns a copy of {@code City} with the city's country altered.
     *
     * @param countryName the name of the country to set in the result
     * @return a {@code City} based on this city with the requested country name
     */
    public City withCountry(String countryName) {
	return new City(name, countryName, highTemp);
    }

    /**
     * Returns a copy of {@code City} with the city's summer temperature altered.
     *
     * @param temperature the city's temperature to set in the result
     * @return a {@code City} based on this city with the requested temperature
     */
    public City withTemp(double temperature) {
	return new City(name, country, temperature);
    }

    @Override
    public String toString () {
	return String.format("%s, %s %.2f",
			     name, country, highTemp);
    }
    
}
