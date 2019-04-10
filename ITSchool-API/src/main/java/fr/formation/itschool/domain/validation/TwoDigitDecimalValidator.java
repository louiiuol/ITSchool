package fr.formation.itschool.domain.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TwoDigitDecimalValidator implements ConstraintValidator<TwoDigitDecimal, Double> {

	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		String[] parts = Double.toString(value).split("[\\.\\,]");
		if (parts[1].length() > 2)
			return false;
		else
			return true;
	}
}