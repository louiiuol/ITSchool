package fr.formation.itschool.domain.entities.dtos;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import fr.formation.itschool.domain.validation.emailUnique;

public class ContactInfoCreateDto {

	@Valid
	private AddressCreateDto address;

	@NotBlank
	@Size(max = 10)
	private String phone;

	@NotBlank
	@Size(max = 10)
	private String mobile;

	@Email
	@NotBlank
	@emailUnique
	private String email;

	public ContactInfoCreateDto() {
		super();
	}

}
