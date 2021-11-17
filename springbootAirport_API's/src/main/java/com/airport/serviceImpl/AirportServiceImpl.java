package com.airport.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.pojo.Airport;
import com.airport.repositary.AirportRepository;
import com.airport.service.AirportService;

public class AirportServiceImpl implements AirportService
{
	@Autowired
	AirportRepository airport_repository;
	
	@Override
	public List<Airport> getAirport() {
		
		return airport_repository.findAll();
	}

	@Override
	public Airport addAirport(Airport airport) {
		
		return airport_repository.save(airport);
	}

	@Override
	public Airport updateAirport(Airport airport) {
		airport_repository.save(airport);
		return airport;
	}

	

	@Override
	public void deleteAirport(int airportCode) {
		Airport airport = airport_repository.getById((long) airportCode);
		airport_repository.save(airport);
		
	}
	
	@Override
	public Optional<Airport> getAirportByCode(int airportCode) {
		
		return this.airport_repository.findById((long) airportCode);
	}

	
	
}
