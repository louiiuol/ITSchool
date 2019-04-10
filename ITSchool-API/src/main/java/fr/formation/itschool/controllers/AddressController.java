package fr.formation.itschool.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.itschool.domain.entities.dtos.AddressCreateDto;
import fr.formation.itschool.domain.entities.dtos.AddressShowDto;
import fr.formation.itschool.domain.services.AddresseService;

@RestController
@RequestMapping("/addresses")
public class AddressController {

	private final AddresseService addressService;

	protected AddressController(AddresseService addressService) {
		this.addressService = addressService;

	}

	/**
	 * @param address
	 */
	@PostMapping("/")
	public void createAddress(@RequestBody AddressCreateDto address) {
		addressService.create(address);
	}

	@GetMapping("/")
	public List<AddressShowDto> getAddresses() {
		return addressService.findAll();
	}
}
