package com.java.learning.v10.shelter;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShelterTest {

	private IShelter shelter;

	@BeforeEach
	void setUp() {
		this.shelter = new Shelter();
	}

	@Test
	void testFosterCat() {
		assertEquals(0, this.shelter.getAllCats(true).size());
		Cat cat = new Cat();
		cat.setName("pisi");
		this.shelter.fosterCat(cat);

		assertEquals(1, this.shelter.getAllCats(true).size());

		this.shelter.fosterCat(null);
	}

	@Test
	void testFosterDog() {
		assertEquals(0, this.shelter.getAllDogs(true).size());
		Dog dog = new Dog();
		dog.setName("cutzu");
		this.shelter.fosterDog(dog);

		assertEquals(1, this.shelter.getAllDogs(true).size());

		this.shelter.fosterDog(null);
	}

	@Test
	void testGetAllCats() {
		createCats();

		assertEquals(4, this.shelter.getAllCats(true).size());
		List<Cat> notAdoptedCats = this.shelter.getAllCats(false);
		assertEquals(2, notAdoptedCats.size());
		assertTrue(notAdoptedCats.stream().allMatch(cat -> cat.getName().equals("pisi1") || cat.getName().equals("pisi2")));

	}

	@Test
	void testGetAllDogs() {
		createDogs();

		assertEquals(4, this.shelter.getAllDogs(true).size());
		List<Dog> notAdoptedDogs = this.shelter.getAllDogs(false);
		assertEquals(2, notAdoptedDogs.size());
		assertTrue(notAdoptedDogs.stream().allMatch(dog -> dog.getName().equals("cutzu1") || dog.getName().equals("cutzu2")));

	}

	@Test
	void testGetAllAnimals() {
		createCats();
		createDogs();

		assertEquals(8, this.shelter.getAllAnimals(true).size());
		List<IAnimal> notAdoptedAnimals = this.shelter.getAllAnimals(false);
		assertEquals(4, notAdoptedAnimals.size());
		notAdoptedAnimals.forEach(animal -> assertFalse(animal.isAdopted()));
	}

	@Test
	void testAdoptCat() {
		createCats();

		Cat adoptedCat = this.shelter.adoptCat();
		assertTrue(adoptedCat.isAdopted());
		assertEquals("pisi1", adoptedCat.getName());
	}

	@Test
	void testAdoptCatString() {
		createCats();

		Cat adoptedCat = this.shelter.adoptCat("cutzu");
		assertNull(adoptedCat);

		adoptedCat = this.shelter.adoptCat("pisi2");
		assertTrue(adoptedCat.isAdopted());
		assertEquals("pisi2", adoptedCat.getName());
	}

	@Test
	void testAdoptDog() {
		createDogs();

		Dog adoptedDog = this.shelter.adoptDog();
		assertTrue(adoptedDog.isAdopted());
		assertEquals("cutzu1", adoptedDog.getName());
	}

	@Test
	void testAdoptDogString() {
		createDogs();

		Dog adoptedDog = this.shelter.adoptDog("pisi");
		assertNull(adoptedDog);

		adoptedDog = this.shelter.adoptDog("cutzu2");
		assertTrue(adoptedDog.isAdopted());
		assertEquals("cutzu2", adoptedDog.getName());
	}

	@Test
	void testAdoptAnyAnimal() {
		createCats();
		createDogs();

		IAnimal adoptedAnimal = this.shelter.adoptAnyAnimal();
		assertTrue(adoptedAnimal.isAdopted());
		assertTrue(adoptedAnimal instanceof Dog);
		assertEquals("cutzu1", adoptedAnimal.getName());

		adoptedAnimal = this.shelter.adoptAnyAnimal();
		assertTrue(adoptedAnimal.isAdopted());
		assertTrue(adoptedAnimal instanceof Cat);
		assertEquals("pisi1", adoptedAnimal.getName());

	}

	@Test
	void testGetAdoptedAnimals() {
		createCats();
		createDogs();

		Map<String, List<IAnimal>> adoptedAnimals = this.shelter.getAdoptedAnimals();
		assertEquals(2, adoptedAnimals.size());
		assertTrue(adoptedAnimals.containsKey("cat"));
		assertTrue(adoptedAnimals.containsKey("dog"));
		assertTrue(adoptedAnimals.values().stream().reduce((l1, l2) -> {
			List<IAnimal> list = new ArrayList<>();
			list.addAll(l1);
			list.addAll(l2);
			return list;
		}).orElseGet(() -> Collections.emptyList()).stream().allMatch(animal -> animal.isAdopted()));
	}

	@Test
	void testGetTheYoungestAdoptedAnimal() {
		createCats();
		createDogs();

		IAnimal youngestAnimal = this.shelter.getTheYoungestAdoptedAnimal();
		assertTrue(youngestAnimal.isAdopted());
		assertEquals("cutzu4", youngestAnimal.getName());

		this.shelter.adoptDog("cutzu1");
		youngestAnimal = this.shelter.getTheYoungestAdoptedAnimal();
		assertTrue(youngestAnimal.isAdopted());
		assertEquals("cutzu4", youngestAnimal.getName());
	}

	private void createCats() {
		Cat cat1 = new Cat();
		cat1.setName("pisi1");
		cat1.setAge(LocalDate.of(2018, 1, 1));

		Cat cat2 = new Cat();
		cat2.setName("pisi2");
		cat2.setAge(LocalDate.of(2018, 2, 1));

		Cat cat3 = new Cat();
		cat3.setName("pisi3");
		cat3.setAge(LocalDate.of(2018, 3, 1));
		cat3.setAdopted(true);

		Cat cat4 = new Cat();
		cat4.setName("pisi4");
		cat4.setAge(LocalDate.of(2018, 4, 1));
		cat4.setAdopted(true);

		this.shelter.fosterCat(cat1);
		this.shelter.fosterCat(cat2);
		this.shelter.fosterCat(cat3);
		this.shelter.fosterCat(cat4);

	}

	private void createDogs() {
		Dog dog1 = new Dog();
		dog1.setName("cutzu1");
		dog1.setAge(LocalDate.of(2018, 1, 2));

		Dog dog2 = new Dog();
		dog2.setName("cutzu2");
		dog2.setAge(LocalDate.of(2018, 2, 2));

		Dog dog3 = new Dog();
		dog3.setName("cutzu3");
		dog3.setAge(LocalDate.of(2018, 3, 2));
		dog3.setAdopted(true);

		Dog dog4 = new Dog();
		dog4.setName("cutzu4");
		dog4.setAge(LocalDate.of(2018, 4, 2));
		dog4.setAdopted(true);

		this.shelter.fosterDog(dog1);
		this.shelter.fosterDog(dog2);
		this.shelter.fosterDog(dog3);
		this.shelter.fosterDog(dog4);
	}
}
