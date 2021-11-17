package com.airport.service;

import java.util.List;
import java.util.Optional;

import com.airport.pojo.Passenger;

public interface PassengerService {
	
	List<Passenger> getPassenger();

	Passenger addPassenger(Passenger passenger);

	Passenger updatePassenger(Passenger passenger);

	void deletePassenger(long pnrNumber);

	Optional<Passenger> getPassengerByPnr(long pnrNumber);
}
