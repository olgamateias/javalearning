package com.java.learning.v8.library;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class BookTest {

	@Test
	public void testBook() {
		IPublisher publisher = null; // new Publisher();
		publisher.setCity("Iasi");
		publisher.setName("Teora");
		publisher.setId(1);

		IAuthor author = null; // new Author();
		author.setFirstName("Mihai");
		author.setLastName("Eminescu");
		author.setBirthDate(LocalDate.of(1850, 1, 15));
		author.setDeathDate(LocalDate.of(1889, 6, 15));
		author.setId(1);

		IBook book = null; // new Book();
		book.setTitle("Poezii");
		book.setGenre("poezie");
		book.setPublishDate(LocalDate.of(1880, 3, 12));
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setId(1);

		assertEquals(book.getTitle(), "Poezii");
		assertEquals(book.getGenre(), "poezie");
		assertEquals(book.getPublishDate(), LocalDate.of(1880, 3, 12));
		assertNotNull(book.getAuthor());
		assertEquals(book.getAuthor().getFirstName(), "Mihai");
		assertNotNull(book.getPublisher());
		assertEquals(book.getPublisher().getName(), "Teora");
		assertEquals(book.getId(), 1);

	}
}
