package com.airport.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.Schedule;
import com.airport.repositary.ScheduleRepository;
import com.airport.service.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	ScheduleRepository schedule_reposRepository;
	
	@Override
	public List<Schedule> getSchedule() {
		
		return schedule_reposRepository.findAll();
	}

	@Override
	public Schedule addSchedule(Schedule schedule) {
		
		return schedule_reposRepository.save(schedule);
	}

	@Override
	public Schedule updateSchedule(Schedule schedule) {
		schedule_reposRepository.save(schedule);
		return schedule;
	}

	

	@Override
	public void deleteSchedule(long scheduleId) {
		Schedule schedule = schedule_reposRepository.getById(scheduleId);
		schedule_reposRepository.save(schedule);
		
	}
	
	@Override
	public Optional<Schedule> getScheduleById(long scheduleId) {
		
		return this.schedule_reposRepository.findById(scheduleId);
	}
}
