package com.java.learning.exercises;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercises ex1 = new Exercises();
		ex1.isLucky(1230);
		char number = 'G';
		ex1.newNrSystem(number);
		ex1.constructArray(8);
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		ex1.phoneNr(array);
		ex1.reversedNr(1254859723);
		ex1.squareDigits(9119);
		ex1.calculateYears(1000, 0.05, 0.18, 1100);
		// double[] arr = { 1, 1, 1, 2, 3, 3, 3 };
		double[] arr = { 0, 1, 0 };
		ex1.findUniq(arr);
		ex1.getMiddle("testing");
		ex1.solution(10);
		ex1.centuryFromYear(1705);
		ex1.checkPalindrome("aaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaa");
		int[] arrayN = { -23, 4, -3, 8, -12 };
		ex1.adjacentElementsProduct(arrayN);
		ex1.pologonArea(3);
		int[] newArray = { 6, 2, 3, 9 };
		ex1.makeArrayConsecutive2(newArray);
		int[] sequence = { 1, 3, 2, 4 };
		ex1.almostIncreasingSequence(sequence);
		int[][] matrix = { { 0, 3, 5, 7 }, { 4, 5, 6, 1 }, { 1, 0, 2, 0 } };
		ex1.matrix(matrix);
		String[] inputArray = { "abc", "eeee", "abcd", "dcd" };
		ex1.allLongestStrings(inputArray);
		ex1.commonCharacterCount("aabcc", "adcaa");
		ex1.isLucky2(1230);
		int[] sortByHeight = { -1, 150, 190, 170, -1, -1, 160, 180 };
		ex1.sortByHeight(sortByHeight);
		// ex1.reverseInParentheses("foo(bar)baz(blim)");
		ex1.reverseInParentheses("foo(bar(baz))blim");
		ex1.reverseWord("bar");
		int[] teamWeight = { 50, 60, 60, 45, 70 };
		ex1.alternatingSums(teamWeight);
		String[] picture = { "abc", "ded" };
		ex1.addBorder(picture);
		int[] a = { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
		int[] b = { 832, 998, 148, 570, 533, 561, 455, 147, 894, 279 };
		ex1.areSimilar(a, b);
		int[] arrayChange = { -1000, 0, -2, 0 };
		ex1.arrayChange(arrayChange);
		ex1.palindromeRearranging("geekskeeg");
		int[] maxAdj = { -1, 4, 10, 3, -2 };
		ex1.arrayMaximalAdjacentDifference(maxAdj);
		ex1.isIPv4Address("12.14.24");
		int[] sourceArray = { 33531593, 96933415, 28506400, 39457872, 29684716, 86010806 };
		int[] destinationArray = { 33531593, 96913415, 28506400, 39457872, 29684716, 86010806 };
		ex1.longestUncorruptedSegment(sourceArray, destinationArray);
		int[] avoidObstacles = { 19, 32, 11, 23 };
		ex1.avoidObstacles(avoidObstacles);
		ex1.evenDigitsOnly(5468428);
		ex1.variableName("var_1_-Int");
		ex1.alphabeticShift("aaaabbbccd");
		ex1.depositProfit(1, 1, 199);
		int[] sumVal = { 2, 4, 7 };
		ex1.absoluteValuesSumMinimization(sumVal);
		int[] sortOdd = { 2, 4, 7 };
		ex1.sortOdd(sortOdd);
		int[] extractEachKth = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ex1.extractEachKth(extractEachKth, 3);
//		int[] array = { 100, 22, 4, 11, 31, 103 };
//		ex1.digitRootSort(array);
//		int[] array2 = { 13, 20, 7, 4 };
//		ex1.digitRootSort(array2);
//		int[] array3 = { 130, 22, 7, 4 };
//		ex1.digitRootSort(array3);
//		int[] array4 = { 1301, 205, 7, 4 };
//		ex1.digitRootSort(array4);
	}

}
