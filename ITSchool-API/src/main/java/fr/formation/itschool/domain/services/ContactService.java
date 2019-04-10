package fr.formation.itschool.domain.services;

import fr.formation.itschool.domain.entities.dtos.ContactInfoCreateDto;

public interface ContactService {

	public void create(ContactInfoCreateDto dto);

	public boolean emailUnique(String email);
}
