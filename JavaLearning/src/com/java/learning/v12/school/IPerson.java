package com.java.learning.v12.school;

import java.time.LocalDate;

public interface IPerson {

	void setBirthDate(LocalDate birthDate);

	LocalDate getBirthDate();

	void setSex(String sex);

	String getSex();

	void setLastName(String lastName);

	String getLastName();

	void setFirstName(String firstName);

	String getFirstName();

}
