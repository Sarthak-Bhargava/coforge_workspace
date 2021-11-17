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

import com.airport.pojo.Passenger;
import com.airport.service.PassengerService;

@RestController
public class PassengerController {
	
	@Autowired
	PassengerService passengerService;
	
	@PostMapping("/addPassenger")
	Passenger addPassengerDetails(@RequestBody Passenger passenger) {

		return this.passengerService.addPassenger(passenger);

	}
	@GetMapping("/passengerList")
	public List<Passenger> getPassenger() {
		return this.passengerService.getPassenger();
		
	}
	
	@DeleteMapping("/passengers/{passengerPnr}")
	public void deletePassengerByCode(@PathVariable int passengerPnr) {
		this.passengerService.deletePassenger(passengerPnr);
	}
	
	@PutMapping("passengers/{passengerPnr}")
	public Passenger updateOfPassengerById(@PathVariable Passenger passenger) {
		return this.passengerService.updatePassenger(passenger);
		
	}
	
	@GetMapping("/passengerList/{passengerPnr}")
	public Optional<Passenger> getPassengerByPnr(@PathVariable long passengerPnr) {
		return this.passengerService.getPassengerByPnr(passengerPnr);
}
}
