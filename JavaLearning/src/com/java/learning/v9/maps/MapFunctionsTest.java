package com.java.learning.v9.maps;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class MapFunctionsTest {

	private Map<Integer, String> numbersMap;
	private MapFunctions functions;

	@Before
	public void setup() {
		this.functions = new MapFunctions();
		this.numbersMap = this.functions.generateNumbersMap();
	}

	@Test
	public void testGenerateNumbersMap() {
		assertNotNull(this.numbersMap);
		assertEquals(5, this.numbersMap.size());
		assertTrue(this.numbersMap.keySet().containsAll(Arrays.asList(1, 2, 3, 4, 5)));
		assertTrue(this.numbersMap.values().containsAll(Arrays.asList("one", "two", "three", "four", "five")));
	}

	@Test
	public void testGetValueFromMap() {
		String value = this.functions.getValueFromMap(this.numbersMap, 3);
		assertEquals("three", value);
	}

	@Test
	public void testGetKeys() {
		Set<Integer> keys = this.functions.getKeys(this.numbersMap);
		assertTrue(keys.containsAll(Arrays.asList(1, 2, 3, 4, 5)));
	}

	@Test
	public void testGetValues() {
		Collection<String> values = this.functions.getValues(this.numbersMap);
		assertTrue(values.containsAll(Arrays.asList("one", "two", "three", "four", "five")));
	}

	@Test
	public void testContainsKey() {
		assertTrue(this.functions.containsKey(this.numbersMap, 3));
		assertFalse(this.functions.containsKey(this.numbersMap, 9));
	}

	@Test
	public void testPrintMap() {
		String print = this.functions.printMap(this.numbersMap);
		assertEquals("{1 -> one, 2 -> two, 3 -> three, 4 -> four, 5 -> five}", print);
	}

	@Test
	public void testGenerateNumbersWithTranslationsMap() {
		Map<Integer, List<String>> map = this.functions.generateNumbersWithTranslationsMap();
		assertTrue(map.keySet().containsAll(Arrays.asList(1, 2, 3, 4, 5)));
		assertTrue(map.values().stream().reduce((l1, l2) -> {
			l1.addAll(l2);
			return l1;
		}).get().containsAll(Arrays.asList("unu", "one", "ein", "doi", "two", "zwei", "trei", "three", "drei")));
	}

	@Test
	public void testPrintMapWithList() {
		Map<Integer, List<String>> map = this.functions.generateNumbersWithTranslationsMap();
		String print = this.functions.printMapWithList(map);
		assertEquals("{1 -> {unu, one, ein}, 2 -> {doi, two, zwei}, 3 -> {trei, three, drei}}", print);
	}

}
