package fr.formation.itschool.domain.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.itschool.domain.entities.ContactInfo;
import fr.formation.itschool.domain.entities.dtos.ContactInfoCreateDto;
import fr.formation.itschool.domain.repositories.jpa.ContactJpaRepository;
import fr.formation.itschool.domain.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	private final ModelMapper mapper;
	private final ContactJpaRepository contactJpaRepository;

	protected ContactServiceImpl(ContactJpaRepository contactJpaRepository, ModelMapper mapper) {
		this.mapper = mapper;
		this.contactJpaRepository = contactJpaRepository;
	}

	public void create(ContactInfoCreateDto dto) {
		ContactInfo contact = mapper.map(dto, ContactInfo.class);
		System.out.println(contact);
		contactJpaRepository.save(contact);
	}

	@Override
	public boolean emailUnique(String email) {
		return !contactJpaRepository.existsByEmailIgnoreCase(email);
	}

}