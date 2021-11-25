package com.demo.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Address;
import com.demo.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping
	public Address CreateAddressDetails(@RequestBody Address addressInfo) {
		Address address = addressService.CreateAddressDetails(addressInfo);
		return address;
		
	}

}
