package com.person.service;

import com.person.person.Person;

public class PersonInfoService 
{
// Method to create an object from the request parameters
	
	public Person createPerson(long id, String name, int age, String hobby, String city)
	{
		Person p = new Person(id, city, age, city, city);
		return p;
	}
}
