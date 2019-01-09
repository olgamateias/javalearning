package com.java.learning.v12.school;

import java.util.List;

public class School implements ISchool {

	private List<Teacher> allTeachers;
	private List<ClassRoom> allClasses;
	private List<Grade> allGrades;
// getter and adder for all properties

	public void addTeacher(Teacher teacher) {
		this.allTeachers.add(teacher);
	}

	public void addClass(ClassRoom classroom) {
		this.allClasses.add(classroom);
	}

}
