package com.airport.service;

import java.util.List;
import java.util.Optional;

import com.airport.pojo.Schedule;

public interface ScheduleService {

	List<Schedule> getSchedule();

	Schedule addSchedule(Schedule schedule);

	Schedule updateSchedule(Schedule schedule);

	void deleteSchedule(long scheduleId);

	Optional<Schedule> getScheduleById(long scheduleId);

}
