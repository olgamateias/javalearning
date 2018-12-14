package com.java.learning.v8.library;

public class Publisher implements IPublisher {
	private String name;
	private String city;
	private int id;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return this.city;
	}

	@Override
	public void setCity(String city) {
		// TODO Auto-generated method stub
		this.city = city;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

}
