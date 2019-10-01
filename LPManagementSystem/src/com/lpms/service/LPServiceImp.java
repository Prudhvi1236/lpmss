package com.lpms.service;

import java.util.List;

import com.lpms.dao.BatchDao;
import com.lpms.dao.BatchDaoImp;
import com.lpms.dao.LPDao;
import com.lpms.dao.LPDaoImp;
import com.lpms.dao.ModuleDao;
import com.lpms.dao.ModuleDaoImp;
import com.lpms.model.Batch;
import com.lpms.model.LP;
import com.lpms.model.Module;

public class LPServiceImp implements LPService {

	private LPDao ld= new LPDaoImp();
	private ModuleDao moduledao= new ModuleDaoImp();
	private BatchDao batchdao = new BatchDaoImp();
	@Override
		public void viewVenue(LP lp)
	{
		
	}

	@Override
	public String validateLPLogin(LP lp) {
		
		return ld.validateLPLogin(lp);
	}

	@Override
	public LP findById(String eId) {
	return ld.findById(eId);
	}

	@Override
	public LP updateProfile(LP emp) {
		return ld.updateProfile(emp);
		
	}

	@Override
	public List<Module> viewModule(String batchId) {
		
		return moduledao.viewModule(batchId);
	}

	@Override
	public Batch findByBatchId(String batchId) {
		// TODO Auto-generated method stub
		return batchdao.findByBatchId(batchId);
	}

}
