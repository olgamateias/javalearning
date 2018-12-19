package com.java.learning.v8.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library implements ILibrary {

	private List<IBook> booksDatabase = new ArrayList<>();
	private List<IAuthor> authorsDatabase = new ArrayList<>();
	private List<IPublisher> publishersDatabase = new ArrayList<>();

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
		if (publisher == null) {
			return false;
		}
//		try {
//			publisher.getCity().equals(null);
//			publisher.getName().equals(null);
//		} catch (Exception e) {
//			System.out.println("Publisher's city or name is null");
//			return false;
//		}

		// first check the null and after that if isEmpty or == 0
		if (publisher.getCity() == null || publisher.getName() == null || publisher.getCity().isEmpty() || publisher.getName().isEmpty() || publisher.getId() == 0) {
			System.out.println("Invalid publisher. Something is null, empty or equal to 0");
			return false;
		}
		System.out.println("Valid publisher.");
		return true;
	}

	@Override
	public boolean validateAuthor(IAuthor author) {
		if (author == null) {
			return false;
		}
//		try {
//			author.getFirstName().equals(null);
//			author.getLastName().equals(null);
//		} catch (Exception e) {
//			System.out.println("Author's first name & last name is null");
//			return false;
//		}

		// first check the null and after that if isEmpty or == 0
		if (author.getFirstName() == null || author.getLastName() == null || author.getFirstName().isEmpty() || author.getLastName().isEmpty() || author.getId() == 0) {
			System.out.println("Invalid author. Something is null, empty or equal to 0");
			return false;
		}
		System.out.println("Valid author.");
		return true;
	}

	@Override
	public boolean validateBook(IBook book) {
		if (book == null) {
			return false;
		}

		// first check the null and after that if isEmpty or == 0
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

	/**
	 * Add a book to the booksDatabase. If a book is not valid then it will not be added to the
	 * booksDatabase. If the book is valid and the book's publisher does not exist yet in the
	 * publishersDatabase then it needs to be added. If the book is valid and the book's author does
	 * not exist yet in the authorsDatabase then it needs to be added.
	 * 
	 */
	@Override
	public void addBook(IBook book) {

		if (validateBook(book)) {
			if (!this.publishersDatabase.contains(book.getPublisher())) {
				this.publishersDatabase.add(book.getPublisher());
			}
			if (!this.authorsDatabase.contains(book.getAuthor())) {
				this.authorsDatabase.add(book.getAuthor());
			}
			if (!this.booksDatabase.contains(book)) {
				this.booksDatabase.add(book);
			}

		} else {
			System.out.println("The book is not a valid book. Therefore it wasn't added in the list");
		}

	}

	/**
	 * Add more books to the booksDatabase. If a book is not valid then it will not be added to the
	 * booksDatabase. If the book is valid and the book's publisher does not exist yet in the
	 * publishersDatabase then it needs to be added. If the book is valid and the book's author does
	 * not exist yet in the authorsDatabase then it needs to be added.
	 */
	@Override
	public void addBooks(List<IBook> books) {

		for (IBook book : books) {
			addBook(book);
		}
	}

	@Override
	public List<IBook> getAllBooks() {
		List<IBook> allBooks = new ArrayList<IBook>(this.booksDatabase);

		return allBooks;
	}

	@Override
	public List<IBook> getBooksByAuthor(IAuthor author) {
		List<IBook> allBooks = new ArrayList<IBook>();

		for (IBook book : this.booksDatabase) {
			if (book.getAuthor().equals(author)) { // getId() == author.getId()) {
				allBooks.add(book);
			}
		}
		return allBooks;
	}

	@Override
	public List<IBook> getBooksByPublisher(IPublisher publisher) {
		List<IBook> allBooks = new ArrayList<IBook>();
		for (IBook book : this.booksDatabase) {
			if (book.getPublisher().equals(publisher)) { // .getId() == publisher.getId()) {
				allBooks.add(book);
			}
		}
		return allBooks;
	}

	@Override
	public List<IBook> getBooksByGenre(String genre) {
		List<IBook> allBooks = new ArrayList<IBook>();
		for (IBook book : this.booksDatabase) {
			if (book.getGenre().equalsIgnoreCase(genre)) {
				allBooks.add(book);
			}
		}
		return allBooks;
	}

	@Override
	public List<IBook> getBooksPublishedInYear(int year) {
		List<IBook> allBooks = new ArrayList<IBook>();
		for (IBook book : this.booksDatabase) {
			if (book.getPublishDate().getYear() == year) {
				allBooks.add(book);
			}
		}
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
