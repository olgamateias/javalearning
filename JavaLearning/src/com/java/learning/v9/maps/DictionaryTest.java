package com.java.learning.v9.maps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DictionaryTest {

	private IDictionary dictionary;

	@BeforeEach
	void setUp() {
		this.dictionary = null; // new Dictionary();
	}

	@Test
	public void testGetDictionary() {
		Map<String, List<String>> dict = this.dictionary.getDictionary();
		assertNotNull(dict);
	}

	@Test
	public void testAddEntry1() {
		generateEntries();

		assertMapEntries();
	}

	@Test
	public void testAddEntry2() {
		Map<String, List<String>> map = new HashMap<>();
		map.put("unu", Arrays.asList("one", "ein"));
		map.put("doi", null);
		map.put("trei", Collections.emptyList());

		this.dictionary.addEntry(null);
		this.dictionary.addEntry(map.entrySet().iterator().next());
		this.dictionary.addEntry(map.entrySet().iterator().next());
		this.dictionary.addEntry(map.entrySet().iterator().next());

		assertFalse(this.dictionary.getDictionary().containsKey(null));
		assertMapEntries();
	}

	@Test
	public void testAddTranslation() {
		this.dictionary.addTranslation("unu", "one");
		this.dictionary.addTranslation("unu", "ein");

		assertEquals(2, this.dictionary.getDictionary().get("unu").size());
		assertTrue(this.dictionary.getDictionary().get("unu").containsAll(Arrays.asList("one", "ein")));

		this.dictionary.addTranslation("doi", null);
		assertFalse(this.dictionary.getDictionary().containsKey("doi"));
	}

	@Test
	public void testGetTranslationsForKey() {
		generateEntries();

		assertMapEntries();
		assertNull(this.dictionary.getTranslationsForKey("patru"));
	}

	@Test
	public void testClearTranslationsForKey() {
		generateEntries();

		this.dictionary.clearTranslationsForKey("trei");

		assertTrue(this.dictionary.getDictionary().get("trei").isEmpty());
		assertTrue(this.dictionary.getDictionary().get("unu").containsAll(Arrays.asList("one", "ein")));
		assertNull(this.dictionary.getDictionary().get("doi"));
	}

	@Test
	public void testRemoveEntry() {
		generateEntries();

		this.dictionary.removeEntry("trei");

		assertFalse(this.dictionary.getDictionary().containsKey("trei"));
		assertTrue(this.dictionary.getDictionary().get("unu").containsAll(Arrays.asList("one", "ein")));
		assertNull(this.dictionary.getDictionary().get("doi"));

		this.dictionary.removeEntry("patru");
	}

	@Test
	public void clearAllTheTranslations() {
		generateEntries();

		this.dictionary.clearAllTheTranslations();
		assertTrue(this.dictionary.getDictionary().isEmpty());
	}

	private void generateEntries() {
		this.dictionary.addEntry("unu", Arrays.asList("one", "ein"));
		this.dictionary.addEntry("doi", null);
		this.dictionary.addEntry("trei", Collections.emptyList());
	}

	private void assertMapEntries() {
		assertTrue(this.dictionary.getDictionary().get("unu").containsAll(Arrays.asList("one", "ein")));
		assertNull(this.dictionary.getDictionary().get("doi"));
		assertTrue(this.dictionary.getDictionary().get("trei").isEmpty());
	}

}
