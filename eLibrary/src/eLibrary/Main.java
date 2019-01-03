package eLibrary;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		BookReader bookReader = new BookReader();
		BookDataProvider bookDataProvider = new BookDataProvider();
		
		List<Book> bookList = bookReader.listFiles("C:\\_stuff\\doc\\LITERATURA\\EBooks\\eLibrary");
		for(Book book : bookList) {
			System.out.println(book);
			bookDataProvider.scanBook(book);
		}
	}

}
