package com.lpms.service;

import com.lpms.model.Batch;
import com.lpms.model.LP;
import com.lpms.model.Mentor;
import com.lpms.model.Module;

public interface MentorService 
{
	String addLP(LP lp);
	String addBatch(Batch b);
	String createModule(Module mo);
	String validateMentorLogin(Mentor m);
	String batchRecords(Batch b);
	public Batch findByMentorId(String mentorId);
	public Batch deleteBatch(Batch b) ;
	public Mentor findById(String eId);
	public Batch findByMenId(String eId);
}
