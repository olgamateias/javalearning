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
								System.out.println(" x " + arr[x]);
								System.out.println(" i " + arr[i]);
								System.out.println(" z " + arr[z]);
								temp = arr[z];
								return arr[z];
							}
						} else if (arr[x] != arr[i]) {
							System.out.println(" i " + arr[i]);
							System.out.println(" x " + arr[x]);
							temp = arr[x];
							return arr[x];
						}
					}
				}

			}
		}
		System.out.println("temp " + temp);
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
			System.out.println("the word is even");
			middle = word.substring((length / 2) - 1, (length / 2) + 1);
		} else {
			System.out.println("the word is odd");
			middle = word.substring(length / 2, (length / 2) + 1);
		}
		System.out.println("Middle " + middle);
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
		System.out.println("Sum " + sum);
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
			System.out.println("is palindrome ");
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
		System.out.println("is palindrome " + isPal);
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
			System.out.println("i " + i);
			if (inputArray[i] * inputArray[i + 1] > value) {
				value = inputArray[i] * inputArray[i + 1];
				System.out.println("value " + value);
			}
		}
		return value;
	}

	public int pologonArea(int n) {
		int area = ((int) Math.pow(n, 2)) + ((int) Math.pow(n - 1, 2));
		System.out.println("Area " + area);
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
		System.out.println("Sorted array " + Arrays.toString(statues));

		for (int y = 0; y < statues.length - 1; y++) {
			if (statues[y] != (statues[y + 1] - 1)) {
				count = count + statues[y + 1] - statues[y] - 1;
			}
		}
		System.out.println("Count " + count);
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
//	public boolean almostIncreasingSequence(int[] sequence) {
//		int count = 0;
//		List<Integer> array = Arrays.stream(sequence).boxed().collect(Collectors.toList());
//		// List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList()); java 8
//		// feature
//		// copy int[] to list
////		for (int i = 0; i < sequence.length; i++) {
////			array.add(sequence[i]);
////		}
//		System.out.println("Array " + array);
//		for (int x : array) {
//			int temp = array.get(x);
//			System.out.println("temp " + temp);
//			array.remove(x);
//			System.out.println("Array with one removed element " + array);
//
//			for (int y = 0; y < array.size() - 1; y++) {
//				if (array.get(y) < array.get(y + 1)) {
//					count++;
//				}
//			}
//			if (count == array.size() - 1) {
//				System.out.println("almostIncreasingSequence " + array);
//				return true;
//			}
//			count = 0;
//			array.add(x, temp);
//			System.out.println("Initial Array " + array);
//		}
//
//		return false;
//	}

	public boolean almostIncreasingSequence(int[] sequence) {

		List<Integer> array = Arrays.stream(sequence).boxed().collect(Collectors.toList());
		Iterator<Integer> iter = array.iterator();
		for (int x : array) {

			int count = 0;
			int temp = array.get(x);
			array.remove(x);

			for (int y = 0; y < array.size() - 1; y++) {
				if (array.get(y) < array.get(y + 1)) {
					count++;
				} else {
					break;
				}
			}
			if (count == array.size() - 1) {
				return true;
			}
			count = 0;
			array.add(x, temp);
		}

		return false;
	}
}