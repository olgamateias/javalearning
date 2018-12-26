package com.java.learning.v10.shelter;

import java.util.List;

public interface IShelter {

//	Shelter will have two lists, one for cats and one for dogs

	public void fosterCat(Cat cat);

	public void fosterDog(Dog dog);

	public List<Cat> getAllCats(boolean includeAdopted);

	public List<Dog> getAllDogs(boolean includeAdopted);

	/**
	 * Return a list containing all the cats and dogs
	 */
	public List<IAnimal> getAllAnimals(boolean includeAdopted);

	/**
	 * Get the oldest cat, mark it as adopted and return the cat
	 */
	public Cat adoptCat();

	/**
	 * Get the cat matching the name (exactly, case sensitive), mark it as adopted and return the
	 * cat
	 */
	public Cat adoptCat(String name);

	/**
	 * Get the oldest dog, mark it as adopted and return the dog
	 */
	public Dog adoptDog();

	/**
	 * Get the dog matching the name (exactly, case sensitive), mark it as adopted and return the
	 * dog
	 */
	public Dog adoptDog(String name);

	/**
	 * Decide which animal to adopt based on the number of animals of each type. If there are more
	 * cats than dogs then return the oldest cat (mark it as adopted also); otherwise return the
	 * oldest dog
	 */
	public IAnimal adoptAnyAnimal();

}
