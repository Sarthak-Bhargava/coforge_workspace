package com.airport.controlller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airport.pojo.Airport;
import com.airport.service.AirportService;

@RestController
public class AirportController {
	
	@Autowired
	AirportService airportService;
	
	@GetMapping
	public String home() {
		return "Welcome to Coforge Airport";
	}
	
	@PostMapping("/addAirport")
	Airport addAirportDetails(@RequestBody Airport airport) {

	//	Product prodinfo = productService.CreatProductDetails(productinfo);

		return this.airportService.addAirport(airport);

	}
	@GetMapping("/airportList")
	public List<Airport> getAirport() {
		return this.airportService.getAirport();
		
	}
	
	@DeleteMapping("/airports/{airportCode}")
	public void deleteAirportByCode(@PathVariable int airportCode) {
		this.airportService.deleteAirport(airportCode);
	}
	
	@PutMapping("airports/{airportCode}")
	public Airport updateOfAirportByCode(@PathVariable Airport airport) {
		return this.airportService.updateAirport(airport);
		
	}
	
	@GetMapping("/airportList/{airportCode}")
	public Optional<Airport> getAirportByCode(@PathVariable int airportCode) {
		return this.airportService.getAirportByCode(airportCode);
}
}
