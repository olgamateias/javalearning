package com.java.learning.v03;

public class PrettyPrintStuff {

	
	/*
	 * Print a square with the given width and character. Width cannot be greater then 20 and smaller than 1. 
	 * If width is not valid return empty string ""
	 * E.g.: if the width is 4 and the character is # you return/print:
	 */
//		####
//		####
//		####
//		####
	/*
	 * for width 3 and character * you print
	 */
//		***
//		***
//		***
	public static String printSquare(int width, char chr) {
		return "";
	}
	
	/*
	 * Print a right triangle (triunghi drept :D ) with the given height and the specified character. The right angle should be on the left side.
	 * Height cannot be greater then 20 and smaller than 2. If height is not valid return empty string ""
	 * E.g.: if height=4  and chr=* then you return/print:
	 */ 
//		*
//		**
//		***
//		****
	public static String printTriangleLeft(int height, char chr) {
		return "";
	}
	
	/*
	 * Print a right triangle with the given height and the specified character. The right angle should be on the right side.
	 * Height cannot be greater then 20 and smaller than 2. If width is not valid return empty string ""
	 * E.g.: if height=4  and chr=^ then you return/print:
	 */ 
//		   ^
//		  ^^
//		 ^^^
//		^^^^
	public static String printTriangleRight(int height, char chr) {
		return "";
	}
	
	/*
	 * Print an isosceles triangle with the given height and the specified character.
	 * Height cannot be greater then 20 and smaller than 2. If width is not valid return empty string ""
	 * E.g.: if height=4  and chr=. then you return/print:
	 */ 
//		   .
//		  ...
//		 .....
//		.......
	public static String printTriangleIsoscel(int height, char chr) {
		return "";
	}
	
	/*
	 * Print a cross with the given size and character. Size cannot be greater than 20 or smaller than 3. The size specifies the height and width of the cross.
	 * E.g.: size=5,  chr=* you return/print:
	 */
//			*
//			*
//		  *****
//			*
//			*
	/*
	 * If the size is an odd number then you print the horizontal line above the midle and the width is one unit smaller
	 * e.g.: size=6, chr=# then the width becomes 5
	 */
//			#
//			#
//		  #####
//			#
//			#
//			#
	public static String printCross(int size, char chr) {
		return "";
	}

}
