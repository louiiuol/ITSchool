package fr.formation.itschool.domain.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.itschool.domain.services.PersonService;

public class UniqueSecNumberValidator implements ConstraintValidator<UniqueSecNumber, String> {

	private final PersonService personService;

	protected UniqueSecNumberValidator(PersonService personService) {
		super();
		this.personService = personService;
	}

	@Override
	public boolean isValid(String secuNb, ConstraintValidatorContext context) {
		return personService.uniqueSecNumber(secuNb);
	}

}
