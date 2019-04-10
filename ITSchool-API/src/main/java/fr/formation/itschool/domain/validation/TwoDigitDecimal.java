package fr.formation.itschool.domain.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Constraint(validatedBy = TwoDigitDecimalValidator.class)
public @interface TwoDigitDecimal {

	String message() default "Le nombre ne doit pas comporter plus de 2 décimals";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
