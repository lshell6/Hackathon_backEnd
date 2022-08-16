package com.springboot.backend.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String source;
	@Column
	private String destination;
	@Column
	private LocalDate departureDate;
	@Column
	private LocalDate arrivalDate;
	@Column
	private String departureTime;
	@Column
	private String arrivalTime;
	@Column
	private String duration;
	@Column(columnDefinition="double default 0.0")
	private double adultFare;
	@Column(columnDefinition="double default 0.0")
	private double childFare;
	@Column(columnDefinition="integer default 0")
	private int seats;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Flight(Long id, String source, String destination, LocalDate departureDate, LocalDate arrivalDate,
			String departureTime, String arrivalTime, String duration, double adultFare, double childFare, int seats) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.adultFare = adultFare;
		this.childFare = childFare;
		this.seats = seats;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public double getAdultFare() {
		return adultFare;
	}
	public void setAdultFare(double adultFare) {
		this.adultFare = adultFare;
	}
	public double getChildFare() {
		return childFare;
	}
	public void setChildFare(double childFare) {
		this.childFare = childFare;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", source=" + source + ", destination=" + destination + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", duration=" + duration + ", adultFare=" + adultFare + ", childFare=" + childFare
				+ ", seats=" + seats + "]";
	}
	
}
