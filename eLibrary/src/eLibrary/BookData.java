package eLibrary;

import java.util.ArrayList;
import java.util.List;

public class BookData {
	private Double rating;
	private String summary;
	private List<String> genre = new ArrayList<>();
	private Book book;
	
	public BookData(Book book) {
		this.book = book;
	}
	public Book getBook() {
		return book;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
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
	@Override
	public String toString() {
		return book + " - " + rating;
	}
}
