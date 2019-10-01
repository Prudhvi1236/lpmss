package com.lpms.service;
import java.util.List;

import com.lpms.dao.BatchDao;
import com.lpms.dao.BatchDaoImp;
import com.lpms.dao.MentorDao;
import com.lpms.dao.MentorDaoImp;
import com.lpms.dao.VenueDao;
import com.lpms.dao.VenueDaoImp;
import com.lpms.model.Batch;
import com.lpms.model.Mentor;
import com.lpms.model.Venue;

public class AdminServiceImp implements AdminService 
{
	private  MentorDao md = new MentorDaoImp();
	private VenueDao vd = new VenueDaoImp();
	private BatchDao bd = new BatchDaoImp();
		
	@Override
	public String addMentor(Mentor m) 
	{
			 return md.addMentor(m);
	}

	@Override
	public String addVenue(Venue v)
	{
		return vd.addVenue(v);
		
	}

	@Override
	public Batch allocateVenue(Batch b)
	{
		return bd.allocateVenue(b);
	}

	@Override
	public List<Batch> getBatchRecords() {
		
		return bd.getBatchRecords();
	}

	@Override
	public List<Venue> viewVenue()
	{
		return vd.viewVenue();
	}

	@Override
	public List<Batch> getNotAllocBatchRecords() 
	{
		return bd.getNotAllocBatchRecords();
	}


}
