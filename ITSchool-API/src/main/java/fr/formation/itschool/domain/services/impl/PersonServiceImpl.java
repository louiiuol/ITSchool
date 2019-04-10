package fr.formation.itschool.domain.services.impl;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import fr.formation.itschool.domain.entities.Person;
import fr.formation.itschool.domain.entities.dtos.PersonCreateDto;
import fr.formation.itschool.domain.entities.dtos.PersonShowDto;
import fr.formation.itschool.domain.repositories.jpa.PersonJpaRepository;
import fr.formation.itschool.domain.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private final ModelMapper mapper;
	private final PersonJpaRepository personJpaRepository;

	public PersonServiceImpl(ModelMapper mapper, PersonJpaRepository personJpaRepository) {
		this.mapper = mapper;
		this.personJpaRepository = personJpaRepository;
	}

	@Override
	public void create(PersonCreateDto person) {
		Person personObject = mapper.map(person, Person.class);
		personJpaRepository.save(personObject);

	}

	@Override
	public boolean uniqueSecNumber(String secuNb) {
		return !personJpaRepository.existsBysocialSecNumber(secuNb);
	}

	@Override
	public List<PersonShowDto> findAll() {
		List<Person> persons = personJpaRepository.findAll();
		Type listType = new TypeToken<List<PersonShowDto>>() {
		}.getType();
		return Collections.unmodifiableList(mapper.map(persons, listType));

	}

}
