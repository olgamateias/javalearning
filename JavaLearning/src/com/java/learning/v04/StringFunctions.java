package com.java.learning.v04;

import java.util.ArrayList;
import java.util.List;

public class StringFunctions {

	/**
	 * Check if the text has a single character. Return false otherwise.
	 * The character can be any character possible: digit, letter, special character, space, etc
	 * 
	 * E.g.: "a" - true
	 * " " - true
	 * "1" - true
	 * "  " - false
	 * "12" - false
	 * "1 " - false
	 */
	public static boolean isSingleCharacter(String text) {
		return false;
	}
	
	/**
	 * Check if the character passed is a digit.
	 * 
	 * E.g.: "1" - true
	 * "12" - false
	 * "a" - false
	 */
	public static boolean isDigit(String chr) {
		return false;
	}
	
	/**
	 * Check if the text is a number. If it starts with 0 it is not a number. Spaces are ignored at the beginning and end of the text.
	 * 
	 * E.g.: '1234' - true
	 * ' 1234 ' - true
	 * '01234' - false
	 * '1234c' - false 
	 * '123 4' - false
	 */
	public static boolean isNumber(String text) {
		return false;
	}
	
	
	/**
	 * Text contains any digit of letter. Special characters (including - and .) cannot be contained. Spaces are allowed at the beginning and end of string, not inside it.
	 * 
	 * E.g.: '123basd' - true
	 * ' 123basd' - true
	 * ' asdasdas' - true
	 * '12 asdb' - false
	 * ' 0123124' - true
	 */
	public static boolean isAlphanumeric(String text) {
		return false;
	}
	
	/**
	 * Check if the character is contained in the text. If the chr is not single character then return false;
	 * 
	 * E.g.: text = "banana", chr = "a" - true
	 * text = "banana", chr = "m" - false
	 * text = "banana", chr = "ba" - false
	 */
	public static boolean textContainsSingleCharacter(String text, String chr) {
		return false;
	}
	
	/**
	 * Check if the text contains the word. The word must not match exactly. The word cannot be a space. If the word starts/ends with a space then ignore the spaces
	 * 
	 * E.g.: text = "i eat bananas", word = "bananas" - true
	 * text = "i eat bananas", word = "banana" - true
	 * text = "i eat bananas", word = " banana " - true
	 * text = "i eat bananas", word = "ban ana" - false
	 * text = "i eat bananas", word = "bamana" - false
	 */
	public static boolean textContainsWord(String textToSearchIn, String word) {
		return false;
	}
	
	/**
	 * Check if the list of words are contained in the text. Return the list of words that are found in the text.
	 * The word cannot be a space. If the word starts/ends with a space then ignore the spaces
	 * 
	 * E.g.: text = 'Check if the list of words are contained in the text'. words = {'if', 'list', 'contained', 'banana'}.
	 * The result would be {'if', 'list', 'contained'}.
	 * 
	 * If no word is found then return empty list
	 */
	public static List<String> textContainsWords(String textToSearchIn, List<String> words) {
		return new ArrayList();
	}
	
	/**
	 * Check if the word is contained in any of the texts. Return the texts that match the search. The word must not match exactly.
	 * The word cannot be a space. If the word starts/ends with a space then ignore the spaces
	 * 
	 * E.g.: texts = {'i like bananas', 'i eat an apple', 'i love apples and pears'}, word = 'apple'
	 * The result would be {'i eat an apple', 'i love apples and pears'}.
	 * 
	 * If the word is not found then return empty list.
	 */
	public static List<String> wordIsContainedInTexts(List<String> textsToSearchIn, String word) {
		return new ArrayList<>();
	}
	
	/**
	 * Check if the list of words are contained in the text. Return the texts that match at least one word. The words must not match exactly.
	 * The word cannot be a space. If the word starts/ends with a space then ignore the spaces
	 * 
	 * E.g.: texts = {'i like bananas', 'i eat an apple', 'i love apples and pears', 'what about strawberries?'}, word = {'apple', 'banana', 'pear'}
	 * The result would be {'i like bananas', 'i eat an apple', 'i love apples and pears'}.
	 * 
	 * If none of the words are found then return empty list.
	 */
	public static List<String> wordsAreContainedInTexts(List<String> textsToSearchIn, List<String> words) {
		return new ArrayList<>();
	}
}
