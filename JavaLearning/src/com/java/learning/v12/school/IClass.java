package com.java.learning.v12.school;

import java.util.List;

public interface IClass {

	List<Teacher> getClassTeachers();

	List<Student> getAllStudents();

	void setClassLevel(String classLevel);

	String getClassLevel();

	void setClassName(String className);

	String getClassName();

	void setPrincipal(Teacher principal);

	Teacher getPrincipal();

}
