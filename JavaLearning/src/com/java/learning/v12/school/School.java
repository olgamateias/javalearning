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

	@Override
	public void addTeacher(Teacher teacher) {
		this.allTeachers.add(teacher);
	}

	@Override
	public void addClass(ClassRoom classroom) {
		this.allClasses.add(classroom);
	}

	@Override
	public void addGrade(Grade grade) {
		this.allGrades.add(grade);
	}

	@Override
	public void addStudentForClass(Student student, ClassRoom classRoom) {
		classRoom.addStudent(student);
	}

	@Override
	public void addTeacherForClass(Teacher teacher, ClassRoom classRoom) {
		classRoom.addTeacher(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return this.allTeachers;
	}

	@Override
	public List<ClassRoom> getAllClasses() {
		return this.allClasses;
	}

	@Override
	public List<Grade> getAllGrades() {
		return this.allGrades;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> allStudents = new ArrayList<>();
		for (ClassRoom classRoom : this.allClasses) {
			allStudents.addAll(classRoom.getAllStudents());
		}
		return allStudents;
	}

	// return all classes for a teacher in a list
	@Override
	public List<ClassRoom> getAllClassesForATeacher(Teacher teacher) {
		List<ClassRoom> allClassesForATeacher = new ArrayList<>();
		for (ClassRoom classRoom : this.allClasses) {
			if (classRoom.getClassTeachers().contains(teacher)) {
				allClassesForATeacher.add(classRoom);
			}
		}
		return allClassesForATeacher;
	}

	// return all Students of a teacher
	@Override
	public List<Student> getTeachersAllStudents(Teacher teacher) {
		List<Student> allTeachersStudents = new ArrayList<>();
		for (ClassRoom classRoom : this.allClasses) {
			if (classRoom.getClassTeachers().contains(teacher)) {
				allTeachersStudents.addAll(classRoom.getAllStudents());
			}
		}
		return allTeachersStudents;
	}

	// return a map of all teachers and their classes
	@Override
	public Map<Teacher, List<ClassRoom>> mapTeachersAndClasses() {
		Map<Teacher, List<ClassRoom>> allteachersAndClasses = new HashMap<>();
		for (Teacher teacher : this.allTeachers) {
			List<ClassRoom> teachersClasses = getAllClassesForATeacher(teacher);
			allteachersAndClasses.put(teacher, teachersClasses);
		}
		return allteachersAndClasses;
	}

	// return a map of all teachers and their students (from all the classes)
	@Override
	public Map<Teacher, List<Student>> mapTeachersAllStudents() {
		Map<Teacher, List<Student>> allTeachersStudents = new HashMap<>();
		for (Teacher teacher : this.allTeachers) {
			allTeachersStudents.put(teacher, getTeachersAllStudents(teacher));
		}
		return allTeachersStudents;
	}

	// all students that have a specific grade for a specific subject
	@Override
	public List<Student> getAllStudentsWithGrade(double grade, Subject subject) {
		List<Student> allStudents = new ArrayList<>();
		for (Grade score : this.allGrades) {
			if (score.getSubject().equals(subject) && score.getGrade() == grade) {
				allStudents.add(score.getStudent());
			}
		}
		return allStudents;
	}

	// return a map with grades and all the students that have that grade for a specific subject
	@Override
	public Map<Double, List<Student>> mapGrades(Subject subject) {
		Map<Double, List<Student>> allGradesAndStudents = new HashMap<>();
		for (Grade grade : this.allGrades) {
			Double score = grade.getGrade();
			allGradesAndStudents.put(score, getAllStudentsWithGrade(score, subject));
		}
		return allGradesAndStudents;
	}

}
