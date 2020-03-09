package com.person.person;

public class Person 
{
	// person attributes
	// constructors
	// getters and setters
	
	private long ID;
	private String name;
	private int age;
	private String hobby;
	private String city;
	
	public Person(long ID, String name, int age, String hobby, String city) 
	{
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		this.city = city;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
