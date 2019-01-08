package com.java.learning.v12.school;

public class Grade implements IGrade {

	private Student student;
	private Teacher teacher;
	private double grade;
	private Subjects subject;

	public double getGrade() {
		return this.grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}
