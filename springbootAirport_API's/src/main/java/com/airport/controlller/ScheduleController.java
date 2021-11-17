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

import com.airport.pojo.Schedule;
import com.airport.service.ScheduleService;

@RestController
public class ScheduleController {
	
	@Autowired
	ScheduleService scheduleService;
	
	@PostMapping("/addSchedule")
	Schedule addScheduleDetails(@RequestBody Schedule schedule) {

		return this.scheduleService.addSchedule(schedule);

	}
	@GetMapping("/scheduleList")
	public List<Schedule> getSchedule() {
		return this.scheduleService.getSchedule();
		
	}
	
	@DeleteMapping("/schedules/{scheduleId}")
	public void deleteScheduleByCode(@PathVariable int scheduleId) {
		this.scheduleService.deleteSchedule(scheduleId);
	}
	
	@PutMapping("schedules/{scheduleId}")
	public Schedule updateOfScheduleById(@PathVariable Schedule schedule) {
		return this.scheduleService.updateSchedule(schedule);
		
	}
	
	@GetMapping("/scheduleList/{scheduleId}")
	public Optional<Schedule> getScheduleById(@PathVariable long scheduleId) {
		return this.scheduleService.getScheduleById(scheduleId);
}
}
