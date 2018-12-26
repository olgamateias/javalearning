package com.java.learning.v03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestersPrettyPrintStuff {

	@Test
	void testSquare() {
		assertEquals("*", PrettyPrintStuff.printSquare(1, '*'));
		assertEquals("**\n**", PrettyPrintStuff.printSquare(2, '*'));
		assertEquals("####\n####\n####\n####", PrettyPrintStuff.printSquare(4, '#'));
		assertEquals("", PrettyPrintStuff.printSquare(0, '*'));
		assertEquals("", PrettyPrintStuff.printSquare(21, '*'));
		assertEquals("", PrettyPrintStuff.printSquare(-1, '*'));
	}
	
	@Test
	void testTriangleLeft() {
		assertEquals("#\n##", PrettyPrintStuff.printTriangleLeft(2, '#'));
		assertEquals("^\n^^\n^^^\n^^^^", PrettyPrintStuff.printTriangleLeft(4, '^'));
		assertEquals("", PrettyPrintStuff.printTriangleLeft(-2, '#'));
		assertEquals("", PrettyPrintStuff.printTriangleLeft(0, '*'));
		assertEquals("", PrettyPrintStuff.printTriangleLeft(1, '#'));
	}
	
	@Test
	void testTriangleRight() {
		assertEquals(" #\n##", PrettyPrintStuff.printTriangleRight(2, '#'));
		assertEquals("   ^\n  ^^\n ^^^\n^^^^", PrettyPrintStuff.printTriangleRight(4, '^'));
		assertEquals("", PrettyPrintStuff.printTriangleRight(-2, '#'));
		assertEquals("", PrettyPrintStuff.printTriangleRight(0, '*'));
		assertEquals("", PrettyPrintStuff.printTriangleRight(1, '#'));
	}
	
	@Test
	void testTriangleIsosceles() {
		assertEquals(" #\n###", PrettyPrintStuff.printTriangleIsoscel(2, '#'));
		assertEquals("   ^\n  ^^^\n ^^^^^\n^^^^^^", PrettyPrintStuff.printTriangleIsoscel(4, '^'));
		assertEquals("", PrettyPrintStuff.printTriangleIsoscel(-2, '#'));
		assertEquals("", PrettyPrintStuff.printTriangleIsoscel(0, '*'));
		assertEquals("", PrettyPrintStuff.printTriangleIsoscel(1, '#'));
	}
	
	@Test
	void testCross() {
		assertEquals(" +\n+++\n +", PrettyPrintStuff.printCross(3, '+'));
		assertEquals("  *\n  *\n*****\n  *\n  *\n  *", PrettyPrintStuff.printCross(6, '*'));
		assertEquals("", PrettyPrintStuff.printCross(21, '+'));
		assertEquals("", PrettyPrintStuff.printCross(2, '+'));
		assertEquals("", PrettyPrintStuff.printCross(1, '+'));
		assertEquals("", PrettyPrintStuff.printCross(0, '+'));
		assertEquals("", PrettyPrintStuff.printCross(-2, '+'));
	}
}
