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
		// TODO Auto-generated method stub
		return this.title;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	@Override
	public IAuthor getAuthor() {
		// TODO Auto-generated method stub
		return this.author;
	}

	@Override
	public void setAuthor(IAuthor author) {
		// TODO Auto-generated method stub
		this.author = author;
	}

	@Override
	public LocalDate getPublishDate() {
		// TODO Auto-generated method stub
		return this.publishDate;
	}

	@Override
	public void setPublishDate(LocalDate publishDate) {
		// TODO Auto-generated method stub
		this.publishDate = publishDate;
	}

	@Override
	public IPublisher getPublisher() {
		// TODO Auto-generated method stub
		return this.publisher;
	}

	@Override
	public void setPublisher(IPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return this.genre;
	}

	@Override
	public void setGenre(String genre) {
		// TODO Auto-generated method stub
		this.genre = genre;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

}
