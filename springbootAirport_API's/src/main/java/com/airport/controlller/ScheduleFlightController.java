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

import com.airport.pojo.ScheduleFlight;
import com.airport.service.ScheduleFlightService;

@RestController
public class ScheduleFlightController {
	@Autowired
	ScheduleFlightService scheduleFlightService;
	
	@PostMapping("/addScheduleFlight")
	ScheduleFlight addScheduleFlightDetails(@RequestBody ScheduleFlight scheduleFlight) {

		return this.scheduleFlightService.addScheduleFlight(scheduleFlight);

	}
	@GetMapping("/scheduleFlightList")
	public List<ScheduleFlight> getScheduleFlight() {
		return this.scheduleFlightService.getScheduleFlight();
		
	}
	
	@DeleteMapping("/scheduleFlights/{scheduleFlightId}")
	public void deleteScheduleFlightByCode(@PathVariable int scheduleFlightId) {
		this.scheduleFlightService.deleteScheduleFlight(scheduleFlightId);
	}
	
	@PutMapping("scheduleFlights/{scheduleFlightId}")
	public ScheduleFlight updateOfScheduleFlightById(@PathVariable ScheduleFlight scheduleFlight) {
		return this.scheduleFlightService.updateScheduleFlight(scheduleFlight);
		
	}
	
	@GetMapping("/scheduleFlightList/{scheduleFlightId}")
	public Optional<ScheduleFlight> getScheduleFlightById(@PathVariable long scheduleFlightId) {
		return this.scheduleFlightService.getScheduleFlightById(scheduleFlightId);

}
}
