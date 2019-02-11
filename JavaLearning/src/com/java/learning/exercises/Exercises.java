package com.java.learning.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
		// System.out.print("Sorted desc Array ");
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
		// System.out.println("array elements ");

		for (int i = 0; i < (myArray.length - 1); i++) {
			if (myArray[i] == myArray[i + 1]) {
				count++;
			}
			// System.out.println(myArray[i]);
		}
		// System.out.println("duplicates " + count);
	}

	public static void sortArrayAsc(int[] myArray) {
		// myArray = {8, 3, 2, 7, 1, 5};
		int temp = 0;
		// System.out.println("sorted elements ");
		for (int i = 0; i < myArray.length - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] > myArray[j]) {
					temp = myArray[j];
					myArray[j] = myArray[i];
					myArray[i] = temp;
				}

			}

			// System.out.println(myArray[i]);
		}

	}

	public static void reverse(int[] myArray) {
		int lastIndex = myArray.length - 1;
		int halfLenghtArray = myArray.length / 2;
		// System.out.println("reversed elements ");
		for (int i = 0; i < halfLenghtArray; i++) {
			int temp = myArray[i];
			myArray[i] = myArray[lastIndex - i];
			myArray[lastIndex - i] = temp;

		}
		// System.out.println(Arrays.toString(myArray));

	}

	public static void sortArrayDesc(int[] myArray) {
		// myArray = {8, 3, 2, 7, 1, 5};
		int temp = 0;
		// System.out.println("sorted elements ");
		for (int i = 0; i < myArray.length - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] < myArray[j]) {
					temp = myArray[j];
					myArray[j] = myArray[i];
					myArray[i] = temp;
				}

			}

			// System.out.println(myArray[i]);
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
		// System.out.println("index of nr " + allLetters.indexOf(String.valueOf(number)));
		int nr = allLetters.indexOf(String.valueOf(number));
		// System.out.println("nr " + nr);
		for (int i = 0; i <= nr / 2; i++) {
			// int result = i + (nr -i);
			String print = "\"" + allLetters.get(i) + " + " + allLetters.get(nr - i) + "\"";
			// System.out.print(print);
			resultList.add(print);

		}
		String[] array = resultList.toArray(new String[0]);
		// System.out.println(resultList);

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
		// System.out.println("length " + length);
		for (int i = 0; i < length / 2; i++) {
			int first = nr1 % 10;
			int last = nr2 % 10;
			nr1 = nr1 / 10;
			nr2 = nr2 / 10;

			sum1 = sum1 + first;
			sum2 = sum2 + last;
		}
		// System.out.println("sum1 " + sum1 + " & sum2 " + sum2);
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
		// System.out.println("array " + Arrays.toString(array));
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
		// System.out.println("Phone Nr " + phoneNr);
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
		// System.out.println(array);
		for (int i = 0; i < array.length(); i++) {
			result = result + String.valueOf(Integer.parseInt(String.valueOf(array.charAt(i))) * Integer.parseInt(String.valueOf(array.charAt(i))));
		}
		return Integer.parseInt(result);
	}

	/*
	 * Mr. Scrooge has a sum of money 'P' that wants to invest, and he wants to know how many years
	 * 'Y' this sum has to be kept in the bank in order for this sum of money to amount to 'D'.
	 * 
	 * The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly, and the new sum
	 * is re-invested yearly after paying tax 'T'
	 * 
	 * Note that the principal is not taxed but only the year's accrued interest
	 * 
	 * Example:
	 * 
	 * Let P be the Principal = 1000.00
	 * Let I be the Interest Rate = 0.05 (1000*0.05=50)
	 * Let T be the Tax Rate = 0.18 (50 * 0.18 = 9)
	 * Let D be the Desired Sum = 1100.00
	 * 
	 * 
	 * After 1st Year -->
	 * P = 1041.00 (1000+41=1041)
	 * After 2nd Year -->
	 * P = 1083.86 (1041*0.05 = 52.05; 52.05*0.18=9.369, 1041+42.681=1083.68
	 * After 3rd Year -->
	 * P = 1128.30
	 * Thus Mr. Scrooge has to wait for 3 years for the initial pricipal to ammount to the desired
	 * sum.
	 * 
	 * Your task is to complete the method provided and return the number of years 'Y' as a whole in
	 * order for Mr. Scrooge to get the desired sum.
	 * 
	 * Assumptions : Assume that Desired Principal 'D' is always greater than the initial principal,
	 * however it is best to take into consideration that if the Desired Principal 'D' is equal to
	 * Principal 'P' this should return 0 Years.
	 */
	public static int calculateYears(double principal, double interest, double tax, double desired) {
		int yearsToWait = 0;
		while (principal < desired) {
			principal = principal + (principal * interest) - ((principal * interest) * tax);
			yearsToWait++;
		}
		return yearsToWait;
	}

	/*
	 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
	 * 
	 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
	 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
	 * It’s guaranteed that array contains more than 3 numbers.
	 * 
	 * The tests contain some very huge arrays, so think about performance.
	 */
	public static double findUniq(double arr[]) {
		double temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int x = i + 1; x < arr.length; x++) {
				for (int z = x + 1; z < arr.length; z++) {
					if (arr[z] != arr[x]) {
						if (arr[z] != arr[i]) {
							if (arr[i] == arr[x]) {
								// System.out.println(" x " + arr[x]);
								// System.out.println(" i " + arr[i]);
								// System.out.println(" z " + arr[z]);
								temp = arr[z];
								return arr[z];
							}
						} else if (arr[x] != arr[i]) {
							// System.out.println(" i " + arr[i]);
							// System.out.println(" x " + arr[x]);
							temp = arr[x];
							return arr[x];
						}
					}
				}

			}
		}
		// System.out.println("temp " + temp);
		return temp;
	}

	/*
	 * You are going to be given a word. Your job is to return the middle character of the word. If
	 * the word's length is odd, return the middle character. If the word's length is even, return
	 * the middle 2 characters.
	 * 
	 * #Examples:
	 * 
	 * Kata.getMiddle("test") should return "es"
	 * 
	 * Kata.getMiddle("testing") should return "t"
	 * 
	 * Kata.getMiddle("middle") should return "dd"
	 * 
	 * Kata.getMiddle("A") should return "A"
	 * #Input
	 * 
	 * A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000
	 * in some test cases due to an error in the test cases). You do not need to test for this. This
	 * is only here to tell you that you do not need to worry about your solution timing out.
	 * 
	 * #Output
	 * 
	 * The middle character(s) of the word represented as a string.
	 */
	public static String getMiddle(String word) {
		String middle = "";
		int length = word.length();
		if ((length % 2) == 0) {
			// System.out.println("the word is even");
			middle = word.substring((length / 2) - 1, (length / 2) + 1);
		} else {
			// System.out.println("the word is odd");
			middle = word.substring(length / 2, (length / 2) + 1);
		}
		// System.out.println("Middle " + middle);
		return middle;
	}

	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and
	 * 9. The sum of these multiples is 23.
	 * 
	 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the
	 * number passed in.
	 * 
	 * Note: If the number is a multiple of both 3 and 5, only count it once.
	 */
	public int solution(int number) {
		int sum = 0;
		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		// System.out.println("Sum " + sum);
		return sum;
	}

	// find the century from the year
	int centuryFromYear(int year) {
		int century = 0;
		if (year >= 1 && year <= 100) {
			century = 1;
		} else if (year >= 101 && year <= 200) {
			century = 2;
		} else if (year >= 201 && year <= 300) {
			century = 3;
		} else if (year >= 301 && year <= 400) {
			century = 4;
		} else if (year >= 401 && year <= 500) {
			century = 5;
		} else if (year >= 501 && year <= 600) {
			century = 6;
		} else if (year >= 601 && year <= 700) {
			century = 7;
		} else if (year >= 701 && year <= 800) {
			century = 8;
		} else if (year >= 801 && year <= 900) {
			century = 9;
		} else if (year >= 901 && year <= 1000) {
			century = 10;
		} else if (year >= 1001 && year <= 1100) {
			century = 11;
		} else if (year >= 1101 && year <= 1200) {
			century = 12;
		} else if (year >= 1201 && year <= 1300) {
			century = 13;
		} else if (year >= 1301 && year <= 1400) {
			century = 14;
		} else if (year >= 1401 && year <= 1500) {
			century = 15;
		} else if (year >= 1501 && year <= 1600) {
			century = 16;
		} else if (year >= 1601 && year <= 1700) {
			century = 17;
		} else if (year >= 1701 && year <= 1800) {
			century = 18;
		} else if (year >= 1801 && year <= 1900) {
			century = 19;
		} else if (year >= 1901 && year <= 2000) {
			century = 20;
		} else if (year >= 2001 && year <= 2100) {
			century = 21;
		}

//		if (year % 100 > 0) {
//			century = (int) Math.round(year / 100.0) + 1;
//			System.out.println("century " + century);
//		} else {
//			century = (int) Math.round(year / 100.0);
//			System.out.println("century Math.round(year / 100.0)" + Math.round(year / 100.0));
//		}
		// System.out.println("century Math.round(year / 100.0) " + Math.round(year / 100.0));
		century = (int) Math.round(year / 100.0);
		return century;
	}

	// check Palindrome
	boolean checkPalindrome(String inputString) {
		boolean isPal = false;
		if (inputString.length() == 1) {
			// System.out.println("is palindrome ");
			return true;
		}
		for (int i = 0; i < inputString.length() / 2; i++) {
			if (inputString.charAt(i) == inputString.charAt(inputString.length() - i - 1)) {
				// System.out.println("maybe palindrome");
				isPal = true;
			} else {
				isPal = false;
			}
		}
		// System.out.println("is palindrome " + isPal);
		return isPal;
	}

	/*
	 * Given an array of integers, find the pair of adjacent elements that has the largest product
	 * and return that product.
	 * 
	 * Example
	 * 
	 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
	 * adjacentElementsProduct(inputArray) = 21.
	 * 
	 * 7 and 3 produce the largest product.
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer inputArray
	 * 
	 * An array of integers containing at least two elements.
	 * 
	 * Guaranteed constraints:
	 * 2 ≤ inputArray.length ≤ 10,
	 * -1000 ≤ inputArray[i] ≤ 1000.
	 * 
	 * [output] integer
	 * 
	 * The largest product of adjacent elements.
	 */
	public int adjacentElementsProduct(int[] inputArray) {
		int value = Integer.MIN_VALUE;
		for (int i = 0; i < inputArray.length - 1; i++) {
			// System.out.println("i " + i);
			if (inputArray[i] * inputArray[i + 1] > value) {
				value = inputArray[i] * inputArray[i + 1];
				// System.out.println("value " + value);
			}
		}
		return value;
	}

	public int pologonArea(int n) {
		int area = ((int) Math.pow(n, 2)) + ((int) Math.pow(n - 1, 2));
		// System.out.println("Area " + area);
		return area;
	}

	/*
	 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each
	 * statue having an non-negative integer size. Since he likes to make things perfect, he wants
	 * to arrange them from smallest to largest so that each statue will be bigger than the previous
	 * one exactly by 1. He may need some additional statues to be able to accomplish that. Help him
	 * figure out the minimum number of additional statues needed.
	 * 
	 * Example
	 * 
	 * For statues = [6, 2, 3, 8], the output should be
	 * makeArrayConsecutive2(statues) = 3.
	 * 
	 * Ratiorg needs statues of sizes 4, 5 and 7.
	 */
	public int makeArrayConsecutive2(int[] statues) {
		int count = 0;
		// first order the array
		for (int i = 0; i < statues.length; i++) {
			for (int x = i + 1; x < statues.length; x++) {
				if (statues[i] > statues[x]) {
					int temp = statues[i];
					statues[i] = statues[x];
					statues[x] = temp;
				}
			}
		}
		// System.out.println("Sorted array " + Arrays.toString(statues));

		for (int y = 0; y < statues.length - 1; y++) {
			if (statues[y] != (statues[y + 1] - 1)) {
				count = count + statues[y + 1] - statues[y] - 1;
			}
		}
		// System.out.println("Count " + count);
		return count;
	}

	/*
	 * Given a sequence of integers as an array, determine whether it is possible to obtain a
	 * strictly increasing sequence by removing no more than one element from the array.
	 * 
	 * Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... <
	 * an. Sequence containing only one element is also considered to be strictly increasing.
	 * 
	 * Example
	 * 
	 * For sequence = [1, 3, 2, 1], the output should be
	 * almostIncreasingSequence(sequence) = false.
	 * 
	 * There is no one element in this array that can be removed in order to get a strictly
	 * increasing sequence.
	 * 
	 * For sequence = [1, 3, 2], the output should be
	 * almostIncreasingSequence(sequence) = true.
	 * 
	 * You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately,
	 * you can remove 2 to get the strictly increasing sequence [1, 3].
	 * 
	 * 
	 */
	public boolean almostIncreasingSequence2(int[] sequence) {
		int count = 0;
		List<Integer> array = Arrays.stream(sequence).boxed().collect(Collectors.toList());
		Iterator<Integer> iter = array.iterator();
		// List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList()); java 8
		// feature
		// copy int[] to list
//		for (int i = 0; i < sequence.length; i++) {
//			array.add(sequence[i]);
//		}
		// System.out.println("Array " + array);
		int max = 0;
		int min = 0;
		for (int i = 0; i < array.size() - 1; i++) {
			if (array.get(i) >= array.get(i + 1)) {
				max = i;
				min = i + 1;
				count++;
			}
		}
		if (count > 1) {
			return false;
		} else if (count == 1) {
			boolean isTrue = false;
			array.remove(max);
			// System.out.println("Array with max el removed " + array);
			for (int x = 0; x < array.size() - 1; x++) {
				if (array.get(x) >= array.get(x + 1)) {
					// System.out.println("false");
					isTrue = false;
					break;
				}
			}
			array.add(max);
			array.remove(min);
		}

		// System.out.println("true?");
		return true;
	}

	public boolean almostIncreasingSequence(int[] sequence) {
		List<Integer> array = Arrays.stream(sequence).boxed().collect(Collectors.toList());
		int length = sequence.length;
		int count1 = 0, count2 = 0;
		if (sequence[1] <= sequence[0]) {
			count1++;
		}

		for (int i = 2; i < length; i++) {
			if (sequence[i] <= sequence[i - 1]) {
				count1++;
			}
			if (sequence[i] <= sequence[i - 2]) {
				count2++;
			}
		}
		if (count1 > 1 || count2 > 1) {
			// System.out.println("false");
			return false;
		} else {
			// System.out.println("true");
			return true;
		}
	}

	public int matrix(int[][] matrix) {
		int sum = 0;
		int rows = matrix.length;
		// System.out.println("rows " + rows);
		for (int i = 0; i < rows - 1; i++) {
			for (int x = 0; x < matrix[i].length; x++) {
				if (matrix[i][x] == 0) {
					matrix[i + 1][x] = 0;
				}
				// sum = sum + matrix[i][x];
			}
			// System.out.println("matrix " + Arrays.toString(matrix[i]));
		}
		for (int y = 0; y < rows; y++) {
			for (int z = 0; z < matrix[y].length; z++) {
				sum = sum + matrix[y][z];
			}
		}
		// System.out.println("sum " + sum);
		return sum;
	}

	// Given an array of strings, return another array containing all of its longest strings.
	// Example
	// For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
	// allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
	public String[] allLongestStrings(String[] inputArray) {
		List<String> array = new ArrayList<>();
		int size = 0;
		for (String word : inputArray) {
			if (word.length() >= size) {
				size = word.length();
			}
		}

		int i = 0;
		for (String str : inputArray) {

			if (str.length() == size) {
				array.add(str);
			}
		}
		return array.toArray(new String[0]);
	}

	/*
	 * Given two strings, find the number of common characters between them.
	 * 
	 * Example
	 * 
	 * For s1 = "aabcc" and s2 = "adcaa", the output should be
	 * commonCharacterCount(s1, s2) = 3.
	 * 
	 * Strings have 3 common characters - 2 "a"s and 1 "c".
	 */
	int commonCharacterCount(String s1, String s2) {
		int count = 0;
		char[] s1Array = s1.toCharArray();
		// System.out.println("s1 array " + Arrays.toString(s1Array));
		char[] s2Array = s2.toCharArray();
		// System.out.println("s2 array " + Arrays.toString(s2Array));
		for (int i = 0; i < s1Array.length; i++) {
			for (int x = 0; x < s2Array.length; x++) {
				if (s1Array[i] == s2Array[x]) {
					count++;
					s2Array[x] = 32;
					// System.out.println("s2 array " + Arrays.toString(s2Array));
					break;
				}
			}
		}
		// System.out.println("count " + count);
		return count;
	}

	/*
	 * Ticket numbers usually consist of an even number of digits. A ticket number is considered
	 * lucky if the sum of the first half of the digits is equal to the sum of the second half.
	 * 
	 * Given a ticket number n, determine if it's lucky or not.
	 * 
	 * Example
	 * 
	 * For n = 1230, the output should be
	 * isLucky(n) = true;
	 * For n = 239017, the output should be
	 * isLucky(n) = false.
	 */
	boolean isLucky2(int n) {
		int sum1 = 0;
		int sum2 = 0;
		char[] array = String.valueOf(n).toCharArray();
		for (int i = 0; i < array.length / 2; i++) {
			sum1 = sum1 + array[i];
		}
		for (int x = array.length - 1; x >= array.length / 2; x--) {
			sum2 = sum2 + array[x];
		}
		if (sum1 == sum2) {
			return true;
		}
		// System.out.println("sum1 " + sum1 + ", sum2 " + sum2);
		return false;
	}

	/*
	 * Some people are standing in a row in a park. There are trees between them which cannot be
	 * moved. Your task is to rearrange the people by their heights in a non-descending order
	 * without moving the trees. People can be very tall!
	 * 
	 * Example
	 * 
	 * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
	 * sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer a
	 * 
	 * If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a
	 * person standing in the ith position.
	 * 
	 * 
	 */
	public int[] sortByHeight(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				for (int x = i + 1; x < a.length; x++) {
					if (a[x] != -1) {
						if (a[i] > a[x]) {
							int temp = a[i];
							a[i] = a[x];
							a[x] = temp;
						}
					}
				}
			}
		}
		// System.out.println("sorted array " + Arrays.toString(a));
		return a;
	}

	/*
	 * Write a function that reverses characters in (possibly nested) parentheses in the input
	 * string.
	 * 
	 * Input strings will always be well-formed with matching ()s.
	 * 
	 * Example
	 * 
	 * For inputString = "(bar)", the output should be
	 * reverseInParentheses(inputString) = "rab";
	 * For inputString = "foo(bar)baz", the output should be
	 * reverseInParentheses(inputString) = "foorabbaz";
	 * For inputString = "foo(bar)baz(blim)", the output should be
	 * reverseInParentheses(inputString) = "foorabbazmilb";
	 * For inputString = "foo(bar(baz))blim", the output should be
	 * reverseInParentheses(inputString) = "foobazrabblim".
	 * Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] string inputString
	 * 
	 * A string consisting of lowercase English letters and the characters ( and ). It is guaranteed
	 * that all parentheses in inputString form a regular bracket sequence.
	 */
	String reverseInParentheses(String inputString) {

		return null;
	}

	public static String reverseWord(String word) {
		String reversedWord = "";
		char[] array = word.toCharArray();
		for (int i = 0; i < array.length / 2; i++) {
			char temp = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = temp;
		}
		for (int x = 0; x < array.length; x++) {
			reversedWord = reversedWord + array[x];
		}
		// System.out.println("reversed word " + reversedWord);
		return reversedWord;
	}

	/*
	 * Several people are standing in a row and need to be divided into two teams. The first person
	 * goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth
	 * into team 2, and so on.
	 * 
	 * You are given an array of positive integers - the weights of the people. Return an array of
	 * two integers, where the first element is the total weight of team 1, and the second element
	 * is the total weight of team 2 after the division is complete.
	 * 
	 * Example
	 * 
	 * For a = [50, 60, 60, 45, 70], the output should be
	 * alternatingSums(a) = [180, 105].
	 */
	int[] alternatingSums(int[] a) {

		int team1 = 0;
		int team2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				team1 = team1 + a[i];
			} else {
				team2 = team2 + a[i];
			}
		}
		int[] teamWeight = { team1, team2 };
		// System.out.println("result " + Arrays.toString(teamWeight));
		return teamWeight;
	}

	/*
	 * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
	 * 
	 * Example
	 * 
	 * For
	 * 
	 * picture = ["abc","ded"]
	 * the output should be
	 * 
	 * addBorder(picture) = ["*****", "*abc*", "*ded*", "*****"]
	 */
	String[] addBorder(String[] picture) {
		String[] array = new String[picture.length + 2];
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == array.length - 1) {
				int size = picture[0].length() + 2;
				String asteriks = "";
				// System.out.println("size " + size);
				for (int x = 0; x < size; x++) {
					asteriks = asteriks + "*";
				}
				array[i] = asteriks;
			} else {
				for (int z = 0; z < 1; z++) {
					String test = "*" + picture[i - 1] + "*";
					array[i] = test;
					break;
				}
			}
		}
		// System.out.println("array " + Arrays.toString(array));
		return array;
	}

//	String[] addBorder(String[] picture) {
//
//		System.out.println("matrix size " + picture.length);
//		String[][] border = new String[picture.length + 2][1];
//		for (int i = 0; i < border.length; i++) {
//			if (i == 0 || i == border.length - 1) {
//				for (int x = 0; x < border[i].length; x++) {
//					border[i][x] = "****";
//				}
//			} else {
//				for (int z = 0; z < 1; z++) {
//					String test = "*" + picture[i - 1] + "*";
//					border[i][z] = test;
//					break;
//				}
//			}
//			System.out.println("matrix " + Arrays.toString(border[i]));
//		}
//
//		return null;
//	}

	/*
	 * Two arrays are called similar if one can be obtained from another by swapping at most one
	 * pair of elements in one of the arrays.
	 * 
	 * Given two arrays a and b, check whether they are similar.
	 * 
	 * Example
	 * 
	 * For a = [1, 2, 3] and b = [1, 2, 3], the output should be
	 * areSimilar(a, b) = true.
	 * 
	 * The arrays are equal, no need to swap any elements.
	 * 
	 * For a = [1, 2, 3] and b = [2, 1, 3], the output should be
	 * areSimilar(a, b) = true.
	 * 
	 * We can obtain b from a by swapping 2 and 1 in b.
	 * 
	 * For a = [1, 2, 2] and b = [2, 1, 1], the output should be
	 * areSimilar(a, b) = false.
	 * 
	 * Any swap of any two elements either in a or in b won't make a and b equal.
	 */
	boolean areSimilar(int[] a, int[] b) {
		int index1 = 0;
		int index2 = 0;

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				count++;
				if (count > 1) {
					index2 = i;
				} else {
					index1 = i;
				}
			}
		}
		// System.out.println("index1 " + index1 + ", index2 " + index2);
		if (count > 2) {
			return false;
		}

		if (a[index1] == b[index2] && a[index2] == b[index1]) {
			return true;
		}

		return false;

	}

	public static int sumEl(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static int countDifference(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] != b[i]) {
				count++;
			}

		}

		return count;
	}

	/*
	 * You are given an array of integers. On each move you are allowed to increase exactly one of
	 * its element by one. Find the minimal number of moves required to obtain a strictly increasing
	 * sequence from the input.
	 * 
	 * Example
	 * 
	 * For inputArray = [1, 1, 1], the output should be
	 * arrayChange(inputArray) = 3.
	 * inputArray: [2, 1, 10, 1]
	 * Expected Output: 12
	 * inputArray: [-1000, 0, -2, 0]
	 * Expected Output: 5
	 * 
	 * Practic trebuie să returnezi de câte ori trebuie să faci +1 la fiecare element ca să fie
	 * crescător
	 * la un array [1, 1], trebuie să adaugi +1 la a[1] ca să obții [1, 2] - crescător
	 * [-1000, 0, -2, 0]
	 * a[2] ar trebui să facă de 3 ori +1 ca să devină 1
	 * și pentru a[3] ar trebui să faci de 2 ori +1 ca să devină 2
	 * și obții [-1000, 0, 1, 2]
	 * deci returnezi 5
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer inputArray
	 * 
	 * Guaranteed constraints:
	 * 3 ≤ inputArray.length ≤ 105,
	 * -105 ≤ inputArray[i] ≤ 105.
	 * 
	 * [output] integer
	 * 
	 * The minimal number of moves needed to obtain a strictly increasing sequence from inputArray.
	 * It's guaranteed that for the given test cases the answer always fits signed 32-bit integer
	 * type.
	 */
	int arrayChange(int[] inputArray) {
		int count = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] >= inputArray[i + 1]) {
				int temp = inputArray[i + 1];
				inputArray[i + 1] = inputArray[i] + 1;
				count = count + inputArray[i + 1] - temp;
			}
		}
		// System.out.println("array " + Arrays.toString(inputArray));
		// System.out.println("count " + count);
		return count;
	}

	/*
	 * Given a string, find out if its characters can be rearranged to form a palindrome.
	 * 
	 * Example
	 * 
	 * For inputString = "aabb", the output should be
	 * palindromeRearranging(inputString) = true.
	 * 
	 * We can rearrange "aabb" to make "abba", which is a palindrome.
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] string inputString
	 * 
	 * A string consisting of lowercase English letters.
	 * 
	 * Guaranteed constraints:
	 * 1 ≤ inputString.length ≤ 50.
	 * 
	 * [output] boolean
	 * 
	 * true if the characters of the inputString can be rearranged to form a palindrome, false
	 * otherwise.
	 */
	boolean palindromeRearranging(String inputString) {
		int countpair = 0;
		int countSingles = 0;
		if (inputString.length() == 1) {
			return true;
		}
		for (int i = 0; i < inputString.length(); i++) {
			for (int x = i + 1; x < inputString.length(); x++) {
				if (inputString.charAt(i) == inputString.charAt(x)) {
					countpair++;
					break;
				}
			}
		}
		System.out.println("countpair " + countpair);
		System.out.println("half " + inputString.length() / 2);
		System.out.println("whole word length " + inputString.length());
		if (countpair == 0) {
			return false;
		}
		if (countpair % 2 == 0) {
			System.out.println("true");
			return true;
		} else if ((inputString.length() - countpair) == 2) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}

	/*
	 * Call two arms equally strong if the heaviest weights they each are able to lift are equal.
	 * 
	 * Call two people equally strong if their strongest arms are equally strong (the strongest arm
	 * can be both the right and the left), and so are their weakest arms.
	 * 
	 * Given your and your friend's arms' lifting capabilities find out if you two are equally
	 * strong.
	 * 
	 * Example
	 * 
	 * For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10, the output should
	 * be
	 * areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = true;
	 * For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 10, the output should
	 * be
	 * areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = true;
	 * For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 9, the output should
	 * be
	 * areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = false.
	 * 
	 */
	boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		if ((yourLeft == friendsLeft && yourRight == friendsRight) || (yourLeft == friendsRight && yourRight == friendsLeft)) {
			return true;
		}
		return false;
	}

	/*
	 * Given an array of integers, find the maximal absolute difference between any two of its
	 * adjacent elements.
	 * 
	 * Example
	 * 
	 * For inputArray = [2, 4, 1, 0], the output should be
	 * arrayMaximalAdjacentDifference(inputArray) = 3.
	 */
	int arrayMaximalAdjacentDifference(int[] inputArray) {
		int diff = 0;
		// System.out.println(Math.abs(-5));
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (Math.abs(inputArray[i] - inputArray[i + 1]) > diff) {
				diff = Math.abs(inputArray[i] - inputArray[i + 1]);
			}
		}
		// System.out.println("diff " + diff);
		return diff;
	}

	/*
	 * An IP address is a numerical label assigned to each device (e.g., computer, printer)
	 * participating in a computer network that uses the Internet Protocol for communication. There
	 * are two versions of the Internet protocol, and thus two versions of addresses. One of them is
	 * the IPv4 address.
	 * 
	 * IPv4 addresses are represented in dot-decimal notation, which consists of four decimal
	 * numbers, each ranging from 0 to 255 inclusive, separated by dots, e.g., 172.16.254.1.
	 * 
	 * Given a string, find out if it satisfies the IPv4 address naming rules.
	 * 
	 * Example
	 * 
	 * For inputString = "172.16.254.1", the output should be
	 * isIPv4Address(inputString) = true;
	 * 
	 * For inputString = "172.316.254.1", the output should be
	 * isIPv4Address(inputString) = false.
	 * 
	 * 316 is not in range [0, 255].
	 * 
	 * For inputString = ".254.255.0", the output should be
	 * isIPv4Address(inputString) = false.
	 * 
	 * There is no first number.
	 * 
	 * 
	 */
	boolean isIPv4Address(String inputString) {
		if (inputString.length() < 7) {
			return false;
		}
		String[] array = inputString.split("\\.");
		// System.out.println("array " + Arrays.toString(array));
		if (array.length != 4) {
			return false;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i].isEmpty() || array[i].length() > 3) {
				return false;
			} else {
				for (int x = 0; x < array[i].length(); x++) {
					System.out.println("x " + array[i].charAt(x));
					if (array[i].charAt(x) < 48 || array[i].charAt(x) > 58) {
						return false;
					}
				}
			}
			if (Integer.parseInt(array[i]) > 255) {
				// System.out.println("is IPv4 " + false);
				return false;
			}
		}
		// System.out.println("replaced string " + inputString);
		// System.out.println("is IPv4 " + true);
		return true;
	}

	/*
	 * You are given an array of integers representing coordinates of obstacles situated on a
	 * straight line.
	 * 
	 * Assume that you are jumping from the point with coordinate 0 to the right. You are allowed
	 * only to make jumps of the same length represented by some integer.
	 * 
	 * Find the minimal length of the jump enough to avoid all the obstacles.
	 * 
	 * Example
	 * 
	 * For inputArray = [5, 3, 6, 7, 9], the output should be
	 * avoidObstacles(inputArray) = 4.
	 */
	int avoidObstacles(int[] inputArray) {
		int startPoint = 0;
		int distance = 0;
		// sort the array
		for (int i = 0; i < inputArray.length; i++) {
			for (int x = i + 1; x < inputArray.length; x++) {
				if (inputArray[i] > inputArray[x]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[x];
					inputArray[x] = temp;
				}
			}
		}
		System.out.println("sorted array " + Arrays.toString(inputArray));

//		for (int z = 0; z < inputArray.length - 1; z++) {
//			// daca diferenta dintre [z+1] - z==nr par (2, 4,6) => primul element liber este[z]+1
//			// daca diferenta dintre [z+1] - z==nr impar (3,5,7) => primul element liber este[z]+2
//			if ((inputArray[z + 1] - inputArray[z]) > 1) {
//				if ((inputArray[z + 1] - inputArray[z]) % 2 == 0) { // nr par
//					distance = (inputArray[z] + 1) - startPoint;
//					for (int x = z + 1; x < inputArray.length; x++) {
//						if ((distance * 2) == inputArray[x]) {
//							distance = 0;
//							break;
//						}
//					}
//					startPoint = distance;
//				} else {
//					distance = (inputArray[z] + 2) - startPoint;
//					startPoint = distance;
//				}
//			} else if ((inputArray[z + 1] - inputArray[z]) == 1) {
//				distance = inputArray[z + 1] + 1;
//				for (int q = z + 1; q < inputArray.length; q++) {
//					if (distance == inputArray[q]) {
//						distance = 0;
//					}
//				}
//			}
//		}
		System.out.println("distance " + distance);
		return distance;
	}

	/*
	 * When migrating data from a source storage system to a target storage system, the number one
	 * focus is avoiding data corruption at all cost. In order to meet these high standards, various
	 * rounds of tests are run checking for corrupted blocks as well as successfully migrated
	 * lengthy regions.
	 * We are going to represent the source storage system and target storage system as sequential
	 * arrays sourceArray and destinationArray respectively, where sourceArray[i] represents binary
	 * data of the ith source block as an integer, and destinationArray[i] represents binary data of
	 * the ith destination block, where the data should be migrated, also as an integer. Given the
	 * content of the source and the migrated content of the target, find the length and the
	 * starting block of the longest uncorrupted data segment (segment = subsequent blocks).
	 * 
	 * If there is no uncorrupted segment, return an array containing 0 and 0 respectively.
	 * 
	 * Example
	 * 
	 * For sourceArray = [33531593, 96933415, 28506400, 39457872, 29684716, 86010806] and
	 * destinationArray = [33531593, 96913415, 28506400, 39457872, 29684716, 86010806], the output
	 * should be
	 * longestUncorruptedSegment(sourceArray, destinationArray) = [4, 2].
	 * 
	 * The only corrupted element is located by index 1, where sourceArray[1] = 96933415 != 96913415
	 * = destinationArray[1], all other data blocks were transfered uncorrupted. So the longest
	 * uncorrupted segment starts on second index and goes to the end of the array, thus having
	 * length 4.
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer sourceArray
	 * 
	 * The source data as sequential array.
	 * 
	 * Guaranteed constraints:
	 * 1 ≤ sourceArray.length ≤ 105,
	 * 107 ≤ sourceArray[i] < 108.
	 * 
	 * [input] array.integer destinationArray
	 * 
	 * The migrated data as sequential array.
	 * 
	 * Guaranteed constraints:
	 * destinationArray.length = sourceArray.length,
	 * 107 ≤ destinationArray[i] < 108.
	 * 
	 * [output] array.integer
	 * 
	 * An array of two elements - first is the length of the longest uncorrupted data segment and
	 * second is the starting block.
	 */
	int[] longestUncorruptedSegment(int[] sourceArray, int[] destinationArray) {
		int countEq = 0;
		int index = 0;
		int indexNonEq = 0;
		int max = 0;
		for (int i = 0; i < sourceArray.length; i++) {
			if (sourceArray[i] == destinationArray[i]) {
				if (countEq == 0) {
					index = i;
				}
				countEq++;
			} else {

				if (max < countEq) {
					max = countEq;
					indexNonEq = index;
				}
				countEq = 0;
			}
		}
		if (max < countEq) {
			max = countEq;
			indexNonEq = index;
		}
		int[] segment = { max, indexNonEq };
		// System.out.println("index " + index + ", count eq " + countEq + ", indexNonEq " +
		// indexNonEq + ", max " + max);
		// System.out.println("segment " + Arrays.toString(segment));
		return segment;
	}

	/*
	 * Last night you partied a little too hard. Now there's a black and white photo of you that's
	 * about to go viral! You can't let this ruin your reputation, so you want to apply the box blur
	 * algorithm to the photo to hide its content.
	 * 
	 * The pixels in the input image are represented as integers. The algorithm distorts the input
	 * image in the following way: Every pixel x in the output image has a value equal to the
	 * average value of the pixel values from the 3 × 3 square that has its center at x, including x
	 * itself. All the pixels on the border of x are then removed.
	 * 
	 * Return the blurred image as an integer, with the fractions rounded down.
	 * 
	 * Example
	 * 
	 * For
	 * 
	 * image = [[1, 1, 1],
	 * [1, 7, 1],
	 * [1, 1, 1]]
	 * the output should be boxBlur(image) = [[1]].
	 * 
	 * To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 + 1 + 7 + 1 + 1 +
	 * 1 + 1) = 15 / 9 = 1.66666 = 1. The border pixels are cropped from the final result.
	 * 
	 * For
	 * 
	 * image = [[7, 4, 0, 1],
	 * [5, 6, 2, 2],
	 * [6, 10, 7, 8],
	 * [1, 4, 2, 0]]
	 * the output should be
	 * 
	 * boxBlur(image) = [[5, 4],
	 * [4, 4]]
	 * There are four 3 × 3 squares in the input image, so there should be four integers in the
	 * blurred output. To get the first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 =
	 * 5.2222 = 5. The other three integers are obtained the same way, then the surrounding integers
	 * are cropped from the final result.
	 */
	int[][] boxBlur(int[][] image) {
		for (int i = 0; i < image.length; i++) {
			for (int x = 0; x < image[i].length; x++) {

			}
		}
		return null;
	}

	/*
	 * Given an array of integers, replace all the occurrences of elemToReplace with
	 * substitutionElem.
	 * 
	 * Example
	 * 
	 * For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the output should be
	 * arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer inputArray
	 * 
	 * Guaranteed constraints:
	 * 2 ≤ inputArray.length ≤ 10,
	 * 0 ≤ inputArray[i] ≤ 10.
	 * 
	 * [input] integer elemToReplace
	 * 
	 * Guaranteed constraints:
	 * 0 ≤ elemToReplace ≤ 10.
	 * 
	 * [input] integer substitutionElem
	 * 
	 * Guaranteed constraints:
	 * 0 ≤ substitutionElem ≤ 10.
	 * 
	 * [output] array.integer
	 */
	int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == elemToReplace) {
				inputArray[i] = substitutionElem;
			}
		}
		return inputArray;
	}

	/*
	 * Check if all digits of the given integer are even.
	 * 
	 * Example
	 * 
	 * For n = 248622, the output should be
	 * evenDigitsOnly(n) = true;
	 * For n = 642386, the output should be
	 * evenDigitsOnly(n) = false.
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] integer n
	 * 
	 * Guaranteed constraints:
	 * 1 ≤ n ≤ 109.
	 */
	boolean evenDigitsOnly(int n) {
		int length = String.valueOf(n).length();
		for (int i = 0; i < length; i++) {
			int digit = n % 10;
			n = n / 10;
			if (digit % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Correct variable names consist only of English letters, digits and underscores and they can't
	 * start with a digit.
	 * 
	 * Check if the given string is a correct variable name.
	 * 
	 * Example
	 * 
	 * For name = "var_1__Int", the output should be
	 * variableName(name) = true;
	 * For name = "qq-q", the output should be
	 * variableName(name) = false;
	 * For name = "2w2", the output should be
	 * variableName(name) = false.
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] string name
	 * 
	 * Guaranteed constraints:
	 * 1 ≤ name.length ≤ 10.
	 * 
	 * [output] boolean
	 * 
	 * true if name is a correct variable name, false otherwise.
	 */
	boolean variableName(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(0) >= 48 && name.charAt(0) <= 57) {
				return false;
			}
			if (name.charAt(i) == 95 || (name.charAt(i) >= 48 && name.charAt(i) <= 57) || (name.charAt(i) >= 65 && name.charAt(i) <= 90)
					|| (name.charAt(i) >= 97 && name.charAt(i) <= 122)) {
				count++;
			}
			if (count == name.length()) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Given a string, replace each of its character by the next one in the English alphabet (z
	 * would be replaced by a).
	 * 
	 * Example
	 * 
	 * For inputString = "crazy", the output should be
	 * alphabeticShift(inputString) = "dsbaz".
	 */
	String alphabeticShift(String inputString) {
		char[] array = inputString.toCharArray();
		String newWord = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 122) {
				array[i] = 97;
			} else {
				int temp = Integer.valueOf(array[i]) + 1;
				array[i] = (char) temp;
				newWord = newWord + array[i];
			}
		}
		System.out.println("new word " + newWord);
		return newWord;
	}

	/*
	 * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the
	 * distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring,
	 * too).
	 * 
	 * Given n and firstNumber, find the number which is written in the radially opposite position
	 * to firstNumber.
	 * 
	 * Example
	 * 
	 * For n = 10 and firstNumber = 2, the output should be
	 * circleOfNumbers(n, firstNumber) = 7.
	 */
	int circleOfNumbers(int n, int firstNumber) {
		int lastNr = 0;
		if (firstNumber <= n / 2) {
			lastNr = firstNumber + n / 2;
		} else {
			lastNr = firstNumber - n / 2;
		}
		return lastNr;
	}

	/*
	 * You have deposited a specific amount of money into your bank account. Each year your balance
	 * increases at the same growth rate. With the assumption that you don't make any additional
	 * deposits, find out how long it would take for your balance to pass a specific threshold.
	 * 
	 * Example
	 * 
	 * For deposit = 100, rate = 20, and threshold = 170, the output should be
	 * depositProfit(deposit, rate, threshold) = 3.
	 * 
	 * Each year the amount of money in your account increases by 20%. So throughout the years, your
	 * balance would be:
	 * 
	 * year 0: 100;
	 * year 1: 120;
	 * year 2: 144;
	 * year 3: 172.8.
	 * Thus, it will take 3 years for your balance to pass the threshold, so the answer is 3.
	 */
	int depositProfit(int deposit, int rate, int threshold) {
		int years = 0;
		double total = deposit;
		double dob = rate / 100.00;
		while (total < threshold) {
			total = total + (total * dob);
			years++;
		}
		/*
		 * time consuming
		 * int years=0;
		 * double dob=rate/100;
		 * while(deposit<threshold) {
		 * deposit = (int) (deposit + (deposit*dob));
		 * years++;
		 */

		return years;
	}

	/*
	 * Given a sorted array of integers a, find an integer x from a such that the value of
	 * 
	 * abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
	 * is the smallest possible (here abs denotes the absolute value).
	 * If there are several possible answers, output the smallest one.
	 * 
	 * Example
	 * 
	 * For a = [2, 4, 7], the output should be
	 * absoluteValuesSumMinimization(a) = 4.
	 */
	int absoluteValuesSumMinimization(int[] a) {
		int sum = 0;
		int max = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int x = 0; x < a.length; x++) {
				sum = sum + (a[x] - a[i]);
			}
			System.out.println("sum " + Math.abs(sum));
			if (Math.abs(sum) < max) {
				max = sum;
				index = i;
			}
			sum = 0;
		}
		System.out.println("index " + index);
		return index;
	}

	/*
	 * You have an array of numbers.
	 * Your task is to sort ascending odd numbers but even numbers must be on their places.
	 * 
	 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need
	 * to return it.
	 * 
	 * Example
	 * 
	 * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
	 */
	public int[] sortOdd(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] % 2 != 0) {
				for (int x = i + 1; x < a.length; x++) {
					if (a[x] % 2 != 0) {
						if (a[i] > a[x]) {
							int temp = a[i];
							a[i] = a[x];
							a[x] = temp;
						}
					}
				}
			}
		}
		return a;
	}
}