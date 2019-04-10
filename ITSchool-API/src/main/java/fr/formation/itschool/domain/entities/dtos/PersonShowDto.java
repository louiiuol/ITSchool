package fr.formation.itschool.domain.entities.dtos;

import java.time.LocalDate;

import fr.formation.itschool.domain.entities.Person.Gender;

@SuppressWarnings("unused")
public class PersonShowDto {

	private String socialSecNumber;

	private String firstName;

	private String lastName;

	private LocalDate birthDate;

	private Gender gender;

	PersonShowDto() {
		super();
	}
}
