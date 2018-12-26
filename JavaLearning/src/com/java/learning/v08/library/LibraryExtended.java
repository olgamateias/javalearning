package com.java.learning.v08.library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryExtended extends Library implements ILibraryExtended {

	@Override
	public Map<IAuthor, List<IBook>> getBooksByAuthor() {
		Map<IAuthor, List<IBook>> booksByAuthor = new HashMap<IAuthor, List<IBook>>();
		for (IBook book : this.booksDatabase) {
			booksByAuthor.put(book.getAuthor(), getBooksByAuthor(book.getAuthor()));
		}
		// System.out.println("Map of books " + booksByAuthor);
		return booksByAuthor;
	}

	@Override
	public Map<IPublisher, List<IBook>> getBooksByPublisher() {
		Map<IPublisher, List<IBook>> booksByPub = new HashMap<IPublisher, List<IBook>>();
		for (IBook book : this.booksDatabase) {
			booksByPub.put(book.getPublisher(), getBooksByPublisher(book.getPublisher()));
		}
		return booksByPub;
	}

	// all authors that published at this Publisher
	@Override
	public Map<IPublisher, List<IAuthor>> getAuthorsForPublisher() {
		Map<IPublisher, List<IAuthor>> authorsForPublisher = new HashMap<>();
		for (IBook book : this.booksDatabase) {
			authorsForPublisher.put(book.getPublisher(), getAuthorsThatPublishedHere(book.getPublisher()));
		}
		return authorsForPublisher;
	}

	// all authors that published at this Publisher
	@Override
	public Map<IAuthor, List<IPublisher>> getPublishersForAuthor() {
		Map<IAuthor, List<IPublisher>> pubForAuthors = new HashMap<>();
		for (IBook book : this.booksDatabase) {
			pubForAuthors.put(book.getAuthor(), getPublishersWhereThisAuthorPublished(book.getAuthor()));
		}
		return pubForAuthors;
	}

}
