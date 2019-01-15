package com.java.learning.exercises;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercises ex1 = new Exercises();
		ex1.isLucky(1230);
		char number = 'G';
		ex1.newNrSystem(number);
		int[] array = { 100, 22, 4, 11, 31, 103 };
		ex1.digitRootSort(array);
		int[] array2 = { 13, 20, 7, 4 };
		ex1.digitRootSort(array2);
		int[] array3 = { 130, 22, 7, 4 };
		ex1.digitRootSort(array3);
		int[] array4 = { 1301, 205, 7, 4 };
		ex1.digitRootSort(array4);
	}

}
