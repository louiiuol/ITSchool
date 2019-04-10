package fr.formation.itschool.domain.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.itschool.domain.entities.Address;
import fr.formation.itschool.domain.entities.dtos.AddressCreateDto;

@Repository
public interface AddressJpaRepository extends JpaRepository<Address, Long> {

	void save(AddressCreateDto address);

}
