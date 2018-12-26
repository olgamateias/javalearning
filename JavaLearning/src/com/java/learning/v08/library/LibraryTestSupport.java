package com.java.learning.v08.library;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;

public abstract class LibraryTestSupport {

	protected static final int AUTHOR_ID_EMINESCU = 1;
	protected static final int AUTHOR_ID_CARAGIALE = 2;
	protected static final int AUTHOR_ID_CIORAN = 3;
	protected static final int AUTHOR_ID_CARTARESCU = 4;

	protected static final int PUBLISHER_ID_TEORA = 1;
	protected static final int PUBLISHER_ID_TREI = 2;
	protected static final int PUBLISHER_ID_ENIGMA = 3;

	protected static final int BOOK_ID_EMINESCU_POEZII = 1;
	protected static final int BOOK_ID_CARAGIALE_SCRISOARE = 2;
	protected static final int BOOK_ID_CARTARESCU_DE_CE = 3;
	protected static final int BOOK_ID_CIORAN_LACRIMI = 4;
	protected static final int BOOK_ID_CIORAN_PE_CULMI = 5;

	@BeforeEach
	public void setUp() {
		IAuthor authEminescu = new BookAuthor();
		authEminescu.setFirstName("Mihai");
		authEminescu.setLastName("Eminescu");
		authEminescu.setBirthDate(LocalDate.of(1850, 1, 15));
		authEminescu.setDeathDate(LocalDate.of(1889, 6, 15));
		authEminescu.setId(AUTHOR_ID_EMINESCU);

		IAuthor authCaragiale = new BookAuthor();
		authCaragiale.setFirstName("Ion Luca");
		authCaragiale.setLastName("Caragiale");
		authCaragiale.setBirthDate(LocalDate.of(1852, 2, 13));
		authCaragiale.setDeathDate(LocalDate.of(1912, 6, 9));
		authCaragiale.setId(AUTHOR_ID_CARAGIALE);

		IAuthor authCioran = new BookAuthor();
		authCioran.setFirstName("Emil");
		authCioran.setLastName("Cioran");
		authCioran.setBirthDate(LocalDate.of(1911, 4, 8));
		authCioran.setDeathDate(LocalDate.of(1995, 6, 20));
		authCioran.setId(AUTHOR_ID_CIORAN);

		IAuthor authCartarescu = new BookAuthor();
		authCartarescu.setFirstName("Mircea");
		authCartarescu.setLastName("Cartarescu");
		authCartarescu.setBirthDate(LocalDate.of(1956, 6, 1));
		authCartarescu.setId(AUTHOR_ID_CARTARESCU);

		IPublisher pubTeora = new Publisher();
		pubTeora.setName("Teora");
		pubTeora.setCity("Iasi");
		pubTeora.setId(PUBLISHER_ID_TEORA);

		IPublisher pubTrei = new Publisher();
		pubTrei.setName("Trei");
		pubTrei.setCity("Brasov");
		pubTrei.setId(PUBLISHER_ID_TREI);

		IPublisher pubEnigma = new Publisher();
		pubEnigma.setName("Enigma");
		pubEnigma.setCity("Bucuresti");
		pubEnigma.setId(PUBLISHER_ID_ENIGMA);

		IBook bookPoezii = new Book();
		bookPoezii.setAuthor(authEminescu);
		bookPoezii.setPublisher(pubTeora);
		bookPoezii.setGenre("poezie");
		bookPoezii.setTitle("Poezii");
		bookPoezii.setPublishDate(LocalDate.of(1880, 3, 27));
		bookPoezii.setId(BOOK_ID_EMINESCU_POEZII);

		IBook bookScrisoarePierduta = new Book();
		bookScrisoarePierduta.setAuthor(authCaragiale);
		bookScrisoarePierduta.setPublisher(pubTrei);
		bookScrisoarePierduta.setGenre("teatru");
		bookScrisoarePierduta.setTitle("O scrisoare pierduta");
		bookScrisoarePierduta.setPublishDate(LocalDate.of(1900, 3, 13));
		bookScrisoarePierduta.setId(BOOK_ID_CARAGIALE_SCRISOARE);

		IBook bookDeCe = new Book();
		bookDeCe.setAuthor(authCartarescu);
		bookDeCe.setPublisher(pubEnigma);
		bookDeCe.setGenre("romantic");
		bookDeCe.setTitle("De ce iubim femeile");
		bookDeCe.setPublishDate(LocalDate.of(2004, 4, 21));
		bookDeCe.setId(BOOK_ID_CARTARESCU_DE_CE);

		IBook bookLacrimi = new Book();
		bookLacrimi.setAuthor(authCioran);
		bookLacrimi.setPublisher(pubEnigma);
		bookLacrimi.setGenre("filosofie");
		bookLacrimi.setTitle("Lacrimi si sfinti");
		bookLacrimi.setPublishDate(LocalDate.of(2004, 4, 17));
		bookLacrimi.setId(BOOK_ID_CIORAN_LACRIMI);

		IBook bookPeCulmi = new Book();
		bookPeCulmi.setAuthor(authCioran);
		bookPeCulmi.setPublisher(pubTrei);
		bookPeCulmi.setGenre("filosofie");
		bookPeCulmi.setTitle("Pe culmile disperarii");
		bookPeCulmi.setPublishDate(LocalDate.of(1934, 6, 30));
		bookPeCulmi.setId(BOOK_ID_CIORAN_PE_CULMI);

		ILibrary library = getLibrary();
		library.addBook(bookPeCulmi);
		library.addBook(bookLacrimi);
		library.addBook(bookDeCe);
		library.addBook(bookScrisoarePierduta);
		library.addBook(bookPoezii);

	}

	protected abstract ILibrary getLibrary();
}
