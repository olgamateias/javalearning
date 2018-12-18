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

	/**
	 * Validate that all fields are set
	 */
	public boolean validatePublisher(IPublisher publisher);

	/**
	 * Validate that all fields are set. deathDate can be null
	 */
	public boolean validateAuthor(IAuthor author);

	/**
	 * Validate that all fields are set. Author and Publisher are validated by calling the methods
	 * that validate them.
	 */
	public boolean validateBook(IBook book);

	/**
	 * Add a book to the booksDatabase. If a book is not valid then it will not be added to the
	 * booksDatabase. If the book is valid and the book's publisher does not exist yet in the
	 * publishersDatabase then it needs to be added. If the book is valid and the book's author does
	 * not exist yet in the authorsDatabase then it needs to be added.
	 * 
	 */
	public void addBook(IBook book);

	/**
	 * Add more books to the booksDatabase. If a book is not valid then it will not be added to the
	 * booksDatabase. If the book is valid and the book's publisher does not exist yet in the
	 * publishersDatabase then it needs to be added. If the book is valid and the book's author does
	 * not exist yet in the authorsDatabase then it needs to be added.
	 */
	public void addBooks(List<IBook> books);

	public List<IBook> getAllBooks();

	/**
	 * An author is uniquely identified by the id
	 */
	public List<IBook> getBooksByAuthor(IAuthor author);

	/**
	 * A publisher is uniquely identified by the id
	 */
	public List<IBook> getBooksByPublisher(IPublisher publisher);

	/**
	 * Get all the books for this genre. The genre must match exactly (ignoring case)
	 */
	public List<IBook> getBooksByGenre(String genre);

	public List<IBook> getBooksPublishedInYear(int year);

	public List<IBook> getBooksPublishedAfter(LocalDate date);

	public List<IBook> getBooksPublishedBefore(LocalDate date);

	/**
	 * Get all the books whose title contain the keyword (ignoring case)
	 */
	public List<IBook> getBooksWhereTitleContainsKeyword(String keyword);

	/**
	 * Get all the books that match the keyword (contains, ignore case). The keyword must be matched
	 * in at least one of the following properties: book title, author first name, author last name,
	 * publisher name
	 */
	public List<IBook> getBooksWhereEverythingMightContainKeyword(String keyword);

	/**
	 * Get authors whose first name contains the text parameter (ignoring case)
	 */
	public List<IAuthor> getAuthorsHavingFirstName(String firstName);

	/**
	 * Get authors whose first name and last name contains the text parameters (ignoring case).
	 */
	public List<IAuthor> getAuthorsHavingFirstAndLastName(String firstName, String lastName);

	/**
	 * Get the authors whose books have been published at this publisher. The publisher is uniquely
	 * identified by its id.
	 */
	public List<IAuthor> getAuthorsThatPublishedHere(IPublisher publisher);

	/**
	 * Get the authors whose books have been published after this date
	 */
	public List<IAuthor> getAuthorsThatPublishedAfter(LocalDate date);

	/**
	 * Publisher name must contain the text (ignoring case)
	 */
	public List<IPublisher> getPublishersByName(String name);

	/**
	 * Get all the publishers where this author published books
	 */
	public List<IPublisher> getPublishersWhereThisAuthorPublished(IAuthor author);
}
