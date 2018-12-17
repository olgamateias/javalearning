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

	@Override
	public boolean validatePublisher(IPublisher publisher) {
		return false;
	}

	@Override
	public boolean validateAuthor(IAuthor author) {
		return false;
	}

	@Override
	public boolean validateBook(IBook book) {
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
