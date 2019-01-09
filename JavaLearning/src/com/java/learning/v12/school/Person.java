package com.java.learning.v12.school;

import java.time.LocalDate;

public abstract class Person implements IPerson {
	private String firstName;
	private String lastName;
	private String sex;
	private LocalDate birthDate;

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
	public String getSex() {
		return this.sex;
	}

	@Override
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	@Override
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
