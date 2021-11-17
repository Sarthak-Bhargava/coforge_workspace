package com.airport.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.Passenger;
import com.airport.repositary.PassengerRepository;
import com.airport.service.PassengerService;

public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerRepository passenger_reposRepository;
	
	@Override
	public List<Passenger> getPassenger() {
		
		return passenger_reposRepository.findAll();
	}

	@Override
	public Passenger addPassenger(Passenger passenger) {
		
		return passenger_reposRepository.save(passenger);
	}

	@Override
	public Passenger updatePassenger(Passenger passenger) {
		passenger_reposRepository.save(passenger);
		return passenger;
	}

	

	@Override
	public void deletePassenger(long passengerId) {
		Passenger passenger = passenger_reposRepository.getById(passengerId);
		passenger_reposRepository.save(passenger);
		
	}
	
	@Override
	public Optional<Passenger> getPassengerByPnr(long pnrNumber) {
		
		return this.passenger_reposRepository.findById(pnrNumber);
	}

}
