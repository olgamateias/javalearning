package com.java.learning.v10.shelter;

import java.time.LocalDate;

public interface IAnimal {

	void setAdopted(boolean adopted);

	boolean isAdopted();

	void setBreed(String breed);

	String getBreed();

	void setName(String name);

	String getName();

	void setAge(LocalDate age);

	LocalDate getAge();

	void speak();

}
