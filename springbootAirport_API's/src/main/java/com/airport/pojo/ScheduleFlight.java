package com.airport.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class ScheduleFlight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	private long scheduleFlightId;
	
	@Column
    private String flight;
	
	@Column
    private Integer availableSeats;
	
	@Column
    private Schedule schedule;

	public long getScheduleFlightId() {
		return scheduleFlightId;
	}

	public void setScheduleFlightId(long scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public ScheduleFlight(@NotEmpty long scheduleFlightId, String flight, Integer availableSeats, Schedule schedule) {
		super();
		this.scheduleFlightId = scheduleFlightId;
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "ScheduleFlight [scheduleFlightId=" + scheduleFlightId + ", flight=" + flight + ", availableSeats="
				+ availableSeats + ", schedule=" + schedule + ", getScheduleFlightId()=" + getScheduleFlightId()
				+ ", getFlight()=" + getFlight() + ", getAvailableSeats()=" + getAvailableSeats() + ", getSchedule()="
				+ getSchedule() + "]";
	}
	
	
}
