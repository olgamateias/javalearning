package com.java.learning.v8.library;

import static org.junit.Assert.fail;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

	private ILibrary library;

	@Before
	public void setUp() throws Exception {
		IAuthor authEminescu = null;// new Author();
		authEminescu.setLastName("Mihai");
		authEminescu.setLastName("Eminescu");
		authEminescu.setBirthDate(LocalDate.of(1850, 1, 15));
		authEminescu.setDeathDate(LocalDate.of(1889, 6, 15));
		authEminescu.setId(1);

		IAuthor authCaragiale = null; // new Author();
		authCaragiale.setFirstName("Ion Luca");
		authCaragiale.setLastName("Caragiale");
		authCaragiale.setBirthDate(LocalDate.of(0, 0, 0));
		authCaragiale.setDeathDate(LocalDate.of(0, 0, 0));
		authCaragiale.setId(2);

		IAuthor authCioran = null; // new Author();
		authCioran.setFirstName("Emil");
		authCioran.setLastName("Cioran");
		authCioran.setBirthDate(LocalDate.of(0, 0, 0));
		authCioran.setDeathDate(LocalDate.of(0, 0, 0));
		authCioran.setId(3);

		IAuthor authCartarescu = null; // new Author();
		authCartarescu.setFirstName("Mircea");
		authCartarescu.setLastName("Cartarescu");
		authCartarescu.setBirthDate(LocalDate.of(0, 0, 0));
		authCartarescu.setId(4);

		IPublisher pubTeora = null; // new Publisher();
		pubTeora.setName("Teora");
		pubTeora.setCity("Iasi");
		pubTeora.setId(1);

		IPublisher pubTrei = null; // new Publisher();
		pubTrei.setName("Trei");
		pubTrei.setCity("Brasov");
		pubTrei.setId(2);

		IPublisher pubEnigma = null; // new Publisher();
		pubEnigma.setName("Enigma");
		pubEnigma.setCity("Bucuresti");
		pubEnigma.setId(3);

		IBook bookPoezii = null; // new Book();
		bookPoezii.setAuthor(authEminescu);
		bookPoezii.setPublisher(pubTeora);
		bookPoezii.setGenre("poezie");
		bookPoezii.setTitle("Poezii");
		bookPoezii.setPublishDate(LocalDate.of(0, 0, 0));
		bookPoezii.setId(1);

		IBook bookScrisoarePierduta = null; // new Book();
		bookScrisoarePierduta.setAuthor(authCaragiale);
		bookScrisoarePierduta.setPublisher(pubTrei);
		bookScrisoarePierduta.setGenre("teatru");
		bookScrisoarePierduta.setTitle("O scrisoare pierduta");
		bookScrisoarePierduta.setPublishDate(LocalDate.of(0, 0, 0));
		bookScrisoarePierduta.setId(2);

		IBook bookDeCe = null; // new Book();
		bookDeCe.setAuthor(authCartarescu);
		bookDeCe.setPublisher(pubEnigma);
		bookDeCe.setGenre("romantic");
		bookDeCe.setTitle("De ce iubum femeile");
		bookDeCe.setPublishDate(LocalDate.of(2004, 4, 21));
		bookDeCe.setId(3);

		IBook bookIstoria = null; // new Book();
		bookIstoria.setAuthor(authCioran);
		bookIstoria.setPublisher(pubEnigma);
		bookIstoria.setGenre("filisofie");
		bookIstoria.setTitle("Lacrimi si sfinti");
		bookIstoria.setPublishDate(LocalDate.of(1937, 4, 17));
		bookIstoria.setId(4);

		IBook bookPeCulmi = null; // new Book();
		bookPeCulmi.setAuthor(authCioran);
		bookPeCulmi.setPublisher(pubTrei);
		bookIstoria.setGenre("filosofie");
		bookIstoria.setTitle("Pe culmile disperarii");
		bookIstoria.setPublishDate(LocalDate.of(1934, 6, 30));
		bookIstoria.setId(5);

	}

	@Test
	public void testGetBookById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAuthorById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPublisherById() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddBooks() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllBooks() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksByAuthor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksByPublisher() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksByGenre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksPublishedInYear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksPublishedAfter() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksPublishedBefore() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksWhereTitleContainsKeyword() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBooksWhereEverythingMightContainKeyword() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAuthorsHavingFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAuthorsHavingFirstAndLastName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAuthorsThatPublishedHere() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAuthorsThatPublishedAfter() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPublishersByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPublishersWhereThisAuthorPublished() {
		fail("Not yet implemented");
	}

}
