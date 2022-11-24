package br.com.erudio.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();

	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public List<Person> findAll() {

		List<Person> persons = new ArrayList<>();

		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}

		return persons;
	}

	public Person findById(String id) {

		logger.info("Finding a person!");

		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Wilson");
		person.setLastName("Zanuncio");
		person.setAddress("Campo Grande - MS - Brasil");
		person.setGender("Male");

		return person;
	}

	public Person create(Person person) {

		logger.info("Creating one person!");

		return person;
	}

	public Person update(Person person) {

		logger.info("Uptading one person!");

		return person;
	}

	public void delete(String id) {

		logger.info("Deleting one person!");
	}

	private Person mockPerson(int i) {

		logger.info("Finding all people!");

		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("FirstName " + i);
		person.setLastName("LastName " + i);
		person.setAddress("Address " + i);
		person.setGender("Gender " + i);

		return person;
	}
}
