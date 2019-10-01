package com.lpms.service;

import java.util.List;

import com.lpms.model.Batch;
import com.lpms.model.Mentor;
import com.lpms.model.Venue;

public interface AdminService 
{
	public String addMentor(Mentor m);
	public String addVenue(Venue v);
	public Batch allocateVenue(Batch b);
	public List<Batch> getBatchRecords();
	public List<Batch> getNotAllocBatchRecords();
	public List<Venue> viewVenue();
	
}
