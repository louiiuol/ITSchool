package fr.formation.itschool.domain.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.itschool.domain.services.ContactService;

public class emailUniqueValidator implements ConstraintValidator<emailUnique, String> {

	private final ContactService userService;

	protected emailUniqueValidator(ContactService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		if (null == email || email.isEmpty())
			return true;
		else
			return userService.emailUnique(email);
	}

}
