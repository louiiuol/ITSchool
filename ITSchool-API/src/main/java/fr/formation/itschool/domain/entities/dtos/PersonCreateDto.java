package fr.formation.itschool.domain.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import fr.formation.itschool.domain.entities.Person.Gender;
import fr.formation.itschool.domain.validation.UniqueSecNumber;
import fr.formation.itschool.domain.validation.isAdult;

public class PersonCreateDto {

	@NotBlank
	@Size(max = 15)
	@UniqueSecNumber
	private String socialSecNumber;

	@NotBlank
	@Size(max = 100)
	private String firstName;

	@NotBlank
	@Size(max = 100)
	private String lastName;

	@isAdult
	private LocalDate birthDate;

	private Gender gender;

	public PersonCreateDto() {
		super();
	}

}