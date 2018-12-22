package com.java.learning.v8.library;

import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ArchitectureTest {

	@Test
	public void testThatNoClassHasPublicVariables() {
		checkClass(BookAuthor.class);
		checkClass(Book.class);
		checkClass(Publisher.class);
		checkClass(Library.class);
//		checkClass(LibraryExtended.class);
	}

	private void checkClass(Class<?> clazz) {
		List<Field> fields = Arrays.asList(clazz.getDeclaredFields());
		List<Field> publicFields = fields.stream().filter(f -> (f.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC).collect(Collectors.toList());
		if (!publicFields.isEmpty()) {
			fail(String.format("Class '%s' should not have any public variable. The following variables are declared as public and should be private instead: %s", clazz.getName(),
					fieldNames(publicFields)));
		}
	}

	private String fieldNames(List<Field> publicFields) {
		return publicFields.stream().map(f -> f.getName()).collect(Collectors.joining(", "));
	}
}
