package com.java.learning.v12.school;

import java.util.List;
import java.util.Map;

public interface ISchool {

	Map<Teacher, List<Student>> mapTeachersAllStudents();

	Map<Teacher, List<ClassRoom>> mapTeachersAndClasses();

	List<Student> getTeachersAllStudents(Teacher teacher);

	List<ClassRoom> getAllClassesForATeacher(Teacher teacher);

	List<Student> getAllStudents();

	List<Grade> getAllGrades();

	List<ClassRoom> getAllClasses();

	List<Teacher> getAllTeachers();

	void addTeacherForClass(Teacher teacher, ClassRoom classRoom);

	void addStudentForClass(Student student, ClassRoom classRoom);

	void addGrade(Grade grade);

	void addClass(ClassRoom classroom);

	void addTeacher(Teacher teacher);

	Map<Double, List<Student>> mapGrades(Subject subject);

	List<Student> getAllStudentsWithGrade(double grade, Subject subject);

	/*
	 * We need to store the data from exams for a school. We need the following entities:
	 * Student: first name, last name, sex, date of birth
	 * Teacher: first name, last name, sex, date of birth, subjects (list)
	 * Subject (enum) with values: Math, Literature, Grammar, Physics, Chemistry
	 * Class: students (list), teachers (will also contain the principal teacher), principal
	 * teacher, name/level (string)
	 * Grade: student, teacher, grade (double), subject
	 * School: all teachers, all classes, all grades
	 * - add a class
	 * - add a teacher
	 * - add a student for a class
	 * - add a teacher for a class
	 * - add a grade
	 * - get all classes
	 * - get all teachers
	 * - get all students from all classes
	 * - get all grades
	 * - return a map of all teachers and their classes
	 * - return a map of all teachers and their students (from all the classes)
	 * - return the students with the maximum grade for each Subject (map)
	 * - return a map with grades and all the students that have that grade for a specific subject
	 */
}
