package com.airport.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airport.pojo.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
	
	
}
