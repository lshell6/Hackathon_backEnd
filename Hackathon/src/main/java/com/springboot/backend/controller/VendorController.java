package com.springboot.backend.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.model.Flight;
import com.springboot.backend.model.Vendor;
import com.springboot.backend.repository.FlightRepository;
import com.springboot.backend.repository.VendorRepository;

@RestController
public class VendorController {
	@Autowired
	private VendorRepository vendorRepository;
	
	@PostMapping("/vendor")
	public Vendor saveVender(@RequestBody Vendor v) {
		return vendorRepository.save(v);
	}
	
	@GetMapping("/vendor")
	public List<Vendor> getllVendors(){
		return vendorRepository.getAllVendors();
	}
}
