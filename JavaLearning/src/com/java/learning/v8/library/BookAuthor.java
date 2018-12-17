package com.java.learning.v8.library;

import java.time.LocalDate;

public class BookAuthor implements IAuthor {

	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private LocalDate deathDate;
	private int id;

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	@Override
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;

	}

	@Override
	public LocalDate getDeathDate() {
		return this.deathDate;
	}

	@Override
	public void setDeathDate(LocalDate deathDate) {
		this.deathDate = deathDate;

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
