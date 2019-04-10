package fr.formation.itschool.domain.validation;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class isAdultValidator implements ConstraintValidator<isAdult, LocalDate> {

	@Override
	public void initialize(isAdult constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(LocalDate age, ConstraintValidatorContext context) {
		LocalDate majorityLimit = LocalDate.now().minusYears(18);
		if (age.isBefore(majorityLimit))
			return true;
		else
			return false;
	}

}
