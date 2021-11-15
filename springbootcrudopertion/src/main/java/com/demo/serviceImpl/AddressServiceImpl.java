package com.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.pojo.Address;
import com.demo.repositary.AddressRepository;
import com.demo.service.AddressService;

public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	@Override
	public Address CreateAddressDetails(Address address) {
		// 
		return this.addressRepository.save(address);
	}

}
