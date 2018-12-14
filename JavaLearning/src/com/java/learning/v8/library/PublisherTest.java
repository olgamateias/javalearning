package com.java.learning.v8.library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PublisherTest {

	@Test
	public void testPublisher() {
		IPublisher publisher = new Publisher();
		publisher.setCity("Iasi");
		publisher.setName("Teora");
		publisher.setId(1);

		assertEquals(publisher.getCity(), "Iasi");
		assertEquals(publisher.getName(), "Teora");
		assertEquals(publisher.getId(), 1);
	}
}
