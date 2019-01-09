package com.java.learning.v12.school;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	private List<Subject> subjects = new ArrayList<>();

	public List<Subject> getSubjects() {
		return this.subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}
