package com.java.learning.v8.library;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

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

		IBook bookIstoria = new Book();
		bookIstoria.setAuthor(authCioran);
		bookIstoria.setPublisher(pubEnigma);
		bookIstoria.setGenre("filisofie");
		bookIstoria.setTitle("Lacrimi si sfinti");
		bookIstoria.setPublishDate(LocalDate.of(1937, 4, 17));
		bookIstoria.setId(4);

		IBook bookPeCulmi = new Book();
		bookPeCulmi.setAuthor(authCioran);
		bookPeCulmi.setPublisher(pubTrei);
		bookIstoria.setGenre("filosofie");
		bookIstoria.setTitle("Pe culmile disperarii");
		bookIstoria.setPublishDate(LocalDate.of(1934, 6, 30));
		bookIstoria.setId(5);

		this.library.addBook(bookPeCulmi);
		this.library.addBook(bookIstoria);
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

	/*
	 * @Test public void testGetPublisherById() { IPublisher publisher =
	 * this.library.getPublisherById(1); assertNotNull(publisher); assertEquals(1,
	 * publisher.getId(), 1); assertEquals("Teora", publisher.getName());
	 * 
	 * publisher = this.library.getPublisherById(99); assertNull(publisher); }
	 * 
	 * @Test public void testValidateBook() { IAuthor invalidAuthor = createDummyValidAuthor();
	 * invalidAuthor.setFirstName(null); invalidAuthor.setLastName(null);
	 * 
	 * IPublisher invalidPublisher = createDumyValidPublisher(); invalidPublisher.setName(null);
	 * 
	 * IBook invalidBook1 = null; // new Book(); IBook invalidBook2 = createDummyValidBook();
	 * 
	 * invalidBook2.setAuthor(invalidAuthor); invalidBook2.setPublisher(invalidPublisher);
	 * 
	 * IBook invalidBook3 = createDummyValidBook(); invalidBook3.setTitle(null);
	 * 
	 * assertEquals(false, this.library.validateBook(invalidBook1)); assertEquals(false,
	 * this.library.validateBook(invalidBook2)); assertEquals(false,
	 * this.library.validateBook(invalidBook3)); }
	 * 
	 * @Test public void testAddBook() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testAddBooks() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetAllBooks() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetBooksByAuthor() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetBooksByPublisher() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetBooksByGenre() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetBooksPublishedInYear() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetBooksPublishedAfter() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetBooksPublishedBefore() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetBooksWhereTitleContainsKeyword() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetBooksWhereEverythingMightContainKeyword() {
	 * fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetAuthorsHavingFirstName() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetAuthorsHavingFirstAndLastName() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetAuthorsThatPublishedHere() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetAuthorsThatPublishedAfter() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetPublishersByName() { fail("Not yet implemented"); }
	 * 
	 * @Test public void testGetPublishersWhereThisAuthorPublished() { fail("Not yet implemented");
	 * }
	 */
	private IAuthor createDummyValidAuthor() {
		IAuthor author = null; // new Author();
		author.setFirstName("First");
		author.setLastName("Last");
		author.setBirthDate(LocalDate.of(2000, 1, 1));
		author.setDeathDate(LocalDate.of(2018, 12, 12));
		author.setId(100);

		return author;
	}

	private IPublisher createDumyValidPublisher() {
		IPublisher publisher = null; // new Publisher();
		publisher.setName("Publisher");
		publisher.setCity("City");
		publisher.setId(100);

		return publisher;
	}

	private IBook createDummyValidBook() {
		IBook book = null; // new Book();
		book.setAuthor(createDummyValidAuthor());
		book.setPublisher(createDumyValidPublisher());
		book.setGenre("genre");
		book.setPublishDate(LocalDate.of(2018, 1, 1));
		book.setTitle("Book");
		book.setId(100);

		return book;
	}
}
