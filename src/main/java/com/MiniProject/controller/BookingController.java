package com.MiniProject.controller;
import com.MiniProject.models.*;
import com.MiniProject.exception.*;
import com.MiniProject.daos.*;
import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProject.exception.ResourceNotFoundException;


	//@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	@RequestMapping("/Bookings")
	@CrossOrigin(origins = "http://localhost:4200")
	public class BookingController {
		@Autowired
		private BookingRepository bookingRepository;
		
		
		@PostMapping("/booking")
		@Transactional
		public Booking createBooking(@RequestBody Booking booking) {
			return bookingRepository.save(booking);
		}
			
		  @GetMapping("/allbooking")
		public List<Booking> getAllBooking() {
		return bookingRepository.findAll();
		}

			@GetMapping("/findbooking/{id}")
			public ResponseEntity<Booking> getBookingById(@PathVariable(value = "id") Long id)
				throws ResourceNotFoundException {
				Booking booking=bookingRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Booking not found for this id :: " + id));
				return ResponseEntity.ok().body(booking);
				}
			

			/**  @DeleteMapping("/delbooking/{id}")
				public Map<String, Boolean> deleteBooking(@PathVariable(value ="customerId") Long id)
						throws ResourceNotFoundException {
					Booking booking = bookingRepository.findById(id)
							.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + id));

					 bookingRepository.delete(booking);
					Map<String, Boolean> response = new HashMap<>();
					response.put("deleted", Boolean.TRUE);
					return response;
			}


**/
	
}
