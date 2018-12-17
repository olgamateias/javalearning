package com.java.learning.v8.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library implements ILibrary {

	public List<IBook> booksDatabase = new ArrayList<>();
	public List<IAuthor> authorsDatabase = new ArrayList<>();
	public List<IPublisher> publishersDatabase = new ArrayList<>();

	@Override
	public IBook getBookById(int bookId) {
		if (bookId <= 0) {
			return null;
		}

		for (IBook book : this.booksDatabase) {
			if (bookId == book.getId()) {
				System.out.println("book " + book.getTitle());
				return book;
			}
		}

		return null;
	}

	@Override
	public IAuthor getAuthorById(int authorId) {
		if (authorId <= 0) {
			return null;
		}
		for (IAuthor author : this.authorsDatabase) {
			if (authorId == author.getId()) {
				System.out.println("author " + author.getFirstName() + " " + author.getLastName());
				return author;
			}

		}
		return null;
	}

	@Override
	public IPublisher getPublisherById(int publisherId) {
		if (publisherId <= 0) {
			return null;
		}
		for (IPublisher publisher : this.publishersDatabase) {
			if (publisherId == publisher.getId()) {
				System.out.println("Publisher " + publisher.getName());
				return publisher;
			}
		}
		return null;
	}

	/**
	 * Validate that all fields are set
	 */
	@Override
	public boolean validatePublisher(IPublisher publisher) {
//		try {
//			publisher.getCity().equals(null);
//			publisher.getName().equals(null);
//		} catch (Exception e) {
//			System.out.println("Publisher's city or name is null");
//			return false;
//		}
		if (publisher.getCity() == null || publisher.getName() == null || publisher.getCity().isEmpty() || publisher.getName().isEmpty() || publisher.getId() == 0) {
			System.out.println("Invalid publisher. Something is null, empty or equal to 0");
			return false;
		}
		System.out.println("Valid publisher.");
		return true;
	}

	@Override
	public boolean validateAuthor(IAuthor author) {
//		try {
//			author.getFirstName().equals(null);
//			author.getLastName().equals(null);
//		} catch (Exception e) {
//			System.out.println("Author's first name & last name is null");
//			return false;
//		}
		if (author.getFirstName() == null || author.getLastName() == null || author.getFirstName().isEmpty() || author.getLastName().isEmpty() || author.getId() == 0) {
			System.out.println("Invalid author. Something is null, empty or equal to 0");
			return false;
		}
		System.out.println("Valid author.");
		return true;
	}

	@Override
	public boolean validateBook(IBook book) {
//		if(book == null) {
//			return false;
//		}
//		try {
//			book.getTitle().equals(null);
//		} catch (Exception e) {
//			System.out.println("Book's title is null");
//			return false;
//		}
		if (book.getGenre() == null || book.getTitle() == null || book.getId() == 0 || book.getTitle().isEmpty() || book.getGenre().isEmpty()) {
			System.out.println("Invalid book. Something is null, empty or equal to 0");
			return false;
		} else if (validateAuthor(book.getAuthor()) && validatePublisher(book.getPublisher())) {
			System.out.println("Valid book.");
			return true;
		}
		// System.out.println("Invalid book.");
		return false;
	}

	@Override
	public void addBook(IBook book) {
		this.booksDatabase.add(book);
		this.authorsDatabase.add(book.getAuthor());
		this.publishersDatabase.add(book.getPublisher());
	}

	@Override
	public void addBooks(List<IBook> books) {
	}

	@Override
	public List<IBook> getAllBooks() {
		List<IBook> allBooks = new ArrayList<IBook>();
		return allBooks;
	}

	@Override
	public List<IBook> getBooksByAuthor(IAuthor author) {
		List<IBook> allBooks = new ArrayList<IBook>();
		return allBooks;
	}

	@Override
	public List<IBook> getBooksByPublisher(IPublisher publisher) {
		List<IBook> allBooks = new ArrayList<IBook>();
		return allBooks;
	}

	@Override
	public List<IBook> getBooksByGenre(String genre) {
		List<IBook> allBooks = new ArrayList<IBook>();
		return allBooks;
	}

	@Override
	public List<IBook> getBooksPublishedInYear(int year) {
		List<IBook> allBooks = new ArrayList<IBook>();
		return allBooks;
	}

	@Override
	public List<IBook> getBooksPublishedAfter(LocalDate date) {
		return null;
	}

	@Override
	public List<IBook> getBooksPublishedBefore(LocalDate date) {
		return null;
	}

	@Override
	public List<IBook> getBooksWhereTitleContainsKeyword(String keyword) {
		return null;
	}

	@Override
	public List<IBook> getBooksWhereEverythingMightContainKeyword(String keyword) {
		return null;
	}

	@Override
	public List<IAuthor> getAuthorsHavingFirstName(String firstName) {
		return null;
	}

	@Override
	public List<IAuthor> getAuthorsHavingFirstAndLastName(String firstName, String lastName) {
		return null;
	}

	@Override
	public List<IAuthor> getAuthorsThatPublishedHere(IPublisher publisher) {
		return null;
	}

	@Override
	public List<IAuthor> getAuthorsThatPublishedAfter(LocalDate date) {
		return null;
	}

	@Override
	public List<IPublisher> getPublishersByName(String name) {
		return null;
	}

	@Override
	public List<IPublisher> getPublishersWhereThisAuthorPublished(IAuthor author) {
		return null;
	}

}