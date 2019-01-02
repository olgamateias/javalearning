package eLibrary;

public class Book {
	private String title;
	private Author author;
	
	public Book(Author author, String title) {
		this.author = author;
		this.title = title;
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
	
	@Override
	public String toString() {
		return author + " - " + title;
	}
	

}
