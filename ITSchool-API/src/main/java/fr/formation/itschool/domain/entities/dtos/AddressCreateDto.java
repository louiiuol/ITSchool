package fr.formation.itschool.domain.entities.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AddressCreateDto {

	@NotBlank
	@Size(max = 55)
	private String road;

	@NotBlank
	@Size(max = 5)
	private String zipCode;

	@NotBlank
	@Size(max = 25)
	private String city;

	public AddressCreateDto() {
		super();
	}

}
