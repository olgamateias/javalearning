package com.java.learning.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercises {

	public static boolean isNegative(List<Integer> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				count++;
			}
			if (count == list.size()) {
				return true;
			}
		}
		return false;
	}

	// udemy challenge
	public static int[] getIntegers(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter " + number + " integer values.\r");
		int[] myArray = new int[number];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scanner.nextInt();

		}
		System.out.print("Array ");
		printArray(myArray);
		System.out.println();
		sortArray(myArray);

		return myArray;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static int[] sortArray(int[] array) {
		// int[] newSortedArray = array; - INCORRECT WAY TO COPY AN ARRAY
		// copy array to another array
		int[] newSortedArray = new int[array.length]; // actually is another reference to the same
														// array -> change one
														// both arrays are affected
		for (int i = 0; i < array.length; i++) {
			newSortedArray[i] = array[i];
		}
		// or, another ex.
		int[] sortedArray = Arrays.copyOf(array, array.length);
		System.out.println();
		printArray(array);
		System.out.println();
		// sort desc
		for (int i = 0; i < newSortedArray.length - 1; i++) {
			for (int j = i + 1; j < newSortedArray.length; j++) {
				if (newSortedArray[i] < newSortedArray[j]) {
					int temp = newSortedArray[i];
					newSortedArray[i] = newSortedArray[j];
					newSortedArray[j] = temp;
				}

			}
		}
		System.out.print("Sorted desc Array ");
		printArray(newSortedArray);
		System.out.println();
		printArray(array);
		return newSortedArray;
	}

	public static void duplicatesCount(int[] myArray) {

		// myArray = {1,3,2,3,1,2};
		// myArray[0] = 1;
		// myArray[1] = 3;
		// myArray[2] = 8;
		// myArray[3] = 3;
		// myArray[4] = 2;
		// myArray[5] = 1;
		int count = 0;
		Arrays.sort(myArray);
		System.out.println("array elements ");

		for (int i = 0; i < (myArray.length - 1); i++) {
			if (myArray[i] == myArray[i + 1]) {
				count++;
			}
			System.out.println(myArray[i]);
		}
		System.out.println("duplicates " + count);
	}

	public static void sortArrayAsc(int[] myArray) {
		// myArray = {8, 3, 2, 7, 1, 5};
		int temp = 0;
		System.out.println("sorted elements ");
		for (int i = 0; i < myArray.length - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] > myArray[j]) {
					temp = myArray[j];
					myArray[j] = myArray[i];
					myArray[i] = temp;
				}

			}

			System.out.println(myArray[i]);
		}

	}

	public static void reverse(int[] myArray) {
		int lastIndex = myArray.length - 1;
		int halfLenghtArray = myArray.length / 2;
		System.out.println("reversed elements ");
		for (int i = 0; i < halfLenghtArray; i++) {
			int temp = myArray[i];
			myArray[i] = myArray[lastIndex - i];
			myArray[lastIndex - i] = temp;

		}
		System.out.println(Arrays.toString(myArray));

	}

	public static void sortArrayDesc(int[] myArray) {
		// myArray = {8, 3, 2, 7, 1, 5};
		int temp = 0;
		System.out.println("sorted elements ");
		for (int i = 0; i < myArray.length - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] < myArray[j]) {
					temp = myArray[j];
					myArray[j] = myArray[i];
					myArray[i] = temp;
				}

			}

			System.out.println(myArray[i]);
		}

	}

	/*
	 * Your Informatics teacher at school likes coming up with new ways to help you
	 * understand the material. When you started studying numeral systems, he
	 * introduced his own numeral system, which he's convinced will help clarify
	 * things. His numeral system has base 26, and its digits are represented by
	 * English capital letters - A for 0, B for 1, and so on.
	 * 
	 * The teacher assigned you the following numeral system exercise: given a
	 * one-digit number, you should find all unordered pairs of one-digit numbers
	 * whose values add up to the number.
	 * 
	 * Example
	 * 
	 * For number = 'G', the output should be newNumeralSystem(number) = ["A + G",
	 * "B + F", "C + E", "D + D"].
	 * 
	 * Translating this into the decimal numeral system we get: number = 6, so it is
	 * ["0 + 6", "1 + 5", "2 + 4", "3 + 3"]. numeralSystem(char number)
	 */

	public String[] newNrSystem(char number) {
		List<String> allLetters = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
		ArrayList<String> resultList = new ArrayList<>();
		System.out.println("index of nr " + allLetters.indexOf(String.valueOf(number)));
		int nr = allLetters.indexOf(String.valueOf(number));
		System.out.println("nr " + nr);
		for (int i = 0; i <= nr / 2; i++) {
			// int result = i + (nr -i);
			String print = "\"" + allLetters.get(i) + " + " + allLetters.get(nr - i) + "\"";
			// System.out.print(print);
			resultList.add(print);

		}
		String[] array = resultList.toArray(new String[0]);
		System.out.println(resultList);

		return array;
	}

	/*
	 * Ticket numbers usually consist of an even number of digits. A ticket number
	 * is considered lucky if the sum of the first half of the digits is equal to
	 * the sum of the second half.
	 * 
	 * Given a ticket number n, determine if it's lucky or not.
	 * 
	 * Example
	 * 
	 * For n = 1230, the output should be isLucky(n) = true; For n = 239017, the
	 * output should be isLucky(n) = false. Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] integer n
	 * 
	 * A ticket number represented as a positive integer with an even number of
	 * digits.
	 * 
	 * Guaranteed constraints: 10 ≤ n < 106.
	 * 
	 * [output] boolean
	 * 
	 * true if n is a lucky ticket number, false otherwise.
	 */
	public boolean isLucky(int number) {
		int length = String.valueOf(number).length();
		int nr1 = Integer.valueOf(String.valueOf(number).substring(0, length / 2));
		int nr2 = Integer.valueOf(String.valueOf(number).substring(length / 2, length));
		int sum1 = 0;
		int sum2 = 0;
		System.out.println("length " + length);
		for (int i = 0; i < length / 2; i++) {
			int first = nr1 % 10;
			int last = nr2 % 10;
			nr1 = nr1 / 10;
			nr2 = nr2 / 10;

			sum1 = sum1 + first;
			sum2 = sum2 + last;
		}
		System.out.println("sum1 " + sum1 + " & sum2 " + sum2);
		if (sum1 == sum2) {
			return true;
		}
		return false;
	}

	/*
	 * Digit root of some positive integer is defined as the sum of all of its
	 * digits.
	 * 
	 * You are given an array of integers. Sort it in such a way that if a comes
	 * before b then the digit root of a is less than or equal to the digit root of
	 * b. If two numbers have the same digit root, the smaller one (in the regular
	 * sense) should come first. For example 4 and 13 have the same digit root,
	 * however 4 < 13 thus 4 comes before 13 in any digitRoot sorting where both are
	 * present.
	 * 
	 * Example
	 * 
	 * For a = [13, 20, 7, 4], the output should be [20, 4, 13, 7].
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer a
	 * 
	 * Array of positive integers.
	 * 
	 * [output] array.integer
	 */
	public static int sumDigits(int number) {
		int sum = 0;
		int size = String.valueOf(number).length();

		for (int x = 0; x < size; x++) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		return sum;
	}

	public int[] digitRootSort(int[] a) {
//try with lists or map
		return null;
	}

	/*
	 * Given an integer size, return an array containing each integer from 1 to size in the
	 * following order:
	 * 
	 * 1, size, 2, size - 1, 3, size - 2, 4, ...
	 * 
	 * Example
	 * 
	 * For size = 7, the output should be
	 * constructArray(size) = [1, 7, 2, 6, 3, 5, 4].
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] integer size
	 * 
	 * A positive integer.
	 * 
	 * Guaranteed constraints:
	 * 1 ≤ size ≤ 15.
	 * 
	 * [output] array.integer
	 */
	public static int[] constructArray(int size) {
		int[] array = new int[size];
		int value = 1;
		for (int i = 0; i < size; i = i + 2) {
			array[i] = value;
			value++;
		}
		value = 0;
		for (int x = 1; x < size; x = x + 2) {
			array[x] = size - value;
			value++;
		}
		System.out.println("array " + Arrays.toString(array));
		return array;
	}
	/*
	 * Given an encoded string, return its corresponding decoded string.
	 * 
	 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets
	 * is repeated exactly k times. Note: k is guaranteed to be a positive integer.
	 * 
	 * Note that your solution should have linear complexity because this is what you will be asked
	 * during an interview.
	 * 
	 * Example
	 * 
	 * For s = "4[ab]", the output should be
	 * decodeString(s) = "abababab";
	 * 
	 * For s = "2[b3[a]]", the output should be
	 * decodeString(s) = "baaabaaa";
	 * 
	 * For s = "z1[y]zzz2[abc]", the output should be
	 * decodeString(s) = "zyzzzabcabc".
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] string s
	 * 
	 * A string encoded as described above. It is guaranteed that:
	 * 
	 * the string consists only of digits, square brackets and lowercase English letters;
	 * the square brackets form a regular bracket sequence;
	 * all digits that appear in the string represent the number of times the content in the
	 * brackets that follow them repeats, i.e. k in the description above;
	 * there are at most 20 pairs of square brackets in the given string.
	 * Guaranteed constraints:
	 * 0 ≤ s.length ≤ 80.
	 * 
	 * [output] string
	 */

	/////////////////
	/*
	 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a
	 * string of those numbers in the form of a phone number.
	 * 
	 * Example:
	 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns
	 * "(123) 456-7890"
	 * The returned format must be correct in order to complete this challenge.
	 * Don't forget the space after the closing parentheses!
	 * 
	 * 
	 */
	public static String phoneNr(int[] number) {
		String phoneNr = "(";
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			phoneNr = phoneNr + String.valueOf(number[i]);
			count++;
			if (count == 3) {
				phoneNr = phoneNr + ") ";
			} else if (count == 6) {
				phoneNr = phoneNr + "-";
			}
		}
		System.out.println("Phone Nr " + phoneNr);
		return phoneNr;
	}

	/*
	 * Your task is to make a function that can take any non-negative integer as a argument and
	 * return it with its digits in descending order. Essentially, rearrange the digits to create
	 * the highest possible number.
	 * 
	 * Examples:
	 * Input: 21445 Output: 54421
	 * 
	 * Input: 145263 Output: 654321
	 * 
	 * Input: 1254859723 Output: 9875543221
	 * 
	 * 
	 */
	public static long reversedNr(int number) {
		long reversedNr = 0;
		int size = String.valueOf(number).length();
		String reversedString = "";
		String orderedString = "";
		for (int i = 0; i < size; i++) {
			reversedString = reversedString + (number % 10);
			number = number / 10;
		}
		char[] array = reversedString.toCharArray();
		for (int i = 0; i < array.length; i++) {
			for (int x = i + 1; x < array.length; x++) {
				if (array[i] < array[x]) {
					char temp = array[i];
					array[i] = array[x];
					array[x] = temp;
				}
			}
		}
		for (int y = 0; y < array.length; y++) {
			orderedString = orderedString + String.valueOf(array[y]);
		}

		try {
			reversedNr = Long.parseLong(orderedString);
		} catch (NumberFormatException e) {
			System.out.println("number format exception");
		}

//		System.out.println("array " + Arrays.toString(array));
//		System.out.println("String " + reversedString);
//		System.out.println("ordered String " + orderedString);
		return reversedNr;
	}

	/*
	 * Welcome. In this kata, you are asked to square every digit of a number.
	 * 
	 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and
	 * 12 is 1.
	 * 
	 * Note: The function accepts an integer and returns an integer
	 */

	public static int squareDigits(int n) {
		String result = "";
		String array = String.valueOf(n);
		System.out.println(array);
		for (int i = 0; i < array.length(); i++) {
			result = result + String.valueOf(Integer.parseInt(String.valueOf(array.charAt(i))) * Integer.parseInt(String.valueOf(array.charAt(i))));
		}
		return Integer.parseInt(result);
	}

}