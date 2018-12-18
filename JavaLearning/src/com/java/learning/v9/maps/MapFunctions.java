package com.java.learning.v9.maps;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapFunctions {

	/**
	 * Return a HashMap containing the numbers from 1 to 5 with their corresponding name value. The
	 * map will look like this: {1 -> one, 2 -> two, 3 -> three, 4 -> four, 5 -> five}
	 *
	 */
	public Map<Integer, String> generateNumbersMap() {
		return null;
	}

	/**
	 * Get from the map the value that corresponds to the key.
	 * E.g.: map is {1 -> one, 2 -> two} and the key is 2; then the method returns "two"
	 */
	public String getValueFromMap(Map<Integer, String> map, Integer key) {
		return null;
	}

	/**
	 * Get only the keys from the given map.
	 * E.g.: If the map is {1 -> one, 2 -> two, 3 -> three, 4 -> four, 5 -> five}
	 * you will return a set containing {1, 2, 3, 4, 5}
	 */
	public Set<Integer> getKeys(Map<Integer, String> map) {
		return null;
	}

	/**
	 * Get only the values from the given map.
	 * E.g.: if the map is {1 -> one, 2 -> two, 3 -> three, 4 -> four, 5 -> five}
	 * then the method returns a collection containing {one, two, three, four, five}
	 */
	public Collection<String> getValues(Map<Integer, String> map) {
		return null;
	}

	/**
	 * Check if the key is contained in the map
	 */
	public boolean containsKey(Map<Integer, String> map, Integer key) {
		return false;
	}

	/**
	 * Print the map in a readable form, like this:
	 * {1 -> one, 2 -> two, 3 -> three, 4 -> four, 5 -> five}
	 */
	public String printMap(Map<Integer, String> map) {
		return null;
	}

	/**
	 * Return a map with numbers from 1 to 3 and their translations in Romanian, English and German.
	 * E.g.: {1 -> {unu, one, ein}, 2 -> {doi, two, zwei}, 3 -> {trei, three, drei}}
	 */
	public Map<Integer, List<String>> generateNumbersWithTranslationsMap() {
		return null;
	}

	/**
	 * Print the map in a readable form, like this:
	 * {1 -> {unu, one, ein}, 2 -> {doi, two, zwei}, 3 -> {trei, three, drei}}
	 */
	public String printMapWithList(Map<Integer, List<String>> map) {
		return null;
	}

}
