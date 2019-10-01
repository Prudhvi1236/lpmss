package com.lpms.dao;



import java.util.List;

import com.lpms.model.Batch;
import com.lpms.model.Module;

public interface BatchDao 
{
	public String addBatch(Batch b);

	public Batch allocateVenue(Batch b);
	List <Batch> getBatchRecords();
	List <Batch> getNotAllocBatchRecords();
	public String batchRecords(Batch b);
	Batch findByBatchId(String batchId);
	Batch findByMentorId(String mentorId);
	public Batch deleteBatch(Batch b);

	Batch findByMenId(String eId);
	
}
