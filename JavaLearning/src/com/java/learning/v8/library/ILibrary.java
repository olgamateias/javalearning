package com.java.learning.v8.library;

import java.time.LocalDate;
import java.util.List;

public interface ILibrary {

//	List<IBook> booksDatabase = new ArrayList<>();
//	List<IAuthor> authorsDatabase = new ArrayList<>();
//	List<IPublisher> publishersDatabase = new ArrayList<>();

	public IBook getBookById(int bookId);

	public IAuthor getAuthorById(int authorId);

	public IPublisher getPublisherById(int publisherId);

	public boolean validateBook(IBook book);

	public void addBook(IBook book);

	public void addBooks(List<IBook> books);

	public List<IBook> getAllBooks();

	public List<IBook> getBooksByAuthor(IAuthor author);

	public List<IBook> getBooksByPublisher(IPublisher publisher);

	public List<IBook> getBooksByGenre(String genre);

	public List<IBook> getBooksPublishedInYear(int year);

	public List<IBook> getBooksPublishedAfter(LocalDate date);

	public List<IBook> getBooksPublishedBefore(LocalDate date);

	public List<IBook> getBooksWhereTitleContainsKeyword(String keyword);

	public List<IBook> getBooksWhereEverythingMightContainKeyword(String keyword);

	public List<IAuthor> getAuthorsHavingFirstName(String firstName);

	public List<IAuthor> getAuthorsHavingFirstAndLastName(String firstName, String lastName);

	public List<IAuthor> getAuthorsThatPublishedHere(IPublisher publisher);

	public List<IAuthor> getAuthorsThatPublishedAfter(LocalDate date);

	public List<IPublisher> getPublishersByName(String name);

	public List<IPublisher> getPublishersWhereThisAuthorPublished(IAuthor author);
}
