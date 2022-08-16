package com.springboot.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Vendor_Flights")
public class VendorFlight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Flight flight;
	@OneToOne
	private Vendor vendor;
	public VendorFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VendorFlight(Long id, Flight flight, Vendor vendor) {
		super();
		this.id = id;
		this.flight = flight;
		this.vendor = vendor;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	@Override
	public String toString() {
		return "VendorFlight [id=" + id + ", flight=" + flight + ", vendor=" + vendor + "]";
	}
	
}
