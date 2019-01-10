package com.java.learning.v12.school;

public class Grade implements IGrade {

	private Student student;
	private Teacher teacher;
	private double grade;
	private Subject subject;

//getter and setter for all (or set them through the constructor)

	public double getGrade() {
		return this.grade;
	}

	public Grade(Student student, Teacher teacher, double grade, Subject subject) {
		super();
		this.student = student;
		this.teacher = teacher;
		this.grade = grade;
		this.subject = subject;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return this.student;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public Subject getSubject() {
		return this.subject;
	}

}
