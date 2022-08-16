package com.springboot.backend.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.backend.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{
	@Query("select f from Flight f where f.destination = ?1")
	List<Flight> getFlightsByDestination(String destination);
	@Query("select f from Flight f where f.source=?1")
	List<Flight> getFlightsBySource(String source);
	@Query("select f from Flight f where f.departureDate=?1")
	List<Flight> getFlightsByDepartureDate(LocalDate departureDate);
	@Query("select f from Flight f")
	List<String> getAllFlights();
}
