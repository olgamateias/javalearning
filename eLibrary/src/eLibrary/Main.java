package eLibrary;

import java.io.File;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BookReader bookReader = new BookReader();
		BookDataProvider bookDataProvider = new BookDataProvider();
		
		List<Book> bookList = bookReader.listFiles
				//("C:\\_stuff\\doc\\LITERATURA\\Debug");
				("C:\\_stuff\\doc\\LITERATURA\\EBooks\\eLibrary");
		for(Book book : bookList) {
//			System.out.println(book);
			BookData bookData = bookDataProvider.scanBook(book);
			System.out.println(bookData);
			if(bookData.getRating() != null) {
				moveFile(book.getFile());
			}
		}
	}
	
	private static void moveFile(File file) {
		file.renameTo(new File("C:\\_stuff\\doc\\LITERATURA\\EBooks\\eLibrary\\Valid\\"+file.getName()));
	}

}
