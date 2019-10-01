package com.lpms.service;

import java.util.List;

import com.lpms.model.Batch;
import com.lpms.model.LP;
import com.lpms.model.Module;

public interface LPService
{
	String validateLPLogin(LP lp);
	
	public void viewVenue(LP lp);
	public LP findById(String eId);
	LP updateProfile(LP emp);
	public List<Module> viewModule(String batchId);
	public Batch findByBatchId(String batchId);
}
