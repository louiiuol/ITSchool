package fr.formation.itschool.domain.services.impl;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import fr.formation.itschool.domain.entities.Address;
import fr.formation.itschool.domain.entities.dtos.AddressCreateDto;
import fr.formation.itschool.domain.entities.dtos.AddressShowDto;
import fr.formation.itschool.domain.repositories.jpa.AddressJpaRepository;
import fr.formation.itschool.domain.services.AddresseService;

@Service
public class AddresseServiceImpl implements AddresseService {

	private final ModelMapper mapper;
	private final AddressJpaRepository addressJpaRepository;

	protected AddresseServiceImpl(AddressJpaRepository addressJpaRepository, ModelMapper mapper) {
		this.mapper = mapper;
		this.addressJpaRepository = addressJpaRepository;
	}

	@Override
	public void create(AddressCreateDto dto) {
		Address address = mapper.map(dto, Address.class);
		addressJpaRepository.save(address);
	}

	@Override
	public List<AddressShowDto> findAll() {
		List<Address> addresses = addressJpaRepository.findAll();
		Type listType = new TypeToken<List<AddressShowDto>>() {
		}.getType();
		return Collections.unmodifiableList(mapper.map(addresses, listType));

	}

}
