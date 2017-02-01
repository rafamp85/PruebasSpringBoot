package com.cursospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.cursospring.model.Person;
import com.cursospring.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Rafa", 41));
		people.add(new Person("Kari", 44));
		people.add(new Person("Claudia", 30));
		people.add(new Person("Dulce", 25));
		
		LOG.info("HELLO FROM SERVICE");
		
		return people;
	}

}
