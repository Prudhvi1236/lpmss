package com.lpms.dao;

import java.util.List;

import com.lpms.model.Venue;

public interface VenueDao 
{
	public String addVenue(Venue v);

	public List<Venue> viewVenue();
	

}
