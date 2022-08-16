package com.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.model.VendorFlight;

public interface VendorFlightRepository extends JpaRepository<VendorFlight, Long>{

}
