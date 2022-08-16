package com.springboot.backend.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.model.Flight;
import com.springboot.backend.repository.FlightRepository;

@RestController
public class FlightController {
	@Autowired
	private FlightRepository flightRepository;
	
	@PostMapping("/flight")
	public Flight saveFlight(@RequestBody Flight f) {
		return flightRepository.save(f);
	}
	
	@GetMapping("/flight")
	public List<String> getAllFlights(){
		return flightRepository.getAllFlights();
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping("/flight/{fid}")
	public Flight getFlightById(@PathVariable("fid") Long fid) {
		return flightRepository.getById(fid);
	}
	
	@GetMapping("/flight/{destination}")
	public List<Flight> getFlightsByDestination(@PathVariable("destination") String destination) {
		return flightRepository.getFlightsByDestination(destination);
	}
	
	@GetMapping("/flight/{source}")
	public List<Flight> getFlightsBySource(@PathVariable("source") String source) {
		return flightRepository.getFlightsBySource(source);
	}
	
	@GetMapping("/flight/{departureDate}")
	public List<Flight> getFlightsByDepartureDate(@PathVariable("departureDate") LocalDate departureDate) {
		return flightRepository.getFlightsByDepartureDate(departureDate);
	}
}
