package com.java.learning.v12.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public void addGrade(Grade grade) {
		this.allGrades.add(grade);
	}

	public void addStudentForClass(Student student, ClassRoom classRoom) {
		classRoom.addStudent(student);
	}

	public void addTeacherForClass(Teacher teacher, ClassRoom classRoom) {
		classRoom.addTeacher(teacher);
	}

	public List<Teacher> getAllTeachers() {
		return this.allTeachers;
	}

	public List<ClassRoom> getAllClasses() {
		return this.allClasses;
	}

	public List<Grade> getAllGrades() {
		return this.allGrades;
	}

	public List<Student> getAllStudents() {
		List<Student> allStudents = new ArrayList<>();
		for (ClassRoom classRoom : this.allClasses) {
			allStudents.addAll(classRoom.getAllStudents());
		}
		return allStudents;
	}

	// return all classes for a teacher in a list
	public List<ClassRoom> getAllClassesForATeacher(Teacher teacher) {
		List<ClassRoom> allClassesForATeacher = new ArrayList<>();
		for (ClassRoom classRoom : this.allClasses) {
			if (classRoom.getClassTeachers().contains(teacher)) {
				allClassesForATeacher.add(classRoom);
			}
		}
		return allClassesForATeacher;
	}

	// return a map of all teachers and their classes
	public Map<Teacher, List<ClassRoom>> mapTeachersAndClasses() {
		Map<Teacher, List<ClassRoom>> allteachersAndClasses = new HashMap<>();
		for (Teacher teacher : this.allTeachers) {
			List<ClassRoom> teachersClasses = getAllClassesForATeacher(teacher);
			allteachersAndClasses.put(teacher, teachersClasses);
		}
		return allteachersAndClasses;
	}

}
