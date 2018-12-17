package com.java.learning.v8.library;

import java.time.LocalDate;

public class Book implements IBook {
	private String title;
	private IAuthor author;
	private LocalDate publishDate;
	private IPublisher publisher;
	private String genre;
	private int id;

	@Override
	public String getTitle() {

		return this.title;
	}

	@Override
	public void setTitle(String title) {

		this.title = title;
	}

	@Override
	public IAuthor getAuthor() {
		return this.author;
	}

	@Override
	public void setAuthor(IAuthor author) {
		this.author = author;
	}

	@Override
	public LocalDate getPublishDate() {
		return this.publishDate;
	}

	@Override
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public IPublisher getPublisher() {
		return this.publisher;
	}

	@Override
	public void setPublisher(IPublisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String getGenre() {
		return this.genre;
	}

	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

}
