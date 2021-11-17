package com.airport.service;

import java.util.List;
import java.util.Optional;

import com.airport.pojo.ScheduleFlight;

public interface ScheduleFlightService {

	List<ScheduleFlight> getScheduleFlight();

	ScheduleFlight addScheduleFlight(ScheduleFlight scheduleFlight);

	ScheduleFlight updateScheduleFlight(ScheduleFlight scheduleFlight);

	void deleteScheduleFlight(long scheduleFlightId);

	Optional<ScheduleFlight> getScheduleFlightById(long scheduleFlightId);
	
	
}
