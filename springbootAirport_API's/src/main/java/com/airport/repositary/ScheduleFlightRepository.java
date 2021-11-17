package com.airport.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.pojo.ScheduleFlight;

public interface ScheduleFlightRepository extends JpaRepository<ScheduleFlight, Long> {

}
