package fr.formation.itschool.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.itschool.domain.entities.dtos.PersonCreateDto;
import fr.formation.itschool.domain.entities.dtos.PersonShowDto;
import fr.formation.itschool.domain.services.PersonService;

@RestController
@CrossOrigin("*")
@RequestMapping("/persons")
public class PersonController {

	private final PersonService personService;

	protected PersonController(PersonService personService) {
		this.personService = personService;
	}

	/**
	 * @param person
	 */

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED) // 201
	public void createPerson(@RequestBody @Valid PersonCreateDto person) {
		personService.create(person);
	}

	@GetMapping("/")
	public List<PersonShowDto> showPerson() {
		return personService.findAll();

	}

}
