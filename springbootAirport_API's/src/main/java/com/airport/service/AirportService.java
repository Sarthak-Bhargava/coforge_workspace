package com.airport.service;

import java.util.List;
import java.util.Optional;

import com.airport.pojo.Airport;


public interface AirportService {
	
	public List<Airport> getAirport();
	
	public Airport addAirport(Airport airport);
	
	public Airport updateAirport(Airport airport);
	
	public void deleteAirport(int airportCode);

	Optional<Airport> getAirportByCode(int airportCode);
	

}
