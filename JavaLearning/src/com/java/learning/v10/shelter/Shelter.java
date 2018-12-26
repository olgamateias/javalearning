package com.java.learning.v10.shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter implements IShelter {

	@Override
	public void fosterCat(Cat cat) {
	}

	@Override
	public void fosterDog(Dog dog) {
	}

	@Override
	public List<Cat> getAllCats(boolean includeAdopted) {
		List<Cat> allCats = new ArrayList<>();
		return allCats;
	}

	@Override
	public List<Dog> getAllDogs(boolean includeAdopted) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IAnimal> getAllAnimals(boolean includeAdopted) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cat adoptCat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cat adoptCat(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dog adoptDog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dog adoptDog(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAnimal adoptAnyAnimal() {
		// TODO Auto-generated method stub
		return null;
	}

}
