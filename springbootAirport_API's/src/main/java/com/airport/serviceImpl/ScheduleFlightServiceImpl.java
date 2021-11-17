package com.airport.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.ScheduleFlight;
import com.airport.repositary.ScheduleFlightRepository;
import com.airport.service.ScheduleFlightService;

public class ScheduleFlightServiceImpl implements ScheduleFlightService {
	
	@Autowired
	ScheduleFlightRepository scheduleFlight_reposRepository;
	
	@Override
	public List<ScheduleFlight> getScheduleFlight() {
		
		return scheduleFlight_reposRepository.findAll();
	}

	@Override
	public ScheduleFlight addScheduleFlight(ScheduleFlight scheduleFlight) {
		
		return scheduleFlight_reposRepository.save(scheduleFlight);
	}

	@Override
	public ScheduleFlight updateScheduleFlight(ScheduleFlight scheduleFlight) {
		scheduleFlight_reposRepository.save(scheduleFlight);
		return scheduleFlight;
	}

	

	@Override
	public void deleteScheduleFlight(long scheduleFlightId) {
		ScheduleFlight scheduleFlight = scheduleFlight_reposRepository.getById(scheduleFlightId);
		scheduleFlight_reposRepository.save(scheduleFlight);
		
	}
	
	@Override
	public Optional<ScheduleFlight> getScheduleFlightById(long scheduleFlightId) {
		
		return this.scheduleFlight_reposRepository.findById(scheduleFlightId);
	}
}
