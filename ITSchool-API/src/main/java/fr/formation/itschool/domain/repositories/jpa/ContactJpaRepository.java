package fr.formation.itschool.domain.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.itschool.domain.entities.ContactInfo;

@Repository
public interface ContactJpaRepository extends JpaRepository<ContactInfo, Long> {

	boolean existsByEmailIgnoreCase(String email);

}
