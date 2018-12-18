package com.java.learning.v8.library;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

public class LibraryTest {

	private ILibrary library = new Library();

	@Before
	public void setUp() throws Exception {
		IAuthor authEminescu = new BookAuthor();
		authEminescu.setFirstName("Mihai");
		authEminescu.setLastName("Eminescu");
		authEminescu.setBirthDate(LocalDate.of(1850, 1, 15));
		authEminescu.setDeathDate(LocalDate.of(1889, 6, 15));
		authEminescu.setId(1);

		IAuthor authCaragiale = new BookAuthor();
		authCaragiale.setFirstName("Ion Luca");
		authCaragiale.setLastName("Caragiale");
		authCaragiale.setBirthDate(LocalDate.of(1852, 2, 13));
		authCaragiale.setDeathDate(LocalDate.of(1912, 6, 9));
		authCaragiale.setId(2);

		IAuthor authCioran = new BookAuthor();
		authCioran.setFirstName("Emil");
		authCioran.setLastName("Cioran");
		authCioran.setBirthDate(LocalDate.of(1911, 4, 8));
		authCioran.setDeathDate(LocalDate.of(1995, 6, 20));
		authCioran.setId(3);

		IAuthor authCartarescu = new BookAuthor();
		authCartarescu.setFirstName("Mircea");
		authCartarescu.setLastName("Cartarescu");
		authCartarescu.setBirthDate(LocalDate.of(1956, 6, 1));
		authCartarescu.setId(4);

		IPublisher pubTeora = new Publisher();
		pubTeora.setName("Teora");
		pubTeora.setCity("Iasi");
		pubTeora.setId(1);

		IPublisher pubTrei = new Publisher();
		pubTrei.setName("Trei");
		pubTrei.setCity("Brasov");
		pubTrei.setId(2);

		IPublisher pubEnigma = new Publisher();
		pubEnigma.setName("Enigma");
		pubEnigma.setCity("Bucuresti");
		pubEnigma.setId(3);

		IBook bookPoezii = new Book();
		bookPoezii.setAuthor(authEminescu);
		bookPoezii.setPublisher(pubTeora);
		bookPoezii.setGenre("poezie");
		bookPoezii.setTitle("Poezii");
		bookPoezii.setPublishDate(LocalDate.of(1880, 3, 27));
		bookPoezii.setId(1);

		IBook bookScrisoarePierduta = new Book();
		bookScrisoarePierduta.setAuthor(authCaragiale);
		bookScrisoarePierduta.setPublisher(pubTrei);
		bookScrisoarePierduta.setGenre("teatru");
		bookScrisoarePierduta.setTitle("O scrisoare pierduta");
		bookScrisoarePierduta.setPublishDate(LocalDate.of(1900, 3, 13));
		bookScrisoarePierduta.setId(2);

		IBook bookDeCe = new Book();
		bookDeCe.setAuthor(authCartarescu);
		bookDeCe.setPublisher(pubEnigma);
		bookDeCe.setGenre("romantic");
		bookDeCe.setTitle("De ce iubum femeile");
		bookDeCe.setPublishDate(LocalDate.of(2004, 4, 21));
		bookDeCe.setId(3);

		IBook bookLacrimi = new Book();
		bookLacrimi.setAuthor(authCioran);
		bookLacrimi.setPublisher(pubEnigma);
		bookLacrimi.setGenre("filosofie");
		bookLacrimi.setTitle("Lacrimi si sfinti");
		bookLacrimi.setPublishDate(LocalDate.of(1937, 4, 17));
		bookLacrimi.setId(4);

		IBook bookPeCulmi = new Book();
		bookPeCulmi.setAuthor(authCioran);
		bookPeCulmi.setPublisher(pubTrei);
		bookPeCulmi.setGenre("filosofie");
		bookPeCulmi.setTitle("Pe culmile disperarii");
		bookPeCulmi.setPublishDate(LocalDate.of(1934, 6, 30));
		bookPeCulmi.setId(5);

		this.library.addBook(bookPeCulmi);
		this.library.addBook(bookLacrimi);
		this.library.addBook(bookDeCe);
		this.library.addBook(bookScrisoarePierduta);
		this.library.addBook(bookPoezii);

	}

	@Test
	public void testGetBookById() {
		IBook book = this.library.getBookById(1);
		assertNotNull(book);
		assertEquals("Poezii", book.getTitle());
		assertEquals(1, book.getId());

		book = this.library.getBookById(99);
		assertNull(book);
	}

	@Test
	public void testGetAuthorById() {
		IAuthor author = this.library.getAuthorById(1);
		assertNotNull(author);
		assertEquals(1, author.getId());
		assertEquals("Mihai", author.getFirstName());

		author = this.library.getAuthorById(99);
		assertNull(author);
	}

	@Test
	public void testGetPublisherById() {
		IPublisher publisher = this.library.getPublisherById(1);
		assertNotNull(publisher);
		assertEquals(1, publisher.getId(), 1);
		assertEquals("Teora", publisher.getName());

		publisher = this.library.getPublisherById(99);
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

		IBook theSameBook = createDummyValidBook(100);
		this.library.addBook(theSameBook);
		List<IBook> allBooks = this.library.getAllBooks();
		assertEquals(1, allBooks.stream().filter(book -> book.getId() == 100).count());

		IBook invalidBook = createDummyValidBook(0);
		this.library.addBook(invalidBook);

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
		Mockito.spy(this.library);
		IBook book1 = createDummyValidBook(100);
		IBook book2 = createDummyValidBook(101);
		IBook book3 = createDummyValidBook(102);
		List<IBook> books = Arrays.asList(book1, book2, book3);
		this.library.addBooks(books);

		assertNotNull(this.library.getBookById(100));
		assertNotNull(this.library.getBookById(101));
		assertNotNull(this.library.getBookById(102));

		Mockito.verify(this.library, VerificationModeFactory.times(3)).addBook(Mockito.any());
	}

	@Test
	@Ignore
	public void testGetAllBooks() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetBooksByAuthor() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetBooksByPublisher() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetBooksByGenre() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetBooksPublishedInYear() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetBooksPublishedAfter() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetBooksPublishedBefore() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetBooksWhereTitleContainsKeyword() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetBooksWhereEverythingMightContainKeyword() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetAuthorsHavingFirstName() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetAuthorsHavingFirstAndLastName() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetAuthorsThatPublishedHere() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetAuthorsThatPublishedAfter() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetPublishersByName() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testGetPublishersWhereThisAuthorPublished() {
		fail("Not yet implemented");
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
