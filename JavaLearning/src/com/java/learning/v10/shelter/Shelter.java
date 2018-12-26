package com.java.learning.v10.shelter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Shelter implements IShelter {
	List<Cat> catsList = new ArrayList<>();
	List<Dog> dogsList = new ArrayList<>();

	@Override
	public void fosterCat(Cat cat) {
		if (cat != null) {
			this.catsList.add(cat);
		}
	}

	@Override
	public void fosterDog(Dog dog) {
		if (dog != null) {
			this.dogsList.add(dog);
		}

	}

	@Override
	public List<Cat> getAllCats(boolean includeAdopted) {

		if (includeAdopted) {
			return this.catsList;
		}
		List<Cat> allCats = new ArrayList<>();
		for (Cat cat : this.catsList) {
			if (!cat.isAdopted()) {
				allCats.add(cat);
			}
		}

		return allCats;
	}

	@Override
	public List<Dog> getAllDogs(boolean includeAdopted) {
		if (includeAdopted) {
			return this.dogsList;
		}
		List<Dog> allDogs = new ArrayList<>();
		for (Dog dog : this.dogsList) {
			if (!dog.isAdopted()) {
				allDogs.add(dog);
			}
		}
		return allDogs;
	}

	@Override
	public List<IAnimal> getAllAnimals(boolean includeAdopted) {
		List<IAnimal> allAnimals = new ArrayList<>();
		allAnimals.addAll(this.catsList);
		allAnimals.addAll(this.dogsList);
		Iterator<IAnimal> iterator = allAnimals.iterator();

		if (includeAdopted) {
			return allAnimals;
		}
		while (iterator.hasNext()) {
			if (iterator.next().isAdopted()) {
				iterator.remove();
			}
		}
		return allAnimals;
//		List<IAnimal> notAdoptedAnimals = new ArrayList<>();
//		for (IAnimal animal : allAnimals) {
//			if (!animal.isAdopted()) {
//				notAdoptedAnimals.add(animal);
//			}
//		}
//		return notAdoptedAnimals;
	}

	/**
	 * Get the oldest cat, mark it as adopted and return the cat
	 */
	@Override
	public Cat adoptCat() {
		Cat cat = null;
		LocalDate max = LocalDate.MAX;
		for (Cat el : this.catsList) {
			if (el.getAge().isBefore(max)) {
				max = el.getAge();
				System.out.println("max date " + max);
				System.out.println("oldest cat " + el.getName());
				cat = el;
			}
		}
		if (cat != null) {
			cat.setAdopted(true);
		}

		return cat;
	}

	/**
	 * Get the cat matching the name (exactly, case sensitive), mark it as adopted and return the
	 * cat
	 */
	@Override
	public Cat adoptCat(String name) {
		Cat cat = null;
		for (Cat el : this.catsList) {
			if (el.getName().contains(name)) {
				cat = el;
			}
		}
		if (cat != null) {
			cat.setAdopted(true);
		}
		return cat;
	}

	@Override
	public Dog adoptDog() {
		Dog dog = null;
		LocalDate max = LocalDate.MAX;
		for (Dog el : this.dogsList) {
			if (el.getAge().isBefore(max)) {
				max = el.getAge();
				dog = el;
			}
		}
		if (dog != null) {
			dog.setAdopted(true);
		}
		return dog;
	}

	@Override
	public Dog adoptDog(String name) {
		Dog dog = null;
		for (Dog el : this.dogsList) {
			if (el.getName().contains(name)) {
				dog = el;
			}
		}
		if (dog != null) {
			dog.setAdopted(true);
		}
		return dog;
	}

	/**
	 * Decide which animal to adopt based on the number of animals of each type. If there are more
	 * cats than dogs (not adopted) then return the oldest cat (mark it as adopted also); otherwise
	 * return the oldest dog (mark it as adopted also)
	 */
	@Override
	public IAnimal adoptAnyAnimal() {
		IAnimal animal = null;
		if (getAllCats(false).size() > getAllDogs(false).size()) {
			animal = adoptCat();
		} else {
			animal = adoptDog();
		}
		return animal;
	}

	/**
	 * Get all the adopted cats and dogs and put them in a map. The key of the map represents the
	 * animal type (cat, dog) and the value of the map is a list of all the adopted cats or dogs
	 */
	@Override
	public Map<String, List<IAnimal>> getAdoptedAnimals() {
		Map<String, List<IAnimal>> adoptedAnimals = new HashMap<>();
		List<IAnimal> adoptedCats = new ArrayList<>();
		List<IAnimal> adoptedDogs = new ArrayList<>();

		for (Cat cat : this.catsList) {
			if (cat.isAdopted()) {
				adoptedCats.add(cat);
			}
		}
		for (Dog dog : this.dogsList) {
			if (dog.isAdopted()) {
				adoptedDogs.add(dog);
			}
		}
		adoptedAnimals.put("cat", adoptedCats);
		adoptedAnimals.put("dog", adoptedDogs);
		return adoptedAnimals;
	}

	/**
	 * Get the youngest animal that was adopted, regardless if it is a dog or cat
	 */
	@Override
	public IAnimal getTheYoungestAdoptedAnimal() {
		List<IAnimal> adoptedAnimals = new ArrayList<>();
		IAnimal adoptedAnimal = null;
		LocalDate min = LocalDate.MIN;
		for (IAnimal animal : getAllAnimals(true)) {
			if (animal.isAdopted()) {
				if (animal.getAge().isAfter(min)) {
					min = animal.getAge();
					adoptedAnimal = animal;
				}
				// adoptedAnimals.add(animal);
			}
		}
		return adoptedAnimal;
	}

}
