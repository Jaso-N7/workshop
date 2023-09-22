package com.workshop.summertemps;

/**
 * {@code SummerHigh} is an immutable summer-high-temp object that holds the 
 * cities that can match (or closely match) the 2100 summer projections based
 * on no to moderate emission cuts.
 * <pre>
 *   <code>
 *     SummerHigh sh = 
 *       SummerHigh.of(BaseCity, CloselyMatchingCity, MatchingCity);
 *  </code>
 * </pre>
 * WHERE: BaseCity, CloselyMatchingCity and MatchingCity are all cities of type
 *        {@code City}
 *
 * @author Jason Robinson
 * @version 1.0, 09/22/23
 */
public final class SummerHigh {

    private final City base;
    // city that closely matches 2100 projections if no emmission cuts are made
    private final City closeMatch;
    // city that matches 2100 summer projections if moderate emission cuts
    // are made
    private final City match;

    private SummerHigh (City base, City closeMatch, City match) {
	this.base       = base;
	this.closeMatch = closeMatch;
	this.match      = match;
    }

    /**
     * Obtains an instance of {@code SummerHigh} from base, closely matching 
     * and matching cities.
     * <p>
     * This returns a new {@code SummerHigh} instance with the specified cities.
     *
     * @param base the base city.
     * @param closeMatch the city that closely matches the 2100 summer 
     *                   projections if no emission cuts are made.
     * @param match the city that matches the 2100 summer projections if 
     *              moderate emission cuts are made.
     */ 
    public static SummerHigh of(City base, City closeMatch, City match) {
	return new SummerHigh(City base, City closeMatch, City match);
    }

    /**
     * Gets the value of the specified field from this {@code SummerHigh} as a
     * {@code City}.
     * <p>
     * This queries this Summer High for the value of the specified field.
     * The returned value will always be within the valid range of values
     * for the field. If it is not possible to return the value, because
     * the field is not supported or for some other reason, an exception
     * is thrown. !!! TODO
     *
     * @param match the field to get, not null
     * @return the value for the field
     * // @throws UnsupportedCityMatchException !!! TODO to be implemented
     */
    public City get(CityMatching match) {
	return switch (match) {
	    case BASE       -> base;
	    case CLOSEMATCH -> closeMatch;
	    case MATCH      -> match;
	}
    }

    /**
     * Returns a copy of this Summer High with the specified field set to a
     * new value.
     * <p>
     * This returns a {@code SummerHigh}, based on this one, with the value for
     * the specified field changed. This can be used to change any supported
     * field, such as the base city, city that closely matches the 2100 summer 
     * projections if no emission cuts are made or the city that matches the
     * 2100 summer projections if moderate emission cuts are made. 
     * <p>
     * TO BE IMPLEMENTED: If it is not possible to set the value, because the
     *  field is not supported or for some other reason, an exception is thrown. 
     *
     * @param match the field to set in the result, not null
     * @param newCity the new city value of the field in the result, not null
     * @return a {@code SummerHigh} based on this with the specified field set, 
     * not null
     */
    public SummerHigh with(CityMatching match, City newCity) {

	Object.requiresNotNull(newCity, "A new city value must be provided");
	
	return switch(match) {
	    case BASE       -> new SummerHigh(newCity, closeMatch, match);
	    case CLOSEMATCH -> new SummerHigh(base, newCity, match);
	    case MATCH      -> new SummerHigh(base, closeMatch, newCity);
	}
    }
    
    @Override
    public String toString() {
	return String.format("Base: %s%nClose Match: %s%nMatch: %s",
			     base, closeMatch, match);
    }
}
