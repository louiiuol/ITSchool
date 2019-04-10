package fr.formation.itschool.domain.services;

import java.util.List;

import fr.formation.itschool.domain.entities.dtos.AddressCreateDto;
import fr.formation.itschool.domain.entities.dtos.AddressShowDto;

public interface AddresseService {

	public void create(AddressCreateDto dto);

	public List<AddressShowDto> findAll();
}
