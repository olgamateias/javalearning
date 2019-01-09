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

	public void setGrade(double grade) {
		this.grade = grade;
	}

}
