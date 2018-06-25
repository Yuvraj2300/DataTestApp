package com.example.TestData.custom.dataFactory;

public interface Address {
	String[] getStreetNames();

	/**
	 * @return Array of cities
	 */
	String[] getCities();

	/**
	 * Returns a list of address suffixes such as "Lane", "Drive","Parkway"
	 * 
	 * @return Array of address suffixes
	 */
	String[] getAddressSuffixes();
}
