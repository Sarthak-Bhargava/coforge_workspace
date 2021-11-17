package com.airport.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airport")
public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airportCode;
	
	@Column(name="airportLocation")
	private String airportLocation;
	
	@Column(name="airportName")
	private String airportName;
	
	public int getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(int airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public Airport(int airportCode, String airportLocation, String airportName) {
		super();
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
		this.airportName = airportName;
	}
	@Override
	public String toString() {
		return "Airport [airportCode=" + airportCode + ", airportLocation=" + airportLocation + ", airportName="
				+ airportName + ", getAirportCode()=" + getAirportCode() + ", getAirportLocation()="
				+ getAirportLocation() + ", getAirportName()=" + getAirportName() + "]";
	}
	
	
}
