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
