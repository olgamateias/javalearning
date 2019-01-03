package eLibrary;

import java.util.ArrayList;
import java.util.List;

public class BookData {
	private double rating;
	private String summary;
	private List<String> genre = new ArrayList<>();
	private Book book;
	
	public BookData(Book book) {
		this.book = book;
	}
	public Book getBook() {
		return book;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public List<String> getGenre() {
		return genre;
	}
	public void addGenre(List<String> genre) {
		this.genre.addAll(genre);
	}

}
