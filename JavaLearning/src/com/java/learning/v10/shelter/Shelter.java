package com.java.learning.v10.shelter;

import java.time.LocalDate;
import java.util.ArrayList;
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
		System.out.println("cat list " + this.catsList.size());
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
		Cat cat = new Cat();
		LocalDate max = LocalDate.MAX;
		for (Cat el : this.catsList) {
			if (el.getAge().isBefore(max)) {
				max = el.getAge();
				System.out.println("max date " + max);
				System.out.println("oldest cat " + el.getName());
				cat = el;
				cat.setAdopted(true);
			}
		}

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
