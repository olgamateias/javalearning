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
	public int[] digitRootSort(int[] a) {
		int[] secondArray = Arrays.copyOf(a, a.length);
		System.out.println("array " + Arrays.toString(a));
		int sum1 = 0;
		int sum2 = 0;
		int max = 0;// indexul
		for (int i = 0; i < a.length; i++) {
			int nr = a[i];// i=0->13 ...
			int size = String.valueOf(nr).length();

			for (int x = 0; x < size; x++) {
				sum1 = sum1 + (nr % 10);
				nr = nr / 10;
			}

			for (int j = i + 1; j < a.length; j++) {
				int next = secondArray[j];// j=1->20
				int sizeNext = String.valueOf(next).length();
				for (int x = 0; x < sizeNext; x++) {
					sum2 = sum2 + (next % 10);
					next = next / 10;
				}
				if (sum1 > sum2) {
					max = secondArray[i];
					secondArray[i] = secondArray[j];
					secondArray[j] = max;
				} else if (sum1 == sum2) {
					if (a[i] > a[j]) {
						max = secondArray[i];
						secondArray[i] = secondArray[j];
						secondArray[j] = max;
					}

				}
				sum2 = 0;
			}
			sum1 = 0;
		}
		System.out.println("second array " + Arrays.toString(secondArray));
		return secondArray;
	}

}
