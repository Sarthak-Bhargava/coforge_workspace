package com.airport.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airport.pojo.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
