package fr.formation.itschool.domain.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.itschool.domain.entities.Person;
import fr.formation.itschool.domain.entities.dtos.PersonCreateDto;

@Repository
public interface PersonJpaRepository extends JpaRepository<Person, Long> {

	void save(PersonCreateDto person);

	boolean existsBysocialSecNumber(String secuNb);

}
