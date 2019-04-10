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
@Constraint(validatedBy = isAdultValidator.class)
public @interface isAdult {

	String message() default "You must be major to sign up";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
