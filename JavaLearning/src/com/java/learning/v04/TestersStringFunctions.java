package com.java.learning.v04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestersStringFunctions {

	@Test
	public void testIsSingleCharacter() {
		assertEquals(StringFunctions.isSingleCharacter("a"), true);
		assertEquals(StringFunctions.isSingleCharacter(" "), true);
		assertEquals(StringFunctions.isSingleCharacter("."), true);
		assertEquals(StringFunctions.isSingleCharacter("a "), false);
		assertEquals(StringFunctions.isSingleCharacter("1"), true);
		assertEquals(StringFunctions.isSingleCharacter("--"), false);
		assertEquals(StringFunctions.isSingleCharacter("12"), false);
	}
	
	@Test
	public void testIsDigit() {
		assertEquals(StringFunctions.isDigit("4"), true);
		assertEquals(StringFunctions.isDigit("-1"), true);
		assertEquals(StringFunctions.isDigit("0"), true);
		
		assertEquals(StringFunctions.isDigit("v"), false);
		assertEquals(StringFunctions.isDigit("-"), false);
		assertEquals(StringFunctions.isDigit("41"), false);
		assertEquals(StringFunctions.isDigit("4c"), false);
		assertEquals(StringFunctions.isDigit("c4"), false);
		assertEquals(StringFunctions.isDigit(""), false);
	}
	
	@Test
	public void testIsNumber() {
		assertEquals(StringFunctions.isNumber("123"), true);
		assertEquals(StringFunctions.isNumber("-1234"), true);
		assertEquals(StringFunctions.isNumber("0"), true);
		assertEquals(StringFunctions.isNumber(" 1243"), true);
		assertEquals(StringFunctions.isNumber(" 23423 "), true);
		assertEquals(StringFunctions.isNumber("12312 "), true);
		
		assertEquals(StringFunctions.isNumber("0123"), false);
		assertEquals(StringFunctions.isNumber("123 53454"), false);
		assertEquals(StringFunctions.isNumber("c4"), false);
		assertEquals(StringFunctions.isNumber("21-43"), false);
		assertEquals(StringFunctions.isNumber(""), false);
	}
	
	@Test
	public void testIsAlphanumeric() {
		assertEquals(StringFunctions.isAlphanumeric("123"), true);
		assertEquals(StringFunctions.isAlphanumeric("0"), true);
		assertEquals(StringFunctions.isAlphanumeric("c1231"), true);
		assertEquals(StringFunctions.isAlphanumeric(" 12312cscsa"), true);
		assertEquals(StringFunctions.isAlphanumeric("012abc "), true);
		
		assertEquals(StringFunctions.isAlphanumeric("012 abc"), false);
		assertEquals(StringFunctions.isAlphanumeric("123."), false);
		assertEquals(StringFunctions.isAlphanumeric(""), false);
		assertEquals(StringFunctions.isAlphanumeric("-123"), false);
	}

	@Test
	public void testTextContainsSingleCharacter() {
		assertTrue(StringFunctions.textContainsSingleCharacter("banana", "b"));
		assertTrue(StringFunctions.textContainsSingleCharacter("banana", "a"));
		
		assertFalse(StringFunctions.textContainsSingleCharacter("banana", "-"));
		assertFalse(StringFunctions.textContainsSingleCharacter("banana", ""));
		assertFalse(StringFunctions.textContainsSingleCharacter("banana", "m"));
		assertFalse(StringFunctions.textContainsSingleCharacter("banana", "ba"));
		assertFalse(StringFunctions.textContainsSingleCharacter("banana", "1"));
		assertFalse(StringFunctions.textContainsSingleCharacter("banana", "N"));
	}

	@Test
	public void testTextContainsWord() {
		assertTrue(StringFunctions.textContainsWord("i eat bananas", "bananas"));
		assertTrue(StringFunctions.textContainsWord("i eat bananas", "banana"));
		assertTrue(StringFunctions.textContainsWord("i eat bananas", " banana"));
		assertTrue(StringFunctions.textContainsWord("i eat bananas", "banana "));
		assertTrue(StringFunctions.textContainsWord("i eat bananas", " banana "));
		assertTrue(StringFunctions.textContainsWord("i eat bananas", "eat banana"));
		
		assertFalse(StringFunctions.textContainsWord("i eat bananas", "apple"));
		assertFalse(StringFunctions.textContainsWord("i eat bananas", "EAT"));
	}
	
	/**
	 * Check if the list of words are contained in the text. Return the list of words that are found in the text.
	 * E.g.: text = 'Check if the list of words are contained in the text'. words = {'if', 'list', 'contained', 'banana'}.
	 * The result would be {'if', 'list', 'contained'}.
	 * 
	 * If no word is found then return empty list
	 */
	@Test
	public void testTextContainsWords() {
		assertIterableEquals(StringFunctions.textContainsWords("i eat bananas, apples and pears", Arrays.asList("banana", "apple", "orange")), Arrays.asList("banana", "apple"));
		assertIterableEquals(StringFunctions.textContainsWords("i eat bananas, apples and pears", Arrays.asList(" banana", "apple ", " orange ")), Arrays.asList("banana", "apple"));
		assertIterableEquals(StringFunctions.textContainsWords("i eat meat", Arrays.asList("banana", "apple", "orange")), Arrays.asList());
		assertIterableEquals(StringFunctions.textContainsWords("i eat bananas, apples and pears", Arrays.asList("pears")), Arrays.asList("pears"));
		assertIterableEquals(StringFunctions.textContainsWords("i eat bananas, apples and pears", Arrays.asList()), Arrays.asList());
	}
	
	/**
	 * Check if the word is contained in any of the texts. Return the texts that match the search. The word must not match exactly.
	 * E.g.: texts = {'i like bananas', 'i eat an apple', 'i love apples and pears'}, word = 'apple'
	 * The result would be {'i eat an apple', 'i love apples and pears'}.
	 * 
	 * If the word is not found then return empty list.
	 */
	@Test
	public void testWordIsContainedInTexts() {
		assertIterableEquals(StringFunctions.wordIsContainedInTexts(Arrays.asList("i eat apples", "I eat bananas"), "apple"), Arrays.asList("i eat apples"));
		assertIterableEquals(StringFunctions.wordIsContainedInTexts(Arrays.asList("i eat apples", "I eat bananas"), " bananas "), Arrays.asList("i eat apples"));
		assertIterableEquals(StringFunctions.wordIsContainedInTexts(Arrays.asList("i eat apples", "I eat bananas"), "orange"), Arrays.asList());
		assertIterableEquals(StringFunctions.wordIsContainedInTexts(Arrays.asList("i eat apples", "I eat bananas"), ""), Arrays.asList("i eat apples", "I eat bananas"));
		assertIterableEquals(StringFunctions.wordIsContainedInTexts(Arrays.asList(), "apple"), Arrays.asList());
		assertIterableEquals(StringFunctions.wordIsContainedInTexts(Arrays.asList(), ""), Arrays.asList());
	}
	
	/**
	 * Check if the list of words are contained in the text. Return the texts that match at least one word. The words must not match exactly.
	 * E.g.: texts = {'i like bananas', 'i eat an apple', 'i love apples and pears', 'what about strawberries?'}, word = {'apple', 'banana', 'pear'}
	 * The result would be {'i like bananas', 'i eat an apple', 'i love apples and pears'}.
	 * 
	 * If none of the words are found then return empty list.
	 */
	@Test
	public void testWordsAreContainedInTexts() {
		assertIterableEquals(StringFunctions.wordsAreContainedInTexts(Arrays.asList("i eat bananas", "i eat apples", "i eat oranges"), Arrays.asList("banana", " apples")), 
				Arrays.asList("i eat bananas", "i eat apples"));
		assertIterableEquals(StringFunctions.wordsAreContainedInTexts(Arrays.asList("i eat bananas", "i eat apples", "i eat oranges and apples"), Arrays.asList("banana", " apples")), 
				Arrays.asList("i eat bananas", "i eat apples", "i eat oranges and apples"));
		assertIterableEquals(StringFunctions.wordsAreContainedInTexts(Arrays.asList("i eat bananas", "i eat apples", "i eat oranges"), Arrays.asList("pears", "grapes")), 
				Arrays.asList());
		assertIterableEquals(StringFunctions.wordsAreContainedInTexts(Arrays.asList(), Arrays.asList("banana", "apples")), 
				Arrays.asList());
		assertIterableEquals(StringFunctions.wordsAreContainedInTexts(Arrays.asList("i eat bananas", "i eat apples", "i eat oranges"), Arrays.asList()), 
				Arrays.asList("i eat bananas", "i eat apples", "i eat oranges"));
	}

}
