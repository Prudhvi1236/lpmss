package com.lpms.model;

public class Venue 
{
	@Override
	public String toString() {
		return "Venue [venueId=" + venueId + ", venueAddress=" + venueAddress
				+ ", capacity=" + capacity + "]";
	}

	private int venueId;
	private String venueAddress;
	private int capacity;
	
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String getVenueAddress() {
		return venueAddress;
	}
	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Venue(int venueId, String venueAddress, int capacity)
	{
		super();
		this.venueId = venueId;
		this.venueAddress = venueAddress;
		this.capacity = capacity;
	}
	
	public Venue()
	{
		
	}
}
