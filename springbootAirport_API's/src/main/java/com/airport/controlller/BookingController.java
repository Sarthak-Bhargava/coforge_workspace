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

import com.airport.pojo.Booking;
import com.airport.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/addBooking")
	Booking addBookingDetails(@RequestBody Booking booking) {

		return this.bookingService.addBooking(booking);

	}
	@GetMapping("/bookingList")
	public List<Booking> getBooking() {
		return this.bookingService.getBooking();
		
	}
	
	@DeleteMapping("/bookings/{bookingCode}")
	public void deleteBookingByCode(@PathVariable int bookingCode) {
		this.bookingService.deleteBooking(bookingCode);
	}
	
	@PutMapping("bookings/{bookingCode}")
	public Booking updateOfBookingById(@PathVariable Booking booking) {
		return this.bookingService.updateBooking(booking);
		
	}
	
	@GetMapping("/bookingList/{bookingCode}")
	public Optional<Booking> getBookingByCode(@PathVariable int bookingCode) {
		return this.bookingService.getBookingById(bookingCode);
}
}
