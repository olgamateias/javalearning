package com.java.learning.v8.library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class AuthorTest {

	@Test
	public void testAuthor() {
		IAuthor author = null; // new Author();
		author.setFirstName("Mihai");
		author.setLastName("Eminescu");
		author.setBirthDate(LocalDate.of(1850, 1, 15));
		author.setDeathDate(LocalDate.of(1889, 6, 15));

		assertEquals(author.getFirstName(), "Mihai");
		assertEquals(author.getLastName(), "Eminescu");
		assertEquals(author.getBirthDate(), LocalDate.of(1850, 1, 15));
		assertEquals(author.getDeathDate(), LocalDate.of(1889, 6, 15));
	}
}
