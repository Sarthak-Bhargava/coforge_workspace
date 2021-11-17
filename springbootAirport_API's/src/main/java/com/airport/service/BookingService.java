package com.airport.service;

import java.util.List;
import java.util.Optional;

import com.airport.pojo.Booking;

public interface BookingService {

	List<Booking> getBooking();

	Booking addBooking(Booking booking);

	Booking updateBooking(Booking booking);

	void deleteBooking(long bookingId);

	Optional<Booking> getBookingById(int bookingId);
	
}
