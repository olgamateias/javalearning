package com.java.learning.v12.school;

import java.util.ArrayList;
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

}
