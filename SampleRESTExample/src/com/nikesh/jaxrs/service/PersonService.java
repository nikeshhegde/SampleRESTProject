package com.nikesh.jaxrs.service;

import com.nikesh.jaxrs.model.Person;
import com.nikesh.jaxrs.model.Response;

public interface PersonService {
	
	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
}
