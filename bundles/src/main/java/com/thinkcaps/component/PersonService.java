package com.thinkcaps.component;

import org.springframework.stereotype.Component;

import com.thinkcaps.Person;

@Component
public class PersonService implements IPersonService {

	public Person getPersonDetail(Integer id) {
		Person p = new Person();
		p.setId(id);
		p.setLocation("Delhi");
		p.setName("Anupam");
		return p;
	}
}
