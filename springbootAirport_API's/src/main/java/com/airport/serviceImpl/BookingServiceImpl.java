package com.airport.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.airport.pojo.Booking;
import com.airport.repositary.BookingRepository;
import com.airport.service.BookingService;

public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingRepository booking_reposRepository;
	
	@Override
	public List<Booking> getBooking() {
		
		return booking_reposRepository.findAll();
	}

	@Override
	public Booking addBooking(Booking booking) {
		
		return booking_reposRepository.save(booking);
	}

	@Override
	public Booking updateBooking(Booking booking) {
		booking_reposRepository.save(booking);
		return booking;
	}

	

	@Override
	public void deleteBooking(long bookingId) {
		Booking booking = booking_reposRepository.getById(bookingId);
		booking_reposRepository.save(booking);
		
	}
	
	@Override
	public Optional<Booking> getBookingById(int bookingId) {
		
		return this.booking_reposRepository.findById((long) bookingId);
	}

}
