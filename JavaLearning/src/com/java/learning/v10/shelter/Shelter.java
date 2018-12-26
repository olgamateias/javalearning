package com.java.learning.v10.shelter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Shelter implements IShelter {
	List<Cat> catsList = new ArrayList<>();
	List<Dog> dogsList = new ArrayList<>();

	@Override
	public void fosterCat(Cat cat) {
		this.catsList.add(cat);
	}

	@Override
	public void fosterDog(Dog dog) {
		this.dogsList.add(dog);
	}

	@Override
	public List<Cat> getAllCats(boolean includeAdopted) {
		List<Cat> allCats = new ArrayList<>();
		return allCats;
	}

	@Override
	public List<Dog> getAllDogs(boolean includeAdopted) {
		List<Dog> allDogs = new ArrayList<>();
		return allDogs;
	}

	@Override
	public List<IAnimal> getAllAnimals(boolean includeAdopted) {
		List<IAnimal> allAnimals = new ArrayList<IAnimal>();
		return allAnimals;
	}

	@Override
	public Cat adoptCat() {
		Cat cat = new Cat();
		return cat;
	}

	@Override
	public Cat adoptCat(String name) {
		Cat cat = new Cat();
		return cat;
	}

	@Override
	public Dog adoptDog() {
		Dog dog = new Dog();
		return dog;
	}

	@Override
	public Dog adoptDog(String name) {
		Dog dog = new Dog();
		return dog;
	}

	@Override
	public IAnimal adoptAnyAnimal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<IAnimal>> getAdoptedAnimals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAnimal getTheYoungestAdoptedAnimal() {
		// TODO Auto-generated method stub
		return null;
	}

}
