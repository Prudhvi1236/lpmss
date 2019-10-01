package com.lpms.model;

public class Batch {
	
	private String batchId;
	private String batchCourse;
	private String eId;
	private int venueId;
	private int batchCapacity;
	
	
	Venue venue ;
	

	public Batch() {
		super();
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public int getBatchCapacity() {
		return batchCapacity;
	}
	public void setBatchCapacity(int batchCapacity) {
		this.batchCapacity = batchCapacity;
	}
	
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchCourse() {
		return batchCourse;
	}
	public void setBatchCourse(String batchCourse) {
		this.batchCourse = batchCourse;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	
}
