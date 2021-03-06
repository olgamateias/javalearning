package com.java.learning.v08.library;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

public class LibraryTest extends LibraryTestSupport {

	private ILibrary library;

	@Override
	protected ILibrary getLibrary() {
		this.library = new Library();
		return this.library;
	}

	@Test
	public void testGetBookById() {
		assertBookExists(BOOK_ID_EMINESCU_POEZII);
		assertBookExists(BOOK_ID_CARAGIALE_SCRISOARE);
		assertBookExists(BOOK_ID_CARTARESCU_DE_CE);
		assertBookExists(BOOK_ID_CIORAN_LACRIMI);
		assertBookExists(BOOK_ID_CIORAN_PE_CULMI);

		IBook book = this.library.getBookById(99);
		assertNull(book);
	}

	@Test
	public void testGetAuthorById() {
		assertAuthorExists(AUTHOR_ID_EMINESCU);
		assertAuthorExists(AUTHOR_ID_CARAGIALE);
		assertAuthorExists(AUTHOR_ID_CARTARESCU);
		assertAuthorExists(AUTHOR_ID_CIORAN);

		IAuthor author = this.library.getAuthorById(99);
		assertNull(author);
	}

	@Test
	public void testGetPublisherById() {
		assertPublisherExists(PUBLISHER_ID_TEORA);
		assertPublisherExists(PUBLISHER_ID_TREI);
		assertPublisherExists(PUBLISHER_ID_ENIGMA);

		IPublisher publisher = this.library.getPublisherById(99);
		assertNull(publisher);
	}

	@Test
	public void testValidateBook() {
		IAuthor invalidAuthor = createDummyValidAuthor(100);
		invalidAuthor.setFirstName(null);
		invalidAuthor.setLastName(null);

		IPublisher invalidPublisher = createDumyValidPublisher(100);
		invalidPublisher.setName(null);

		IBook invalidBook1 = new Book();
		IBook invalidBook2 = createDummyValidBook(100);

		invalidBook2.setAuthor(invalidAuthor);
		invalidBook2.setPublisher(invalidPublisher);

		IBook invalidBook3 = createDummyValidBook(100);
		invalidBook3.setTitle(null);

		assertEquals(false, this.library.validateBook(invalidBook1));
		assertEquals(false, this.library.validateBook(invalidBook2));
		assertEquals(false, this.library.validateBook(invalidBook3));
	}

	@Test
	public void testAddBook() {
		IBook book1 = createDummyValidBook(100);

		// this should add the book together with its author and publisher
		this.library.addBook(book1);
		IBook theBook1 = this.library.getBookById(100);
		assertNotNull(theBook1);
		assertEquals(100, theBook1.getId());

		IPublisher thePublisher = this.library.getPublisherById(100);
		assertNotNull(thePublisher);
		assertEquals(100, thePublisher.getId());

		IAuthor theAuthor = this.library.getAuthorById(100);
		assertNotNull(theAuthor);
		assertEquals(100, theAuthor.getId());

		// add the same book, test that it is not duplicated
		IBook theSameBook = createDummyValidBook(100);
		this.library.addBook(theSameBook);
		List<IBook> allBooks = this.library.getAllBooks();
		assertEquals(1, allBooks.stream().filter(book -> book.getId() == 100).count());

		IBook invalidBook = createDummyValidBook(0);
		this.library.addBook(invalidBook);
		assertNull(this.library.getBookById(0));

		invalidBook = createDummyValidBook(101);
		invalidBook.setGenre(null);
		this.library.addBook(invalidBook);
		assertNull(this.library.getBookById(101));

		invalidBook = createDummyValidBook(102);
		invalidBook.setAuthor(null);
		this.library.addBook(invalidBook);
		assertNull(this.library.getBookById(102));

		invalidBook = createDummyValidBook(103);
		invalidBook.setPublisher(null);
		this.library.addBook(invalidBook);
		assertNull(this.library.getBookById(103));

		this.library.addBook(null);
	}

	@Test
	public void testAddBooks() {
		ILibrary libSpy = Mockito.spy(this.library);
		IBook book1 = createDummyValidBook(100);
		IBook book2 = createDummyValidBook(101);
		IBook book3 = createDummyValidBook(102);
		List<IBook> books = Arrays.asList(book1, book2, book3);
		libSpy.addBooks(books);

		assertNotNull(libSpy.getBookById(100));
		assertNotNull(libSpy.getBookById(101));
		assertNotNull(libSpy.getBookById(102));

		Mockito.verify(libSpy, VerificationModeFactory.times(3)).addBook(Mockito.any());
	}

	@Test
	public void testGetAllBooks() {
		List<IBook> allBooks = this.library.getAllBooks();
		assertEquals(5, allBooks.size());

		IBook invalidBook = createDummyValidBook(100);
		invalidBook.setAuthor(null);

		allBooks = this.library.getAllBooks();
		assertEquals(5, allBooks.size());
	}

	@Test
	public void testGetBooksByAuthor() {
		IAuthor eminescu = new BookAuthor();
		eminescu.setId(AUTHOR_ID_EMINESCU);
		List<IBook> booksByAuthor = this.library.getBooksByAuthor(eminescu);
		assertEquals(1, booksByAuthor.size());
		IBook poezii = booksByAuthor.get(0);
		assertNotNull(poezii);
		assertEquals(BOOK_ID_EMINESCU_POEZII, poezii.getId());
		assertEquals(eminescu, poezii.getAuthor());
		assertEquals("Poezii", poezii.getTitle());

		IAuthor dummyAuthor = createDummyValidAuthor(100);
		List<IBook> booksByAuthor2 = this.library.getBooksByAuthor(dummyAuthor);
		assertEquals(0, booksByAuthor2.size());
	}

	@Test
	public void testGetBooksByPublisher() {
		IPublisher pubEnigma = new Publisher();
		pubEnigma.setId(PUBLISHER_ID_ENIGMA);
		List<IBook> booksByPublisher = this.library.getBooksByPublisher(pubEnigma);
		assertEquals(2, booksByPublisher.size());
		IBook bookLacrimi = this.library.getBookById(BOOK_ID_CIORAN_LACRIMI);
		IBook bookDeCe = this.library.getBookById(BOOK_ID_CARTARESCU_DE_CE);

		assertTrue(booksByPublisher.contains(bookDeCe));
		assertTrue(booksByPublisher.contains(bookLacrimi));

		IPublisher dummyPublisher = createDumyValidPublisher(100);
		List<IBook> booksByPublisher2 = this.library.getBooksByPublisher(dummyPublisher);
		assertEquals(0, booksByPublisher2.size());
	}

	@Test

	public void testGetBooksByGenre() {
		List<IBook> booksByGenre = this.library.getBooksByGenre("filosof");
		assertEquals(0, booksByGenre.size());

		booksByGenre = this.library.getBooksByGenre("FILOSOFIE");
		assertEquals(2, booksByGenre.size());

		IBook bookLacrimi = this.library.getBookById(BOOK_ID_CIORAN_LACRIMI);
		IBook bookPeCulmi = this.library.getBookById(BOOK_ID_CIORAN_PE_CULMI);

		assertTrue(booksByGenre.contains(bookPeCulmi));
		assertTrue(booksByGenre.contains(bookLacrimi));
	}

	@Test

	public void testGetBooksPublishedInYear() {
		List<IBook> booksPublishedInYear = this.library.getBooksPublishedInYear(2004);
		assertEquals(2, booksPublishedInYear.size());

		IBook bookDeCe = this.library.getBookById(BOOK_ID_CARTARESCU_DE_CE);
		IBook bookLacrimi = this.library.getBookById(BOOK_ID_CIORAN_LACRIMI);

		assertTrue(booksPublishedInYear.contains(bookDeCe));
		assertTrue(booksPublishedInYear.contains(bookLacrimi));

		booksPublishedInYear = this.library.getBooksPublishedInYear(2005);
		assertEquals(0, booksPublishedInYear.size());
	}

	@Test
	public void testGetBooksPublishedAfter() {
		List<IBook> booksPublishedAfter = this.library.getBooksPublishedAfter(LocalDate.of(1900, 1, 1));
		assertEquals(4, booksPublishedAfter.size());

		IBook bookPoezii = this.library.getBookById(BOOK_ID_EMINESCU_POEZII);
		assertFalse(booksPublishedAfter.contains(bookPoezii));

		booksPublishedAfter = this.library.getBooksPublishedAfter(LocalDate.of(2018, 1, 1));
		assertEquals(0, booksPublishedAfter.size());
	}

	@Test
	public void testGetBooksPublishedBefore() {
		List<IBook> booksPublishedBefore = this.library.getBooksPublishedBefore(LocalDate.of(1900, 1, 1));
		assertEquals(1, booksPublishedBefore.size());

		IBook bookPoezii = this.library.getBookById(BOOK_ID_EMINESCU_POEZII);
		assertTrue(booksPublishedBefore.contains(bookPoezii));

		booksPublishedBefore = this.library.getBooksPublishedBefore(LocalDate.of(1800, 1, 1));
		assertEquals(0, booksPublishedBefore.size());
	}

	@Test
	public void testGetBooksWhereTitleContainsKeyword() {
		List<IBook> booksWhereTitleContainsKeyword = this.library.getBooksWhereTitleContainsKeyword("lacrim");
		assertEquals(1, booksWhereTitleContainsKeyword.size());

		IBook bookLacrimi = this.library.getBookById(BOOK_ID_CIORAN_LACRIMI);
		assertTrue(booksWhereTitleContainsKeyword.contains(bookLacrimi));

		booksWhereTitleContainsKeyword = this.library.getBooksWhereTitleContainsKeyword("Mihai");
		assertEquals(0, booksWhereTitleContainsKeyword.size());
	}

	@Test
	public void testGetBooksWhereEverythingMightContainKeyword() {
		List<IBook> booksWhereEverythingMightContainKeyword = this.library.getBooksWhereEverythingMightContainKeyword("Mihai");
		assertEquals(1, booksWhereEverythingMightContainKeyword.size());

		booksWhereEverythingMightContainKeyword = this.library.getBooksWhereEverythingMightContainKeyword("femei");
		assertEquals(1, booksWhereEverythingMightContainKeyword.size());

		booksWhereEverythingMightContainKeyword = this.library.getBooksWhereEverythingMightContainKeyword("Cioran");
		assertEquals(2, booksWhereEverythingMightContainKeyword.size());

		booksWhereEverythingMightContainKeyword = this.library.getBooksWhereEverythingMightContainKeyword("TREI");
		assertEquals(2, booksWhereEverythingMightContainKeyword.size());

		booksWhereEverythingMightContainKeyword = this.library.getBooksWhereEverythingMightContainKeyword("teatru");
		assertEquals(0, booksWhereEverythingMightContainKeyword.size());

	}

	@Test
	public void testGetAuthorsHavingFirstName() {
		List<IAuthor> authorsHavingFirstName = this.library.getAuthorsHavingFirstName("EmiL");
		assertEquals(1, authorsHavingFirstName.size());

		IAuthor authCioran = this.library.getAuthorById(AUTHOR_ID_CIORAN);
		assertTrue(authorsHavingFirstName.contains(authCioran));

		authorsHavingFirstName = this.library.getAuthorsHavingFirstName("Eminescu");
		assertEquals(0, authorsHavingFirstName.size());
	}

	@Test
	public void testGetAuthorsHavingFirstAndLastName() {
		List<IAuthor> authorsHavingFirstName = this.library.getAuthorsHavingFirstAndLastName("Emi", "Ci");
		assertEquals(1, authorsHavingFirstName.size());

		IAuthor authCioran = this.library.getAuthorById(AUTHOR_ID_CIORAN);
		assertTrue(authorsHavingFirstName.contains(authCioran));

		authorsHavingFirstName = this.library.getAuthorsHavingFirstAndLastName("Miha", "Sadoveanu");
		assertEquals(0, authorsHavingFirstName.size());

	}

	@Test
	public void testGetAuthorsThatPublishedHere() {
		IPublisher pubTrei = new Publisher();
		pubTrei.setId(PUBLISHER_ID_TREI);
		List<IAuthor> authorsThatPublishedHere = this.library.getAuthorsThatPublishedHere(pubTrei);

		assertEquals(2, authorsThatPublishedHere.size());

		IAuthor authCaragiale = this.library.getAuthorById(AUTHOR_ID_CARAGIALE);
		IAuthor authCioran = this.library.getAuthorById(AUTHOR_ID_CIORAN);

		assertTrue(authorsThatPublishedHere.contains(authCaragiale));
		assertTrue(authorsThatPublishedHere.contains(authCioran));

		IPublisher dummyPub = createDumyValidPublisher(100);
		authorsThatPublishedHere = this.library.getAuthorsThatPublishedHere(dummyPub);
		assertEquals(0, authorsThatPublishedHere.size());
	}

	@Test
	public void testGetAuthorsThatPublishedAfter() {
		List<IAuthor> authorsThatPublishedAfter = this.library.getAuthorsThatPublishedAfter(LocalDate.of(1934, 3, 1));
		assertEquals(2, authorsThatPublishedAfter.size());

		IAuthor authCartarescu = this.library.getAuthorById(AUTHOR_ID_CARTARESCU);
		IAuthor authCioran = this.library.getAuthorById(AUTHOR_ID_CIORAN);

		assertTrue(authorsThatPublishedAfter.contains(authCioran));
		assertTrue(authorsThatPublishedAfter.contains(authCartarescu));

		authorsThatPublishedAfter = this.library.getAuthorsThatPublishedAfter(LocalDate.of(2018, 1, 1));
		assertEquals(0, authorsThatPublishedAfter.size());
	}

	@Test
	public void testGetPublishersByName() {
		List<IPublisher> publishersByName = this.library.getPublishersByName("trei");
		assertEquals(1, publishersByName.size());

		IPublisher pubtrei = this.library.getPublisherById(PUBLISHER_ID_TREI);
		assertTrue(publishersByName.contains(pubtrei));

		publishersByName = this.library.getPublishersByName("teoria");
		assertEquals(0, publishersByName.size());
	}

	@Test
	public void testGetPublishersWhereThisAuthorPublished() {
		IAuthor authCioran = new BookAuthor();
		authCioran.setId(AUTHOR_ID_CIORAN);
		List<IPublisher> publishersWhereThisAuthorPublished = this.library.getPublishersWhereThisAuthorPublished(authCioran);
		assertEquals(2, publishersWhereThisAuthorPublished.size());

		IPublisher pubTrei = this.library.getPublisherById(PUBLISHER_ID_TREI);
		IPublisher pubEnigma = this.library.getPublisherById(PUBLISHER_ID_ENIGMA);

		assertTrue(publishersWhereThisAuthorPublished.contains(pubEnigma));
		assertTrue(publishersWhereThisAuthorPublished.contains(pubTrei));
	}

	private void assertBookExists(int bookId) {
		IBook book = this.library.getBookById(bookId);
		assertNotNull(book);
		assertEquals(bookId, book.getId());
	}

	private void assertAuthorExists(int authorId) {
		IAuthor author = this.library.getAuthorById(authorId);
		assertNotNull(author);
		assertEquals(authorId, author.getId());
	}

	private void assertPublisherExists(int pubId) {
		IPublisher publisher = this.library.getPublisherById(pubId);
		assertNotNull(publisher);
		assertEquals(pubId, publisher.getId());
	}

	private IAuthor createDummyValidAuthor(int id) {
		IAuthor author = new BookAuthor();
		author.setFirstName("First");
		author.setLastName("Last");
		author.setBirthDate(LocalDate.of(2000, 1, 1));
		author.setDeathDate(LocalDate.of(2018, 12, 12));
		author.setId(id);

		return author;
	}

	private IPublisher createDumyValidPublisher(int id) {
		IPublisher publisher = new Publisher();
		publisher.setName("Publisher");
		publisher.setCity("City");
		publisher.setId(id);

		return publisher;
	}

	private IBook createDummyValidBook(int id) {
		IBook book = new Book();
		book.setAuthor(createDummyValidAuthor(id));
		book.setPublisher(createDumyValidPublisher(id));
		book.setGenre("genre");
		book.setPublishDate(LocalDate.of(2018, 1, 1));
		book.setTitle("Book");
		book.setId(id);

		return book;
	}
}
