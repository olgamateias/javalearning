package eLibrary;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BookReader {
	//primesti ca parametru path-ul de la un director si returnezi o lista de obiecte de tip Book(obiectul Book contine numele cartii si autorul).
	

//public void listFilesForFolder(final File folder) {
//    for (final File fileEntry : folder.listFiles()) {
//        if (fileEntry.isDirectory()) {
//            listFilesForFolder(fileEntry);
//        } else {
//            System.out.println(fileEntry.getName());
//        }
//    }
//}
	
	public List<Book> listFiles(String folderPath) {
		List<Book> allBooks = new ArrayList<>();
		File location = new File(folderPath);
		for(File fileEntry :location.listFiles()) {
			String authorFullName = fileEntry.getName().substring(0, fileEntry.getName().indexOf("-"));
			String bookName = fileEntry.getName().substring(fileEntry.getName().indexOf("-")+1, fileEntry.getName().indexOf("."));
			//System.out.println("author " + authorFullName + ", book " +bookName);
			Author author = new Author(authorFullName.substring(0, authorFullName.indexOf(" ")).trim(), authorFullName.substring(authorFullName.indexOf(" ")).trim());
			Book book = new Book(author, bookName.trim());
			allBooks.add(book);
		}
		return allBooks;
		}
	
}
