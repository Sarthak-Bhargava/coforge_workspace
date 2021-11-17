package com.airport.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airport.pojo.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}
