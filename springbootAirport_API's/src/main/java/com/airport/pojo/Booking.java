package com.airport.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingId;
	
	@Column(name="bookingDate")
	private String bookingDate;
	
	@Column(name="noOfPassengers")
	int noOfPassengers;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public Booking(long bookingId, String bookingDate, int noOfPassengers) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.noOfPassengers = noOfPassengers;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", noOfPassengers=" + noOfPassengers
				+ ", getBookingId()=" + getBookingId() + ", getBookingDate()=" + getBookingDate()
				+ ", getNoOfPassengers()=" + getNoOfPassengers() + "]";
	}
	
	
	

}
