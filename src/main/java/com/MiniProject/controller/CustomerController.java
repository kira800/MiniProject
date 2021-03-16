package com.MiniProject.controller;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProject.exception.ResourceNotFoundException;
import com.MiniProject.models.Customer;


import com.MiniProject.daos.CustomerRepository;
import com.MiniProject.models.Customer;
@RestController
@RequestMapping("/details")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/addCustomer")
	@Transactional
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	@GetMapping("/customer/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "customerId") long cust_id)
			throws ResourceNotFoundException {
		Customer customer = customerRepository.findById(cust_id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " +cust_id));
		return ResponseEntity.ok().body(customer);
	}

	
      @DeleteMapping("/customers/{customerId}")
	public Map<String, Boolean> deleteCustomer(@PathVariable(value ="customerId") Long cust_id)
			throws ResourceNotFoundException {
		Customer customer = customerRepository.findById(cust_id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + cust_id));

		 customerRepository.delete(customer);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
      }
}