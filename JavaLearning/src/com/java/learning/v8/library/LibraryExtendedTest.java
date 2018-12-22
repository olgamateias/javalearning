package com.java.learning.v8.library;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class LibraryExtendedTest extends LibraryTestSupport {

	private ILibraryExtended library;

	@Override
	protected ILibrary getLibrary() {
		this.library = null; // new LibraryExtended();
		return this.library;
	}

	@Test
	void testGetBooksByAuthor() {
		Map<IAuthor, List<IBook>> booksByAuthor = this.library.getBooksByAuthor();

		assertFalse(booksByAuthor.isEmpty());
		assertEquals(4, booksByAuthor.size());
		booksByAuthor.forEach((auth, books) -> {
			assertFalse(books.isEmpty());
			books.forEach(buc -> assertEquals(auth, buc.getAuthor()));
		});
	}

	@Test
	void testGetBooksByPublisher() {
		Map<IPublisher, List<IBook>> booksByPublisher = this.library.getBooksByPublisher();

		assertFalse(booksByPublisher.isEmpty());
		assertEquals(3, booksByPublisher.size());
		booksByPublisher.forEach((pub, books) -> {
			assertFalse(books.isEmpty());
			books.forEach(buc -> assertEquals(pub, buc.getPublisher()));
		});
	}

	@Test
	void testGetAuthorsForPublisher() {
		Map<IPublisher, List<IAuthor>> authorsForPublisher = this.library.getAuthorsForPublisher();

		assertFalse(authorsForPublisher.isEmpty());
		assertEquals(3, authorsForPublisher.size());
		authorsForPublisher.forEach((pub, aut) -> {
			assertFalse(aut.isEmpty());
			assertTrue(this.library.getAuthorsThatPublishedHere(pub).containsAll(aut));
		});
	}

	@Test
	void testGetPublishersForAuthor() {
		Map<IAuthor, List<IPublisher>> publishersForAuthor = this.library.getPublishersForAuthor();

		assertFalse(publishersForAuthor.isEmpty());
		assertEquals(4, publishersForAuthor.size());
		publishersForAuthor.forEach((aut, pubs) -> {
			assertFalse(pubs.isEmpty());
			assertTrue(this.library.getPublishersWhereThisAuthorPublished(aut).containsAll(pubs));
		});
	}

}
