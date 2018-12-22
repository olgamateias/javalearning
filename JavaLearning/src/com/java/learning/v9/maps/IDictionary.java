package com.java.learning.v9.maps;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public interface IDictionary {

//	private Map<String, List<String>> dictionary = new HashMap<>();

	/**
	 * Just a getter
	 */
	public Map<String, List<String>> getDictionary();

	/**
	 * Add a new entry in the map. This will override the value in the map in case the map already
	 * contains this key
	 */
	public void addEntry(String key, List<String> translations);

	/**
	 * Add a new entry in the map. Similar to the method above but you get the parameter as a Entry
	 * object
	 */
	public void addEntry(Entry<String, List<String>> dictionaryEntry);

	/**
	 * Add a new translation for the key. If the key does not already exist then a new entry is
	 * added in the map. If the key already exists then do not override it, but add the translation
	 * to the existing translations list.
	 * If translation is null then the entry is not added
	 */
	public void addTranslation(String key, String translation);

	public List<String> getTranslationsForKey(String key);

	/**
	 * Remove all the translations for this key but do not remove the key from the map. After this
	 * method is called, the map will contain this key with an empty list as translations
	 */
	public void clearTranslationsForKey(String key);

	/**
	 * Remove this entry completely from the map. As a result, the key and its translations will no
	 * longer exist in the map.
	 */
	public void removeEntry(String key);

	/**
	 * Remove all the entries from the map. As a result, the map will be empty.
	 */
	public void clearAllTheTranslations();

}
