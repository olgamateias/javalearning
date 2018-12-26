package com.java.learning.v08.library;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookAuthor other = (BookAuthor) obj;
		if (this.id != other.id)
			return false;
		return true;
	}

}
