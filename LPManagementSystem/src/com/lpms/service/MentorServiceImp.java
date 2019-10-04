package com.lpms.service;

import java.util.List;

import com.lpms.dao.BatchDao;
import com.lpms.dao.BatchDaoImp;
import com.lpms.dao.LPDao;


import com.lpms.dao.LPDaoImp;
import com.lpms.dao.MentorDao;
import com.lpms.dao.MentorDaoImp;
import com.lpms.dao.ModuleDao;
import com.lpms.dao.ModuleDaoImp;
import com.lpms.model.Batch;
import com.lpms.model.LP;
import com.lpms.model.Mentor;
import com.lpms.model.Module;

public class MentorServiceImp implements MentorService
{
	private LPDao lpd = new LPDaoImp();
	private ModuleDao mod = new ModuleDaoImp();
	private MentorDao md = new MentorDaoImp();
	private BatchDao bd = new BatchDaoImp();
	
	@Override
	public String addLP(LP lp) 
	{
		 return lpd.addLP(lp);
	}
	
	@Override
	public String createModule(Module mo) 
	{
		return mod.createModule(mo);
	}

	@Override
	public String validateMentorLogin(Mentor m) {
		return md.validateMentorLogin(m);
	}

	@Override
	public String addBatch(Batch b) {
			return bd.addBatch(b);
	}

	@Override
	public String batchRecords(Batch b) {
		return bd.batchRecords(b);
	}

	@Override
	public Batch findByMentorId(String mentorId) {
		// TODO Auto-generated method stub
		return bd.findByMentorId(mentorId);
	}

	@Override
	public boolean deleteBatch(Batch b) {
		
		return bd.deleteBatch(b);
	}

	@Override
	public Mentor findById(String eId) {
		
		return md.findById(eId);
	}

	@Override
	public Batch findByMenId(String eId) {
		
		return bd.findByMenId(eId);
	}

	@Override
	public List<Module> viewMentorModule(String batchId) {
		// TODO Auto-generated method stub
		return mod.viewMentorModule(batchId);
	}
	

	
	

	
  	

}
