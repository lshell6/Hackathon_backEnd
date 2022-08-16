package com.springboot.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Flight flight;
	@Column(columnDefinition="integer default 0")
	private int numAdults;
	@Column(columnDefinition="integer default 0")
	private int numChildren;
	@Column(columnDefinition="integer default 0.00")
	private double totalFare;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long id, Flight flight, int numAdults, int numChildren, double totalFare) {
		super();
		this.id = id;
		this.flight = flight;
		this.numAdults = numAdults;
		this.numChildren = numChildren;
		this.totalFare = totalFare;
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
	public int getNumAdults() {
		return numAdults;
	}
	public void setNumAdults(int numAdults) {
		this.numAdults = numAdults;
	}
	public int getNumChildren() {
		return numChildren;
	}
	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", flight=" + flight + ", numAdults=" + numAdults + ", numChildren=" + numChildren
				+ ", totalFare=" + totalFare + "]";
	}
	
	
}
