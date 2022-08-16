package com.springboot.backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.model.Flight;
import com.springboot.backend.model.Vendor;
import com.springboot.backend.model.VendorFlight;
import com.springboot.backend.repository.FlightRepository;
import com.springboot.backend.repository.VendorFlightRepository;
import com.springboot.backend.repository.VendorRepository;

@RestController
public class VendorFlightController {
	@Autowired
	private VendorFlightRepository vendorFlightRepository;
	@Autowired
	private VendorRepository vendorRepository;
	@Autowired
	private FlightRepository flightRepository;
	
	@PostMapping("/vendor/slight/{vid}/{fid}")
	public VendorFlight purchaseApi(
			@PathVariable("vid") Long vid, 
			@PathVariable("fid") Long fid,
			@RequestBody VendorFlight vf) {
		Optional<Vendor> optionalV = vendorRepository.findById(vid);
		if(!optionalV.isPresent())
			throw new RuntimeException("invlid vendor id given");
		Optional<Flight> optionalF = flightRepository.findById(fid);
		if(!optionalF.isPresent())
			throw new RuntimeException("invlid flight id given");
		Vendor v = optionalV.get();
		Flight f = optionalF.get();
		vf.setVendor(v);
		vf.setFlight(f);
		return vendorFlightRepository.save(vf);
	}
}
