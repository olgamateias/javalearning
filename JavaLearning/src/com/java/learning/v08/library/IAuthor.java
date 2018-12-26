package com.java.learning.v08.library;

import java.time.LocalDate;

public interface IAuthor {

//	String firstName
//	String lastName
//	LocalDate birthDate
//	LocalDate deathDate -> can be null if the author is still alive

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public LocalDate getBirthDate();

	public void setBirthDate(LocalDate birthDate);

	public LocalDate getDeathDate();

	public void setDeathDate(LocalDate deathDate);

	public int getId();

	public void setId(int id);

}
