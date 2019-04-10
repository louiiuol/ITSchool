package fr.formation.itschool.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.itschool.domain.entities.dtos.ContactInfoCreateDto;
import fr.formation.itschool.domain.services.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	private final ContactService contactService;

	protected ContactController(ContactService contactService) {
		this.contactService = contactService;

	}

	/**
	 * @param contact
	 */
	@PostMapping("/")
	public void createAddress(@RequestBody @Valid ContactInfoCreateDto contact) {
		contactService.create(contact);
	}

}
