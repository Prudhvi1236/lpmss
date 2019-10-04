package com.lpms.dao;

import java.util.List;

import com.lpms.model.LP;
import com.lpms.model.Module;

public interface ModuleDao 
{
	String createModule(Module mo);
	public List<Module> viewModule(String batchId);
	List<Module> viewMentorModule(String batchId);

}
