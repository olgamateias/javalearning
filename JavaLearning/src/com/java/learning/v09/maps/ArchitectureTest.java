package com.java.learning.v09.maps;

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
		checkClass(MapFunctions.class);
//		checkClass(Dictionary.class);
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
