package fr.formation.itschool.domain.services;

import java.util.List;

import fr.formation.itschool.domain.entities.dtos.PersonCreateDto;
import fr.formation.itschool.domain.entities.dtos.PersonShowDto;

public interface PersonService {

	void create(PersonCreateDto person);

	boolean uniqueSecNumber(String secuNb);

	List<PersonShowDto> findAll();

}
