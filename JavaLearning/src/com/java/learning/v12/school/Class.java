package com.java.learning.v12.school;

import java.util.List;

public class Class implements IClass {

	private List<Student> allStudents;
	private List<Teacher> classTeachers;
	private Teacher principal;
	private String className;
	private String classLevel;

	@Override
	public Teacher getPrincipal() {
		return this.principal;
	}

	@Override
	public void setPrincipal(Teacher principal) {
		this.principal = principal;
	}

	@Override
	public String getClassName() {
		return this.className;
	}

	@Override
	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String getClassLevel() {
		return this.classLevel;
	}

	@Override
	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}

	@Override
	public List<Student> getAllStudents() {
		return this.allStudents;
	}

	@Override
	public List<Teacher> getClassTeachers() {
		return this.classTeachers;
	}

}
