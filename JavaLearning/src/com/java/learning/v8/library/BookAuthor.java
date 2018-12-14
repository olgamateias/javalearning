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
		// TODO Auto-generated method stub
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}

	@Override
	public LocalDate getBirthDate() {
		// TODO Auto-generated method stub
		return this.birthDate;
	}

	@Override
	public void setBirthDate(LocalDate birthDate) {
		// TODO Auto-generated method stub
		this.birthDate = birthDate;

	}

	@Override
	public LocalDate getDeathDate() {
		// TODO Auto-generated method stub
		return this.deathDate;
	}

	@Override
	public void setDeathDate(LocalDate deathDate) {
		// TODO Auto-generated method stub
		this.deathDate = deathDate;

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
