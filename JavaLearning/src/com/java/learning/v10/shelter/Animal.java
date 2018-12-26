package com.java.learning.v10.shelter;

import java.time.LocalDate;

public abstract class Animal implements IAnimal {

	private LocalDate age;
	private String name;
	private String breed;
	private boolean adopted;

	@Override
	public LocalDate getAge() {
		return this.age;
	}

	@Override
	public void setAge(LocalDate age) {
		this.age = age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getBreed() {
		return this.breed;
	}

	@Override
	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public boolean isAdopted() {
		return this.adopted;
	}

	@Override
	public void setAdopted(boolean adopted) {
		this.adopted = adopted;
	}

	// Animal should be an abstract class that implements the IAnimal interface with all the getters
	// and setters
	// We need 2 additional classes called Cat and Dog that extend this abstract class

}
