package com.java.learning.v9.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Dictionary implements IDictionary {
	private Map<String, List<String>> dictionary = new HashMap<>();

	/**
	 * Just a getter
	 */
	@Override
	public Map<String, List<String>> getDictionary() {
		return this.dictionary;
	}

	/**
	 * Add a new entry in the map. This will override the value in the map in case the map already
	 * contains this key
	 */
	@Override
	public void addEntry(String key, List<String> translations) {
		if (key != null) {
			this.dictionary.put(key, translations);
		}

	}

	/**
	 * Add a new entry in the map. Similar to the method above but you get the parameter as a Entry
	 * object - which contains one entry pair (one key and its value) from a map
	 */
	@Override
	public void addEntry(Entry<String, List<String>> dictionaryEntry) {
		/*
		 * if (dictionaryEntry != null) {
		 * this.dictionary.put(dictionaryEntry.getKey(), dictionaryEntry.getValue());
		 * }
		 */
		// a 2a varianta
		if (dictionaryEntry != null) {
			addEntry(dictionaryEntry.getKey(), dictionaryEntry.getValue());
		}

	}

	/**
	 * Add a new translation for the key. If the key does not already exist then a new entry is
	 * added in the map. If the key already exists then do not override it, but add the translation
	 * to the existing translations list.
	 * If translation is null then the entry is not added
	 */
	@Override
	public void addTranslation(String key, String translation) {
		if (translation != null) {
			List<String> translationList;
			if (this.dictionary.containsKey(key)) {
				translationList = this.dictionary.get(key);
			} else {
				translationList = new ArrayList<>();
				addEntry(key, translationList);
			}
			translationList.add(translation);
		}
	}

	@Override
	public List<String> getTranslationsForKey(String key) {
		List<String> translationsForKey = this.dictionary.get(key);
		return translationsForKey;
	}

	/**
	 * Remove all the translations for this key but do not remove the key from the map. After this
	 * method is called, the map will contain this key with an empty list as translations
	 */
	@Override
	public void clearTranslationsForKey(String key) {
		this.dictionary.replace(key, new ArrayList<>());
		// System.out.println("replace " + this.dictionary.get(key));
	}

	/**
	 * Remove this entry completely from the map. As a result, the key and its translations will no
	 * longer exist in the map.
	 */
	@Override
	public void removeEntry(String key) {
		this.dictionary.remove(key, this.dictionary.get(key));
	}

	/**
	 * Remove all the entries from the map. As a result, the map will be empty.
	 */
	@Override
	public void clearAllTheTranslations() {
		// this.dictionary.clear();
		Iterator<Entry<String, List<String>>> iterator = this.dictionary.entrySet().iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
	}

}
