package com.lpms.dao;

import java.util.List;

import com.lpms.model.Mentor;

public interface MentorDao
{
		
	public String addMentor(Mentor m);
	public String validateMentorLogin(Mentor loginBean);
	public List<Mentor> viewMentor();
	public Mentor findById(String eId);
	
	

}
