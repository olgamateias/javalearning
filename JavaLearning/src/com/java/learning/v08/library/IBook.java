package com.java.learning.v08.library;

import java.time.LocalDate;

public interface IBook {

//	String title
//	IAuthor author
//	LocalDate publishDate;
//	IPublisher publisher;
//	String genre

	public String getTitle();

	public void setTitle(String title);

	public IAuthor getAuthor();

	public void setAuthor(IAuthor author);

	public LocalDate getPublishDate();

	public void setPublishDate(LocalDate publishDate);

	public IPublisher getPublisher();

	public void setPublisher(IPublisher publisher);

	public String getGenre();

	public void setGenre(String genre);

	public int getId();

	public void setId(int id);

}
