package eLibrary;

import java.io.File;

public class Book {
	private String title;
	private Author author;
	private File file;
	
	
	public Book(Author author, String title, File file) {
		this.author = author;
		this.title = title;
		this.file = file;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
	public File getFile() {
		return file;
	}
	@Override
	public String toString() {
		return author + " - " + title;
	}
	

}
