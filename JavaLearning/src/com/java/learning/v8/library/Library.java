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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAuthor getAuthorById(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPublisher getPublisherById(int publisherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateBook(IBook book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addBook(IBook book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBooks(List<IBook> books) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<IBook> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> getBooksByAuthor(IAuthor author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> getBooksByPublisher(IPublisher publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> getBooksByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> getBooksPublishedInYear(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> getBooksPublishedAfter(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> getBooksPublishedBefore(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> getBooksWhereTitleContainsKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IBook> getBooksWhereEverythingMightContainKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IAuthor> getAuthorsHavingFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IAuthor> getAuthorsHavingFirstAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IAuthor> getAuthorsThatPublishedHere(IPublisher publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IAuthor> getAuthorsThatPublishedAfter(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IPublisher> getPublishersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IPublisher> getPublishersWhereThisAuthorPublished(IAuthor author) {
		// TODO Auto-generated method stub
		return null;
	}

}
